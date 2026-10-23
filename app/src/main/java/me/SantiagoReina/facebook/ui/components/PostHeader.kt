package me.SantiagoReina.facebook.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Composable sin estado (stateless) para el encabezado de publicación (PostHeader)
 * de una ubicación en la aplicación de Facebook.
 *
 * @param modifier Modificador para personalizar el diseño externo.
 * @param locationName Nombre de la ubicación.
 * @param activationTime Hora de activación o estado de la ubicación.
 * @param onMoreOptionsClick Callback para el evento de clic en el botón de tres puntos.
 */
@Composable
fun PostHeader(
    modifier: Modifier = Modifier,
    locationName: String = "Parque Lleras, Medellín",
    activationTime: String = "Activo hace 15 min",
    onMoreOptionsClick: () -> Unit = {}
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        // Icono de la ubicación dentro de un contenedor circular
        Surface(
            shape = CircleShape,
            color = MaterialTheme.colorScheme.primaryContainer,
            modifier = Modifier.size(40.dp)
        ) {
            Box(contentAlignment = Alignment.Center) {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "Icono de ubicación",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }

        Spacer(modifier = Modifier.width(12.dp))

        // Columna con el nombre de la ubicación y la hora de activación
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = locationName,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = activationTime,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        // Icono de los 3 puntos (opciones) a la parte derecha
        IconButton(onClick = onMoreOptionsClick) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "Más opciones",
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostHeaderPreview() {
    MaterialTheme {
        PostHeader()
    }
}
