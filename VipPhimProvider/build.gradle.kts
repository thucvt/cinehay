dependencies {
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("com.google.code.gson:gson:2.9.0")



}
// use an integer for version numbers
version = 1


cloudstream {
    // All of these properties are optional, you can safely remove them

    description = "Nguồn từ HHPanda"
    authors = listOf("HaiGH-Space")

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 1

    tvTypes = listOf("Movie","Anime")

    requiresResources = true
    language = "vi"

    // random cc logo i found
    iconUrl = "https://hhpanda.cx/static/favicon.png"
}

android {
    buildFeatures {
        viewBinding = true
    }
}
