package com.sjh14o3.mediator.software_development_team

fun main() {
    val mediator = DevelopmentMediator()
    val developer = Developer("Leon", mediator)
    val qualityEngineer = QualityEngineer("Andrew", mediator)
    val manager = Manager("Lisa", mediator)
    mediator.addShareholder(developer)
    mediator.addShareholder(qualityEngineer)
    mediator.addShareholder(manager)
    developer.commit("Fixed bug #0226")
}