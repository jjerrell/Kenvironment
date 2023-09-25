package dev.jjerrell.kenvironment.ktor

import io.ktor.util.logging.*
import org.slf4j.Marker

object DefaultLogger : Logger {
    var level: Level = Level.INFO

    override fun getName(): String = "Default"

    override fun isTraceEnabled(): Boolean = level == Level.TRACE
    override fun isTraceEnabled(marker: Marker?): Boolean = isTraceEnabled()

    override fun isDebugEnabled(): Boolean = level == Level.DEBUG
    override fun isDebugEnabled(marker: Marker?): Boolean = isDebugEnabled()

    override fun isInfoEnabled(): Boolean = level == Level.INFO
    override fun isInfoEnabled(marker: Marker?): Boolean = isInfoEnabled()

    override fun isWarnEnabled(): Boolean = level == Level.WARN
    override fun isWarnEnabled(marker: Marker?): Boolean = isWarnEnabled()

    override fun isErrorEnabled(): Boolean = level == Level.ERROR
    override fun isErrorEnabled(marker: Marker?): Boolean = isErrorEnabled()

    //region TRACE
    override fun trace(msg: String?) {
        logRecord(msg)
    }

    override fun trace(format: String?, arg: Any?) {
        logRecord(format, arg)
    }

    override fun trace(format: String?, arg1: Any?, arg2: Any?) {
        logRecord(format, arg1, arg2)
    }

    override fun trace(format: String?, vararg arguments: Any?) {
        logRecord(format, *arguments)
    }

    override fun trace(msg: String?, t: Throwable?) {
        logRecord(msg, t)
    }

    override fun trace(marker: Marker?, msg: String?) {
        logRecord(marker, msg)
    }

    override fun trace(marker: Marker?, format: String?, arg: Any?) {
        logRecord(marker, format, arg)
    }

    override fun trace(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        logRecord(marker, format, arg1, arg2)
    }

    override fun trace(marker: Marker?, format: String?, vararg argArray: Any?) {
        logRecord(marker, format, *argArray)
    }

    override fun trace(marker: Marker?, msg: String?, t: Throwable?) {
        logRecord(marker, msg, t)
    }
    //endregion
    //region DEBUG
    override fun debug(msg: String?) {
        logRecord(msg)
    }

    override fun debug(format: String?, arg: Any?) {
        logRecord(format, arg)
    }

    override fun debug(format: String?, arg1: Any?, arg2: Any?) {
        logRecord(format, arg1, arg2)
    }

    override fun debug(format: String?, vararg arguments: Any?) {
        logRecord(format, *arguments)
    }

    override fun debug(msg: String?, t: Throwable?) {
        logRecord(msg, t)
    }

    override fun debug(marker: Marker?, msg: String?) {
        logRecord(marker, msg)
    }

    override fun debug(marker: Marker?, format: String?, arg: Any?) {
        logRecord(marker, format, arg)
    }

    override fun debug(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        logRecord(marker, format, arg1, arg2)
    }

    override fun debug(marker: Marker?, format: String?, vararg arguments: Any?) {
        logRecord(marker, format, *arguments)
    }

    override fun debug(marker: Marker?, msg: String?, t: Throwable?) {
        logRecord(marker, msg, t)
    }
    //endregion
    //region INFO
    override fun info(msg: String?) {
        logRecord(msg)
    }

    override fun info(format: String?, arg: Any?) {
        logRecord(format, arg)
    }

    override fun info(format: String?, arg1: Any?, arg2: Any?) {
        logRecord(format, arg1, arg2)
    }

    override fun info(format: String?, vararg arguments: Any?) {
        logRecord(format, *arguments)
    }

    override fun info(msg: String?, t: Throwable?) {
        logRecord(msg, t)
    }

    override fun info(marker: Marker?, msg: String?) {
        logRecord(marker, msg)
    }

    override fun info(marker: Marker?, format: String?, arg: Any?) {
        logRecord(marker, format, arg)
    }

    override fun info(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        logRecord(marker, format, arg1, arg2)
    }

    override fun info(marker: Marker?, format: String?, vararg arguments: Any?) {
        logRecord(marker, format, *arguments)
    }

    override fun info(marker: Marker?, msg: String?, t: Throwable?) {
        logRecord(marker, msg, t)
    }
    //endregion
    //region WARN
    override fun warn(msg: String?) {
        logRecord(msg)
    }

    override fun warn(format: String?, arg: Any?) {
        logRecord(format, arg)
    }

