package dev.jjerrell.kenvironment

import kotlin.jvm.JvmInline

open class Kenvironment() : AbstractMutableMap<ConfigOptionKey, ConfigOption>() {
    private val items: MutableMap<ConfigOptionKey, ConfigOption> = mutableMapOf()

    override val entries: MutableSet<MutableMap.MutableEntry<ConfigOptionKey, ConfigOption>>
        get() = items.entries

    override fun put(key: ConfigOptionKey, value: ConfigOption): ConfigOption? =
        items.put(key, value)

    operator fun set(key: ConfigOptionKey, value: ConfigOption): ConfigOption? =
        put(key, value)

    companion object : Kenvironment()
}

@JvmInline
value class ConfigOptionKey(val name: String) {
    /**
     * Enables extending the object to form a type-safe Key Value Pair setters
     */
    companion object
}

@JvmInline
value class ConfigOption(val value: Any?) {
    /**
     * Enables extending the object to form a Key Value Pair
     */
    companion object
}