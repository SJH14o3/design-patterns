package com.sjh14o3.chain_of_responsibility.customer_support

import com.sjh14o3.chain_of_responsibility.customer_support.handlers.FirstLevelSupport
import com.sjh14o3.chain_of_responsibility.customer_support.handlers.Manager
import com.sjh14o3.chain_of_responsibility.customer_support.handlers.SeniorSupport
import com.sjh14o3.chain_of_responsibility.customer_support.handlers.TechnicalSupport

fun main() {
    val handler4 = Manager(null, setOf(TicketType.SECURITY_BREACH))
    val handler3 = SeniorSupport(handler4, setOf(TicketType.SYSTEM_OUTAGE))
    val handler2 = TechnicalSupport(handler3, setOf(TicketType.DATABASE_ERROR))
    val handler1 = FirstLevelSupport(handler2, setOf(TicketType.PASSWORD_RESET))

    val ticket1 = SupportTicket(Priority.LOW, "ticket 1", "John", TicketType.PASSWORD_RESET)
    val ticket2 = SupportTicket(Priority.MEDIUM, "ticket 2", "Mary", TicketType.DATABASE_ERROR)
    val ticket3 = SupportTicket(Priority.HIGH, "ticket 3", "Lisa", TicketType.SYSTEM_OUTAGE)
    val ticket4 = SupportTicket(Priority.CRITICAL, "ticket 4", "Bob", TicketType.SECURITY_BREACH)

    handler1.handle(ticket1)
    handler1.handle(ticket2)
    handler1.handle(ticket3)
    handler1.handle(ticket4)
}