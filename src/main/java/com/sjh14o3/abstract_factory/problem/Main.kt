package com.sjh14o3.abstract_factory.problem

fun main() {
    val windowsApp = Application(WindowsUIFactory(), "Windows")
    val macApp = Application(MacOSUIFactory(), "macOS")
    val linuxApp = Application(LinuxUIFactory(), "Linux")

    windowsApp.start()
    println()
    macApp.start()
    println()
    linuxApp.start()
}