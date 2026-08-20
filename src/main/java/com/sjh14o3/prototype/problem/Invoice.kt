package com.sjh14o3.prototype.problem

import java.time.LocalDate


class Invoice(
    metaData: MutableList<String>,
    var invoiceNumber: String,
    var customerName: String,
    var customerAddress: String,
    var customerEmail: String,
    var issueDate: LocalDate,
    var dueDate: LocalDate,
    var items: List<String>,
    var subtotal: Double,
    var tax: Double,
    var total: Double,
    var currency: String,
    var notes: String
) : DocumentPrototype(metaData) {
    override fun clone(): Invoice {
        return Invoice(metaDataDeepCopy(), this.invoiceNumber, this.customerName, this.customerAddress,
            this.customerEmail, this.issueDate, this.dueDate, this.items, this.subtotal, this.tax, this.total,
            this.currency, this.notes)
    }
}