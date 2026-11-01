package com.sjh14o3.designPatterns.chainOfResponsibility.customerSupport

class SupportTicket(val priority: Priority, val message: String, val customerName: String, val type: TicketType)