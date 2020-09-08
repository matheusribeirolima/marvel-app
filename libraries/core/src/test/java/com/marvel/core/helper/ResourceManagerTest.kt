package com.marvel.core.helper

import android.content.Context
import android.content.res.Resources
import androidx.core.content.ContextCompat
import io.mockk.*
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceManagerTest {

    private val context = mockk<Context>(relaxed = true)
    private val resourceManager = ResourceManager(context)

    @Before
    fun setUp() {
        mockkStatic(ContextCompat::class)
    }

    @After
    fun tearDown() {
        unmockkStatic(ContextCompat::class)
    }

    @Test
    fun `getString should call getString from context`() {
        // Given
        val stringRes = 0

        // When
        resourceManager.getString(stringRes)

        // Then
        verify(exactly = 1) { context.getString(stringRes) }
    }

    @Test
    fun `getString should call getString with args from context`() {
        // Given
        val stringRes = 0
        val args = "argument"

        // When
        resourceManager.getString(stringRes, args)

        // Then
        verify(exactly = 1) { context.getString(stringRes, any()) }
    }

    @Test
    fun `getDrawable should call getDrawable from context`() {
        // Given
        val drawableRes = 0
        every { ContextCompat.getDrawable(any(), any()) } returns mockk(relaxed = true)

        // When
        resourceManager.getDrawable(drawableRes)

        // Then
        verify(exactly = 1) { ContextCompat.getDrawable(context, drawableRes) }
    }

    @Test
    fun `getDimension should call getDimension from resources context`() {
        // Given
        val dimensionRes = 0
        val resources = mockk<Resources>(relaxed = true)
        every { context.resources } returns resources

        // When
        resourceManager.getDimension(dimensionRes)

        // Then
        verify(exactly = 1) { resources.getDimension(dimensionRes) }
    }

    @Test
    fun `getDimensionPixelSize should call getDimensionPixelSize from resources context`() {
        // Given
        val dimensionRes = 0
        val resources = mockk<Resources>(relaxed = true)
        every { context.resources } returns resources

        // When
        resourceManager.getDimensionPixelSize(dimensionRes)

        // Then
        verify(exactly = 1) { resources.getDimensionPixelSize(dimensionRes) }
    }

    @Test
    fun `getColor should call getColor from context`() {
        // Given
        val colorRes = 0
        every { ContextCompat.getColor(any(), any()) } returns mockk(relaxed = true)

        // When
        resourceManager.getColor(colorRes)

        // Then
        verify(exactly = 1) { ContextCompat.getColor(context, colorRes) }
    }
}
