package com.br.gamedatabase.ui.components

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.gamedatabase.R
import com.br.gamedatabase.ui.theme.GameDatabaseTheme

@Composable
fun Pill(
    modifier: Modifier = Modifier,
    text: String
) {
    Box(
        modifier = Modifier.width(126.dp)
            .height(48.dp)
            .background(color = Color(0xFFF2F2F), shape = RoundedCornerShape(30.dp))
            .border(
                border = BorderStroke(2.dp, Color(0xFF434343)),
                shape = RoundedCornerShape(30.dp)
            ),
        contentAlignment = Alignment.Center,
        content = {
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier.size(26.dp),
                    painter = painterResource(R.drawable.ic_default_category),
                    contentDescription = "icone",
                )
                Text(
                    modifier = Modifier,
                    text = text,
                    color = Color.White,
                    fontSize = 16.sp,
                    fontFamily = poppisSemiBold
                )
            }

        }
    )
}

val poppisSemiBold = FontFamily(
    Font(R.font.poppinssemibold)
)

@Preview
@Composable
private fun PillPreview() {
    GameDatabaseTheme {
        Pill(text = "Action!")
    }
}