package dev.jjerrell.kenvironment.ktor.client.plugin

import dev.jjerrell.kenvironment.Kenvironment as KenvironmentImpl
import io.ktor.client.plugins.api.*

val Kenvironment = createClientPlugin("Kenvironment", ::KenvironmentImpl) {

}

class KenvironmentClientPlugin private constructor() : KenvironmentImpl() {

}