object Dependencies {
    object Compose {
        val ui by lazy { "androidx.compose.ui:${Versions.ui}" }
        val uiGraphics by lazy { "androidx.compose.ui:${Versions.uiGraphics}" }
        val material by lazy { "androidx.compose.material:material:${Versions.material}" }
        val composeBOM by lazy { "androidx.compose:compose-bom:${Versions.composeBOM}" }


        val composeJUnit by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.composeJUnit}" }
        val composeUITooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.composeUITooling}" }
        val composeManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.composeManifest}" }
    }

    object Json {
        val gson by lazy { "com.google.code.gson:gson:${Versions.gson}" }
    }

    object Android {
        val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }

    }

    object Navigation {
        val nabigationRuntimeKtx by lazy {
            "androidx.navigation:navigation-runtime-ktx:${Versions.nabigationRuntimeKtx}"
        }
    }

    object Lifecycle {
        val lifecycle by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}" }
        val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    }

    object Test {
        val jUnit by lazy { "junit:junit:${Versions.jUnit}" }
        val androidJUnit = "androidx.test.ext:junit:${Versions.androidJUnit}"
        val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }

    object Detekt {
        const val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.22.0-RC2"
    }
}
