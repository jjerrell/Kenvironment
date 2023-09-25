# MVP

A lightweight KVP-based object (in Java terms) which can be initialized through environment variables pulled from the
host system, varargs received from a JVM invocation, or custom written plugins which conform to the lifecycle and scope
of the system. It should also applicable for use as a Ktor server and client plugin.

### Problem One - Lifecycle

The lifecycle of an Android application is simple and straightforward; we can directly hook into it under many scenarios.
iOS falls into a similar category here. Native (i.e. Mac, Windows, Linux), JVM, and JS applications live under different
paradigms.

In any case, we should be able to expect a creation and destruction operation. Platforms will be free to work with the
system through any other lifecycle event which they recognize.

For Ktor: https://ktor.io/docs/custom-plugins.html#call-handling
Client: https://ktor.io/docs/client-custom-plugins.html#plugin-configuration

### Problem Two - Design for Customization

Build with plugin support in mind. You should be able to create plugins for this framework in addition to be able to use
it as a plugin.

### Problem Three - Receiving and Reading Values

Different platforms will have different approaches and limitations in some cases.

### Problem Four - Ktor Plugin

Closely ties in with Problem Two. The capabilities of this utility should be highly supportive of the Ktor plugin system,
and it should be possible to initialize and fully configure the utility within the client or server initialization sequence
as with any other plugin.