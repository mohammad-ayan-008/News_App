
plugins {
    id("com.android.application")
    //id ("kotlin-kapt")
    id ("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.movieapp"
    compileSdk = 33
    
    defaultConfig {
        applicationId = "com.example.movieapp"
        minSdk = 29
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        
    }
    
}

dependencies {


    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.appcompat:appcompat:1.6.1")

    
    implementation ("io.reactivex.rxjava2:rxjava:2.2.7")
    implementation ("io.reactivex.rxjava2:rxandroid:2.1.1")
    
    implementation ("com.squareup.retrofit2:retrofit:2.7.2")
    implementation ("com.squareup.retrofit2:converter-gson:2.7.2")
  
    implementation ("com.squareup.okhttp3:okhttp:3.6.0")
    implementation("com.jakewharton.rxbinding2:rxbinding:2.0.0")
  
    implementation ("com.squareup.retrofit2:adapter-rxjava2:2.7.2")
    implementation ("com.github.bumptech.glide:glide:4.16.0")


    implementation("com.google.dagger:hilt-android:2.44")
    annotationProcessor ("com.google.dagger:hilt-compiler:2.44")

    
    
}
