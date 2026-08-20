package com.sjh14o3.chain_of_responsibility.customer_support.handlers

import com.sjh14o3.chain_of_responsibility.customer_support.SupportTicket
import com.sjh14o3.chain_of_responsibility.customer_support.TicketType

abstract class SupportHandler(protected val nextHandler: SupportHandler?,
                              protected val supportedTickets: Set<TicketType>) {
    protected abstract fun canHandle(ticket: SupportTicket): Boolean

    fun handle(ticket: SupportTicket) {
        if (canHandle(ticket)) {
            process(ticket)
        } else {
            nextHandler?.handle(ticket)
                ?: println("No handler available")
        }
    }

    protected abstract fun process(ticket: SupportTicket)
}