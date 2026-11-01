package com.sjh14o3.designPatterns.abstractFactory.problem

class MacOSUIFactory: com.sjh14o3.designPatterns.abstractFactory.problem.IUIFactory {

    override fun createButton(): com.sjh14o3.designPatterns.abstractFactory.problem.IButton {
        return com.sjh14o3.designPatterns.abstractFactory.problem.MacOSButton()
    }

    override fun createCheckbox(): com.sjh14o3.designPatterns.abstractFactory.problem.ICheckbox {
        return com.sjh14o3.designPatterns.abstractFactory.problem.MacOSCheckbox()
    }
}