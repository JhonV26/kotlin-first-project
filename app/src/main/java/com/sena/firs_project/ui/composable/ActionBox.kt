package com.sena.firs_project.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ActionBox(
    modifier: Modifier = Modifier,
    size: Dp = 80.dp,
    color: Color = Color.White
) {
    Box(
        modifier = modifier
            .size(size)
            .background(color, RoundedCornerShape(12.dp))
    )
}