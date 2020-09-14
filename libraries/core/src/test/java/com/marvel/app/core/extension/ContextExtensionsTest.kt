package com.marvel.app.core.extension

import android.content.Context
import android.widget.Toast
import com.marvel.app.core.extension.showToast
import io.mockk.*
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ContextExtensionsTest {

    @Before
    fun setUp() {
        mockkStatic(Toast::class)
    }

    @After
    fun tearDown() {
        unmockkStatic(Toast::class)
    }

    @Test
    fun `showToast should call show`() {
        // Given
        val context = mockk<Context>()
        val text = "text"
        val toast = mockk<Toast>(relaxed = true)
        every { Toast.makeText(any(), any<CharSequence>(), any()) } returns toast

        // When
        context.showToast(text)

        // Then
        verify(exactly = 1) { toast.show() }
    }

    @Test
    fun `showToast should call makeText and show with params`() {
        // Given
        val context = mockk<Context>()
        val text = "text"
        val slotText = slot<CharSequence>()
        val slotDuration = slot<Int>()
        val toast = mockk<Toast>(relaxed = true)
        every { Toast.makeText(any(), capture(slotText), capture(slotDuration)) } returns toast

        // When
        context.showToast(text)

        // Then
        assertEquals(text, slotText.captured)
        assertEquals(Toast.LENGTH_SHORT, slotDuration.captured)
    }
}
