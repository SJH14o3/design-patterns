package com.sjh14o3.abstract_factory.problem

interface IUIFactory {

    fun createButton(): IButton

    fun createCheckbox(): ICheckbox
}