    override fun warn(format: String?, vararg arguments: Any?) {
        logRecord(format, *arguments)
    }

    override fun warn(format: String?, arg1: Any?, arg2: Any?) {
        logRecord(format, arg1, arg2)
    }

    override fun warn(msg: String?, t: Throwable?) {
        logRecord(msg, t)
    }

    override fun warn(marker: Marker?, msg: String?) {
        logRecord(marker, msg)
    }

    override fun warn(marker: Marker?, format: String?, arg: Any?) {
        logRecord(marker, format, arg)
    }

    override fun warn(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        logRecord(marker, format, arg1, arg2)
    }

    override fun warn(marker: Marker?, format: String?, vararg arguments: Any?) {
        logRecord(marker, format, *arguments)
    }

    override fun warn(marker: Marker?, msg: String?, t: Throwable?) {
        logRecord(marker, msg, t)
    }
    //endregion
    //region ERROR
    override fun error(msg: String?) {
        logRecord(msg)
    }

    override fun error(format: String?, arg: Any?) {
        logRecord(format, arg)
    }

    override fun error(format: String?, arg1: Any?, arg2: Any?) {
        logRecord(format, arg1, arg2)
    }

    override fun error(format: String?, vararg arguments: Any?) {
        logRecord(format, *arguments)
    }

    override fun error(msg: String?, t: Throwable?) {
        logRecord(msg, t)
    }

    override fun error(marker: Marker?, msg: String?) {
        logRecord(marker, msg)
    }

    override fun error(marker: Marker?, format: String?, arg: Any?) {
        logRecord(marker, format, arg)
    }

    override fun error(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        logRecord(marker, format, arg1, arg2)
    }

    override fun error(marker: Marker?, format: String?, vararg arguments: Any?) {
        logRecord(marker, format, *arguments)
    }

    override fun error(marker: Marker?, msg: String?, t: Throwable?) {
        logRecord(marker, msg, t)
    }
    //endregion
    //region Base logging methods
    private fun logRecord(msg: String?) {
        if (level.isEnabled && msg != null) {
            println(msg)
        }
    }

    private fun logRecord(format: String?, arg: Any?) {
        if (level.isEnabled && format != null) {
            println(String.format(format, arg))
        }
    }

    private fun logRecord(format: String?, arg1: Any?, arg2: Any?) {
        if (level.isEnabled && format != null) {
            println(String.format(format, arg1, arg2))
        }
    }

    private fun logRecord(format: String?, vararg arguments: Any?) {
        if (level.isEnabled && format != null) {
            println(String.format(format, arguments))
        }
    }

    private fun logRecord(msg: String?, t: Throwable?) {
        if (level.isEnabled) {
            buildString {
                msg?.let { message ->
                    appendLine("Primary message: $message")
                }
                t?.let { exception ->
                    exception.message?.let { message ->
                        appendLine("Thrown message: $message")
                    }
                    appendLine("Stack trace: ${exception.stackTraceToString()}")
                }
            }.takeUnless { it.isBlank() }?.let { traceString ->
                print(traceString)
            }
        }
    }

    private fun logRecord(marker: Marker?, msg: String?) {
        if (level.isEnabled) {
            marker?.let { println("Marker: $it") }
            logRecord(msg)
        }
    }

    private fun logRecord(marker: Marker?, format: String?, arg: Any?) {
        if (level.isEnabled) {
            marker?.let { println("Marker: $it") }
            logRecord(format, arg)
        }
    }

    private fun logRecord(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        if (level.isEnabled) {
            marker?.let { println("Marker: $it") }
            logRecord(format, arg1, arg2)
        }
    }

    private fun logRecord(marker: Marker?, format: String?, vararg arguments: Any?) {
        if (level.isEnabled) {
            marker?.let { println("Marker: $it") }
            logRecord(format, *arguments)
        }
    }

    private fun logRecord(marker: Marker?, msg: String?, t: Throwable?) {
        if (level.isEnabled) {
            marker?.let { println("Marker: $it") }
            logRecord(msg, t)
        }
    }
    //endregion

    enum class Level {
        TRACE, DEBUG, INFO, WARN, ERROR;

        val isEnabled: Boolean
            get() = when (this) {
                TRACE -> isTraceEnabled()
                DEBUG -> isDebugEnabled()
                INFO -> isInfoEnabled()
                WARN -> isWarnEnabled()
                ERROR -> isErrorEnabled()
            }
    }
}