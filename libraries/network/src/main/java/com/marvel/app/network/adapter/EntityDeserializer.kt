package com.marvel.app.network.adapter

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.marvel.app.network.base.Entity
import com.marvel.app.network.model.Comic
import com.marvel.app.network.model.Character
import java.lang.reflect.Type

class EntityDeserializer : JsonDeserializer<Entity> {
    override fun deserialize(
        json: JsonElement,
        typeOfT: Type,
        context: JsonDeserializationContext
    ): Entity {
        val entity = json.asJsonObject
        return when {
            entity.get("digitalId") != null -> context.deserialize<Comic>(
                json,
                Comic::class.java
            )
            else -> context.deserialize<Character>(json, Character::class.java)
        }
    }
}
