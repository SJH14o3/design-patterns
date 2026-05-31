package com.sjh14o3.mediator.chatroom

import java.util.*

class ApplicationMediator: Mediator {
    private val colleagues = ArrayList<Colleague>()
    override fun sendMessage(message: String, colleague: Colleague) {
        for (other in colleagues) {
            if (other != colleague) {
                other.receive(message)
            }
        }
    }

    fun addColleague(colleague: Colleague) {
        colleagues.add(colleague)
    }

}