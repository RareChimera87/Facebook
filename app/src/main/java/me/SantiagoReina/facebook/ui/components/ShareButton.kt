package me.SantiagoReina.facebook.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Composable sin estado (stateless) que representa el botón "Compartir" (ShareButton) de Facebook.
 *
 * @param modifier Modificador para personalizar el estilo y diseño exterior.
 * @param text Texto a mostrar al lado derecho del icono (por defecto: "Compartir").
 * @param onClick Evento que se ejecuta al presionar el botón.
 */
@Composable
fun ShareButton(
    modifier: Modifier = Modifier,
    text: String = "Compartir",
    onClick: () -> Unit = {},
) {
    val contentColor = MaterialTheme.colorScheme.onSurfaceVariant

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = modifier
            .clickable(onClick = onClick)
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        Icon(
            imageVector = Icons.Outlined.Share,
            contentDescription = text,
            tint = contentColor
        )
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge,
            color = contentColor
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ShareButtonPreview() {
    MaterialTheme {
        ShareButton()
    }
}
