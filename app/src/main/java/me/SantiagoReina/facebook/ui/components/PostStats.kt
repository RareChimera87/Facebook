package me.SantiagoReina.facebook.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.SantiagoReina.facebook.ui.theme.FacebookTextGray

/**
 * Composable sin estado que muestra las estadísticas de una publicación (likes y comentarios).
 *
 * @param modifier Modificador para personalizar el diseño externo.
 * @param likesCount Cantidad de Me gusta.
 * @param commentsCount Cantidad de comentarios.
 */
@Composable
fun PostStats(
    modifier: Modifier = Modifier,
    likesCount: Int = 125,
    commentsCount: Int = 42,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Texto a la izquierda con emoji de pulgar arriba y likes
        Text(
            text = "👍 $likesCount likes",
            fontSize = 13.sp,
            color = FacebookTextGray
        )

        // Texto a la derecha con la cantidad de comentarios
        Text(
            text = "$commentsCount comentarios",
            fontSize = 13.sp,
            color = FacebookTextGray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PostStatsPreview() {
    MaterialTheme {
        PostStats()
    }
}
