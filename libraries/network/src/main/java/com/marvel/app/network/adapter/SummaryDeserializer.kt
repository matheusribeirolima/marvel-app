package com.marvel.app.network.adapter

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.marvel.app.network.base.Summary
import com.marvel.app.network.model.BaseSummary
import com.marvel.app.network.model.RoleSummary
import com.marvel.app.network.model.TypeSummary
import java.lang.reflect.Type

class SummaryDeserializer : JsonDeserializer<Summary> {

    override fun deserialize(
        json: JsonElement,
        typeOfT: Type,
        context: JsonDeserializationContext
    ): Summary {
        val summary = json.asJsonObject
        return when {
            summary.get("type") != null -> context.deserialize<TypeSummary>(
                json,
                TypeSummary::class.java
            )
            summary.get("role") != null -> context.deserialize<RoleSummary>(
                json,
                RoleSummary::class.java
            )
            else -> context.deserialize<BaseSummary>(json, BaseSummary::class.java)
        }
    }
}
