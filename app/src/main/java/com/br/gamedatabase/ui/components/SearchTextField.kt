package com.br.gamedatabase.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.br.gamedatabase.ui.theme.GameDatabaseTheme

@Composable
fun SearchTextField(
    modifier: Modifier = Modifier,
    placeholder: String = "",
    trailingIcon: ImageVector? = null,
    leadingIcon: ImageVector? = null
) {

    OutlinedTextField(
        value = "",
        onValueChange = {

        },
        placeholder = {
            Text(
                text = placeholder
            )
        },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(26.dp),
        colors = TextFieldDefaults.colors(focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White
        ),
        trailingIcon = {
            if(trailingIcon != null) {
                Icon(
                    imageVector = trailingIcon,
                    contentDescription = "filtro"
                )
            }
        },
        leadingIcon = {
            if(leadingIcon != null) {
                Icon(
                    imageVector = leadingIcon,
                    contentDescription = "pesquisar"
                )
            }
        }
    )
}

@Preview
@Composable
private fun SearchTextFieldPreview() {
    GameDatabaseTheme {
        val trailingIcon = Icons.Default.Search
        val leadingIcon = Icons.Default.Menu
        SearchTextField(
            trailingIcon = trailingIcon,
            leadingIcon = leadingIcon
        )
    }
}