package com.sjh14o3.chain_of_responsibility.customer_support.handlers

import com.sjh14o3.chain_of_responsibility.customer_support.Priority
import com.sjh14o3.chain_of_responsibility.customer_support.SupportTicket
import com.sjh14o3.chain_of_responsibility.customer_support.TicketType

class Manager(nextHandler: SupportHandler?, supportedTickets: Set<TicketType>) : SupportHandler(nextHandler,
    supportedTickets) {
    override fun canHandle(ticket: SupportTicket): Boolean {
        return ticket.priority == Priority.CRITICAL && ticket.type in supportedTickets
    }

    override fun process(ticket: SupportTicket) {
        println("Manager handled the ticket.")
    }
}