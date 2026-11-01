package com.sjh14o3.designPatterns.abstractFactory.problem

class WindowsUIFactory: com.sjh14o3.designPatterns.abstractFactory.problem.IUIFactory {

    override fun createButton(): com.sjh14o3.designPatterns.abstractFactory.problem.IButton {
        return com.sjh14o3.designPatterns.abstractFactory.problem.WindowsButton()
    }

    override fun createCheckbox(): com.sjh14o3.designPatterns.abstractFactory.problem.ICheckbox {
        return com.sjh14o3.designPatterns.abstractFactory.problem.WindowsCheckbox()
    }
}