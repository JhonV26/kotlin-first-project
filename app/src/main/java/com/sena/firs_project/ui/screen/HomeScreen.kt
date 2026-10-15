package com.sena.firs_project.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firs_project.ui.section.BottomSection
import com.sena.firs_project.ui.section.CenterSection
import com.sena.firs_project.ui.section.TopSection

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    // 1️⃣ SCAFFOLD
    Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
        // 2️⃣ SURFACE
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            color = Color(0xFFD3C4C4)
        ) {
            Box(modifier = Modifier.fillMaxSize()) {


                Text(
                    text = "Surface",
                    fontSize = 12.sp,
                    color = Color.DarkGray,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(4.dp)
                )


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TopSection()
                    CenterSection(modifier = Modifier.weight(1f))
                    BottomSection()
                }
            }
        }
    }
}