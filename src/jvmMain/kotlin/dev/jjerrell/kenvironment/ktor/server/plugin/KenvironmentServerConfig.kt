package dev.jjerrell.kenvironment.ktor.server.plugin

import dev.jjerrell.kenvironment.ConfigOption
import dev.jjerrell.kenvironment.ConfigOptionKey
import dev.jjerrell.kenvironment.ktor.DefaultLogger
import dev.jjerrell.kenvironment.ktor.server.plugin.KenvironmentServerConfig.Extras.benchmarking
import dev.jjerrell.kenvironment.ktor.server.plugin.KenvironmentServerConfig.Extras.benchmarkingDefaultValue
import dev.jjerrell.kenvironment.Kenvironment as KenvironmentImpl
import io.ktor.util.logging.*

class KenvironmentServerConfig internal constructor() : KenvironmentImpl() {
    var logger: Logger = DefaultLogger

    init {
        this.put(benchmarking, benchmarkingDefaultValue)
    }

    fun setLogLevel(level: DefaultLogger.Level) {
        (logger as? DefaultLogger)?.level = level
    }

    fun setBenchmarking(enabled: Boolean) {
        this[benchmarking] = ConfigOption(true)
    }

    object Extras {
        val benchmarking = ConfigOptionKey("Benchmark")

        internal val benchmarkingDefaultValue = ConfigOption(false)
    }
}
