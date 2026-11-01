package com.sjh14o3.designPatterns.abstractFactory.problem

fun main() {
    val windowsApp = com.sjh14o3.designPatterns.abstractFactory.problem.Application(
        com.sjh14o3.designPatterns.abstractFactory.problem.WindowsUIFactory(),
        "Windows"
    )
    val macApp =
        com.sjh14o3.designPatterns.abstractFactory.problem.Application(
            com.sjh14o3.designPatterns.abstractFactory.problem.MacOSUIFactory(),
            "macOS"
        )
    val linuxApp =
        com.sjh14o3.designPatterns.abstractFactory.problem.Application(
            com.sjh14o3.designPatterns.abstractFactory.problem.LinuxUIFactory(),
            "Linux"
        )

    windowsApp.start()
    println()
    macApp.start()
    println()
    linuxApp.start()
}