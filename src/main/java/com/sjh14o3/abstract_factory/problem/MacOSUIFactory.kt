package com.sjh14o3.abstract_factory.problem

class MacOSUIFactory: IUIFactory {

    override fun createButton(): IButton {
        return MacOSButton()
    }

    override fun createCheckbox(): ICheckbox {
        return MacOSCheckbox()
    }
}