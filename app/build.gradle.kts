plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android) // Faltava este para reconhecer arquivos .kt
}

android {
    namespace = "com.example.ifoodgithub"
    compileSdk = 34 // Versão 34 é a mais estável e comum atualmente

    defaultConfig {
        applicationId = "com.example.ifoodgithub"
        minSdk = 24
        targetSdk = 34 // Alinhado com o compileSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
}