package com.sjh14o3.prototype.problem

import java.time.LocalDate

fun main() {
    val resume1 = PrototypeRegistry.get("resume") as Resume

    val resume2 = resume1.clone()

    resume2.title = "Backend Developer Resume"
    println("${resume1.title} vs ${resume2.title}")

    resume2.metaData.add("academic")
    println("${resume1.metaData} vs ${resume2.metaData}")
    println(resume1 === resume2)
    println(resume1.metaData === resume2.metaData)

    val invoice1 = PrototypeRegistry.get("invoice") as Invoice

    val invoice2 = invoice1.clone()

    invoice2.invoiceNumber = "INV-1002"
    println("${invoice1.invoiceNumber} vs ${invoice2.invoiceNumber}")

    invoice2.issueDate = LocalDate.of(2026, 8, 10)
    println("${invoice1.issueDate} vs ${invoice2.issueDate}")

    val report1 = PrototypeRegistry.get("report") as Report

    val report2 = report1.clone()

    report2.department = "Technology"
    println("${report1.department} vs ${report2.department}")

    report2.sections = listOf("Executive Summary", "Technology Overview", "Major Initiatives", "Conclusion")
    println("${report1.sections} vs ${report2.sections}")
}