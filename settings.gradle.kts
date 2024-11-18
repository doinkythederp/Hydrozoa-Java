plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "vex-java-project"

includeBuild("gradle-plugin")

include("vex-sdk")

include("examples:clawbot")
findProject(":examples:clawbot")?.name = "clawbot"
include("examples:clawbot-kotlin")
findProject(":examples:clawbot-kotlin")?.name = "clawbot-kotlin"
