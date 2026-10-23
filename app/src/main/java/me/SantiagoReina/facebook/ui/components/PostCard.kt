package me.SantiagoReina.facebook.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

/**
 * Tarjeta de publicación de Facebook que incluye encabezado, texto,
 * imagen cargada con la librería Coil, estadísticas y botones de acción.
 */
@Composable
fun PostCard(
    modifier: Modifier = Modifier,
    imageUrl: String = "https://picsum.photos/800/500"
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        PostHeader()

        Text(
            text = "Por fin termine la pantalla de login de compose!!!!",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
        )

        // Imagen cargada desde internet utilizando la librería Coil
        AsyncImage(
            model = imageUrl,
            contentDescription = "Imagen de la publicación",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )

        Spacer(modifier = Modifier.height(4.dp))

        PostStats()

        PostActions()
    }
}

@Preview(showBackground = true)
@Composable
fun PostCardPreview() {
    MaterialTheme {
        PostCard()
    }
}
