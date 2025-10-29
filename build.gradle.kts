plugins {
    kotlin("jvm") version "2.2.20"
}

group = "unica.ds4h.miage.donati"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
    runtimeOnly("org.slf4j:slf4j-nop:2.0.7")
    implementation("dev.shreyaspatil.generativeai:generativeai-google:0.9.0-1.1.0")
    //plus maintenu pat Google
    //implementation("com.google.ai.client.generativeai:generativeai:0.9.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}