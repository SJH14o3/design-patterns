package com.sjh14o3.designPatterns.abstractFactory.problem

class Application(
    private val factory: com.sjh14o3.designPatterns.abstractFactory.problem.IUIFactory,
    private val platformName: String
) {
    fun start() {
        println("Application started with $platformName UI")

        val button = factory.createButton()
        val checkbox = factory.createCheckbox()

        button.render()
        checkbox.render()
    }
}