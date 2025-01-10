plugins {
    id("org.jetbrains.kotlin.android")
}
android {
    defaultConfig {

        minSdk = 26 // Cập nhật lên 26 hoặc cao hơn
        
    }
}
dependencies {
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("com.google.code.gson:gson:2.9.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.5")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.5")
    implementation("androidx.fragment:fragment-ktx:1.5.6")
}
// use an integer for version numbers
version = 1


cloudstream {
    // All of these properties are optional, you can safely remove them

    description = "Nguồn từ phimmoichill"
    authors = listOf("HaiGH-Space")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1

    tvTypes = listOf("Movie")

    requiresResources = true
    language = "vi"

    // random cc logo i found
    iconUrl = "https://phimmoichillv.net/favicon.ico"
}

android {
    buildFeatures {
        viewBinding = true
    }
}
