package com.sjh14o3.designPatterns.abstractFactory.problem

interface IUIFactory {

    fun createButton(): com.sjh14o3.designPatterns.abstractFactory.problem.IButton

    fun createCheckbox(): com.sjh14o3.designPatterns.abstractFactory.problem.ICheckbox
}