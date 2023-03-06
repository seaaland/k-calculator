plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "net.seaaland.calculator"
version = "beta"

repositories { mavenCentral() }
dependencies {}

kotlin { jvmToolchain(8) }
application { mainClass.set("MainKt") }