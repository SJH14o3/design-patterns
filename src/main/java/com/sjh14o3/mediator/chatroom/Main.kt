package com.sjh14o3.mediator.chatroom

fun main() {
    val mediator = ApplicationMediator()
    val desktop: Colleague = ConcreteColleague(mediator)
    val mobile: Colleague = MobileColleague(mediator)
    val mobile2: Colleague = MobileColleague(mediator)
    mediator.addColleague(desktop)
    mediator.addColleague(mobile)
    mediator.addColleague(mobile2)
    desktop.sendMessage("hi others")
    println("-----")
    mobile2.sendMessage("hi from mobile 2")
}