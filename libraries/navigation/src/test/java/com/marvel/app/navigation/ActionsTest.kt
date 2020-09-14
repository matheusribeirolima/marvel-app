package com.marvel.app.navigation

import android.content.Context
import android.content.Intent
import com.marvel.app.navigation.Actions.openDetailIntent
import com.marvel.app.navigation.Actions.openHomeIntent
import com.marvel.navigation.R
import io.mockk.*
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ActionsTest {

    private val context = mockk<Context>(relaxed = true)
    private val actionSlot = slot<Int>()

    @Before
    fun setUp() {
        mockkConstructor(Intent::class)

        every { anyConstructed<Intent>().setPackage(any()) } returns Intent()
    }

    @After
    fun tearDown() {
        unmockkConstructor(Intent::class)
    }

    @Test
    fun `openHomeIntent should create intent with openHome resource action`() {
        // Given
        val actionValue = "open.marvel.home"
        every { context.getString(capture(actionSlot)) } returns actionValue

        // When
        openHomeIntent(context)

        // Then
        assertEquals(R.string.openHome, actionSlot.captured)
    }

    @Test
    fun `openDetailIntent should create intent with openDetail resource action`() {
        // Given
        val actionValue = "open.marvel.detail"
        every { context.getString(capture(actionSlot)) } returns actionValue

        // When
        openDetailIntent(context)

        // Then
        assertEquals(R.string.openDetail, actionSlot.captured)
    }
}
