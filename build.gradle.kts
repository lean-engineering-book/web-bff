val ktorVersion by extra("1.3.2")

plugins {
    kotlin("jvm") version "1.3.71"
}

repositories {
    jcenter()
}

dependencies {
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
}

