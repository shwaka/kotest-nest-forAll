import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
}

group = "me.shun"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal() // for my fork of kotest
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit"))

    val version = "4.6.2"
    // val version = "5.0.0.419-SNAPSHOT"
    // val version = "5.0.0-LOCAL" // for my fork
    val jvm = "-jvm" // for my fork
    implementation("io.kotest:kotest-runner-junit5$jvm:$version")
    implementation("io.kotest:kotest-assertions-core$jvm:$version")
    // testImplementation("io.kotest:kotest-assertions-shared$jvm:$version")
    // testImplementation("io.kotest:kotest-property$jvm:$version")
    // testImplementation("io.kotest:kotest-assertions-compiler:$version")
    // testImplementation("io.kotest:kotest-framework-datatest:$version")
}

// tasks.test {
//     useJUnit()
// }

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        showStandardStreams = true
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    }
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.register("kc") {
    // alias
    dependsOn("ktlintCheck")
}

tasks.register("kf") {
    // alias
    dependsOn("ktlintFormat")
}
