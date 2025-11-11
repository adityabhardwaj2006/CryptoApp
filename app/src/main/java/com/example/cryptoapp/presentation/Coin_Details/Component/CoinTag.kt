package com.example.cryptoapp.presentation.Coin_Details.Component

import android.graphics.Paint
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cryptoapp.data.Remote.Dto.Tag

@Composable
fun CoinTag(tag: String) {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0xFF00C853),
                shape = RoundedCornerShape(50.dp)
            )
            .padding(horizontal = 12.dp, vertical = 6.dp)
    ) {
        Text(
            text = tag,
            color = Color(0xFF00C853),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
