package com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport.handlers

import com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport.SupportTicket
import com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport.TicketType

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