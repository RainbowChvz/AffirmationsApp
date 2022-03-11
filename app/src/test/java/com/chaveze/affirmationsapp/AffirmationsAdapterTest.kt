package com.chaveze.affirmationsapp

import android.content.Context
import com.chaveze.affirmationsapp.adapter.ItemAdapter
import com.chaveze.affirmationsapp.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTest {

    private val context = mock(Context::class.java)
    val data = listOf(
        Affirmation(R.string.affirmations1, R.drawable.image1),
        Affirmation(R.string.affirmations2, R.drawable.image2)
    )

    @Test
    fun adapter_size() {
        val adapter = ItemAdapter(context, data)

        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}