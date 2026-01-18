tasks.register("cleanAll") {
    gradle.includedBuilds.forEach { build -> this@register.dependsOn(build.task(":clean")) }
    subprojects.forEach { proj -> this@register.dependsOn(proj.tasks["clean"]) }
}

tasks.register("buildAll") {
    gradle.includedBuilds.forEach { build -> this@register.dependsOn(build.task(":build")) }
    subprojects.forEach { proj -> this@register.dependsOn(proj.tasks["build"]) }
}

tasks.register("testAll") {
    gradle.includedBuilds.forEach { build -> this@register.dependsOn(build.task(":test")) }
    subprojects.forEach { proj -> this@register.dependsOn(proj.tasks["test"]) }
}