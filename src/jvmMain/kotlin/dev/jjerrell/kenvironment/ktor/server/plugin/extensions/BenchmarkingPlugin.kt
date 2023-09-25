package dev.jjerrell.kenvironment.ktor.server.plugin.extensions

import dev.jjerrell.kenvironment.ktor.server.plugin.KenvironmentServerConfig
import io.ktor.server.application.*
import io.ktor.util.*

internal fun PluginBuilder<KenvironmentServerConfig>.setupBenchmarkingIfEnabled() {
    if (pluginConfig[KenvironmentServerConfig.Extras.benchmarking]?.value == true) {
        val key = AttributeKey<Long>("onCallTimeKey")
        onCall { call ->
            val onCallTime = System.currentTimeMillis()
            call.attributes.put(key, onCallTime)
        }
        onCallReceive { call ->
            val onCallTime = call.attributes[key]
            val onCallReceiveTime = System.currentTimeMillis()
            pluginConfig.logger.trace("Read body delay (ms): ${onCallReceiveTime - onCallTime}")
        }
    }
}