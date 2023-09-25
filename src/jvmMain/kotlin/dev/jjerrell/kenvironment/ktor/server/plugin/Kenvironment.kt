package dev.jjerrell.kenvironment.ktor.server.plugin

import dev.jjerrell.kenvironment.ktor.server.plugin.extensions.setupBenchmarkingIfEnabled
import io.ktor.server.application.*

val Kenvironment = createApplicationPlugin(
    name = "DataTransformationPlugin",
    createConfiguration = ::KenvironmentServerConfig
) {
    setupBenchmarkingIfEnabled()
}