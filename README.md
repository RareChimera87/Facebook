<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:1877f2,100:42b72a&height=190&section=header&text=Facebook&fontSize=46&fontColor=ffffff&fontAlignY=36&desc=Red%20social%20para%20Android%20%C2%B7%20Kotlin%20%2B%20Jetpack%20Compose&descAlignY=58&descSize=16" alt="header"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white"/>
  <img src="https://img.shields.io/badge/Jetpack_Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white"/>
  <img src="https://img.shields.io/badge/Firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=black"/>
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/status-en%20desarrollo-orange?style=flat-square"/>
  <img src="https://img.shields.io/badge/min%20SDK-24-blue?style=flat-square"/>
  <img src="https://img.shields.io/badge/UNAB-Tecnologías%20Móviles-8957e5?style=flat-square"/>
</p>

---

## 📱 ¿Qué es?

Una red social para Android inspirada en Facebook, hecha como proyecto de la materia **Tecnologías Móviles** en la UNAB. Permite registrarse, publicar, reaccionar, comentar y agregar amigos, todo con una interfaz moderna construida 100% en Jetpack Compose.

> ⚠️ Proyecto académico sin fines comerciales. No está afiliado ni respaldado por Meta.

## ✨ Funcionalidades

| | Funcionalidad | Descripción |
|---|---|---|
| 🔐 | **Autenticación** | Registro e inicio de sesión con correo y contraseña |
| 📰 | **Feed** | Publicaciones de tus amigos en tiempo real |
| 📝 | **Publicaciones** | Crear posts con texto e imágenes |
| 👍 | **Reacciones** | Me gusta y reacciones en cada publicación |
| 💬 | **Comentarios** | Comentar y responder en los posts |
| 👤 | **Perfil** | Foto, portada, biografía y tus publicaciones |
| 🤝 | **Amigos** | Enviar, aceptar y rechazar solicitudes |
| 🔔 | **Notificaciones** | Aviso cuando alguien reacciona, comenta o te agrega |

## 🛠️ Tecnologías

- **Lenguaje:** Kotlin
- **UI:** Jetpack Compose + Material 3
- **Arquitectura:** MVVM
- **Navegación:** Navigation Compose
- **Backend:** Firebase Authentication, Cloud Firestore y Firebase Storage
- **Imágenes:** Coil
- **Asincronía:** Kotlin Coroutines + Flow

## 🏗️ Arquitectura

```
app/
└── src/main/java/com/proyecto/socialapp/
    ├── data/
    │   ├── model/          # User, Post, Comment, FriendRequest
    │   └── repository/     # Acceso a Firebase
    ├── ui/
    │   ├── auth/           # Login y registro
    │   ├── feed/           # Feed principal
    │   ├── post/           # Crear y ver publicaciones
    │   ├── profile/        # Perfil de usuario
    │   ├── friends/        # Solicitudes y lista de amigos
    │   ├── components/     # Composables reutilizables
    │   └── theme/          # Colores, tipografía, formas
    ├── navigation/         # NavHost y rutas
    └── MainActivity.kt
```

```mermaid
flowchart LR
    UI[Composables] --> VM[ViewModels]
    VM --> R[Repositories]
    R --> FA[Firebase Auth]
    R --> FS[Cloud Firestore]
    R --> ST[Firebase Storage]
```

## 🚀 Cómo correrlo

**Requisitos:** Android Studio (versión reciente), JDK 17 y un proyecto de Firebase.

1. Clona el repo:
   ```bash
   git clone https://github.com/RareChimera87/facebook.git
   ```
2. Crea un proyecto en la [consola de Firebase](https://console.firebase.google.com/), registra la app Android y descarga `google-services.json`.
3. Copia `google-services.json` dentro de la carpeta `app/`.
4. En Firebase, activa **Authentication (correo/contraseña)**, **Firestore** y **Storage**.
5. Abre el proyecto en Android Studio, sincroniza Gradle y dale ▶️ Run.

## 👨‍💻 Autor

<p align="center">
  <img src="./avatar.png" width="200" alt="Santiago Reina"/>
</p>

<h3 align="center">Santiago Reina</h3>

<p align="center">
  Estudiante de Ingeniería de Sistemas en la UNAB · Bucaramanga, Colombia<br/>
  Backend con Python y FastAPI, apasionado por la seguridad en IA.
</p>

<p align="center">
  <a href="https://github.com/RareChimera87"><img src="https://img.shields.io/badge/GitHub-RareChimera87-181717?style=for-the-badge&logo=github&logoColor=white"/></a>
  <a href="mailto:sanctireinadiaz@gmail.com"><img src="https://img.shields.io/badge/Gmail-Contacto-D14836?style=for-the-badge&logo=gmail&logoColor=white"/></a>
</p>

## 🎓 Contexto académico

Proyecto de aula de **Tecnologías Móviles**, Ingeniería de Sistemas, Universidad Autónoma de Bucaramanga (UNAB).

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:42b72a,100:1877f2&height=100&section=footer"/>
</p>
