val rootProps = file("./gradle.properties").inputStream().use { stream ->
    java.util.Properties().apply { load(stream) }
}

gradle.beforeProject {
    apply(plugin = "idea")
    group = rootProps["project.build.group"] as String
    version = rootProps["project.build.version"] as String

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.release = 11
    }
}

gradle.afterProject {
    tasks.withType<AbstractArchiveTask> {
        isPreserveFileTimestamps = false
        isReproducibleFileOrder = true
    }
}