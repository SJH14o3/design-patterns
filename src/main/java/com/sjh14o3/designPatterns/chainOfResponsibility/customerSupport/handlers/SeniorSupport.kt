package com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport.handlers

import com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport.Priority
import com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport.SupportTicket
import com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport.TicketType

class SeniorSupport(nextHandler: SupportHandler?, supportedTickets: Set<TicketType>) : SupportHandler(nextHandler,
    supportedTickets) {
    override fun canHandle(ticket: SupportTicket): Boolean {
        return ticket.priority == Priority.HIGH && ticket.type in supportedTickets
    }

    override fun process(ticket: SupportTicket) {
        println("Senior Support handled the ticket.")
    }
}