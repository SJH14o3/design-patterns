package com.sjh14o3.abstract_factory.problem

class WindowsUIFactory: IUIFactory {

    override fun createButton(): IButton {
        return WindowsButton()
    }

    override fun createCheckbox(): ICheckbox {
        return WindowsCheckbox()
    }
}