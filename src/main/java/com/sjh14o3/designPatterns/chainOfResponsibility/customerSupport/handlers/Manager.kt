package com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport.handlers

import com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport.Priority
import com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport.SupportTicket
import com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport.TicketType

class Manager(nextHandler: SupportHandler?, supportedTickets: Set<TicketType>) : SupportHandler(nextHandler,
    supportedTickets) {
    override fun canHandle(ticket: SupportTicket): Boolean {
        return ticket.priority == Priority.CRITICAL && ticket.type in supportedTickets
    }

    override fun process(ticket: SupportTicket) {
        println("Manager handled the ticket.")
    }
}