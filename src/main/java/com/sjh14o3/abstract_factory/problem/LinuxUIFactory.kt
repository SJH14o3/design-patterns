package com.sjh14o3.abstract_factory.problem

class LinuxUIFactory: IUIFactory {

    override fun createButton(): IButton {
        return LinuxButton()
    }

    override fun createCheckbox(): ICheckbox {
        return LinuxCheckbox()
    }
}