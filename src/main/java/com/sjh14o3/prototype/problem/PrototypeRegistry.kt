package com.sjh14o3.prototype.problem

import java.time.LocalDate

object PrototypeRegistry {
    private val prototypes = mutableMapOf<String, DocumentPrototype>()

    init {
        prototypes["resume"] = Resume(
            metaData = mutableListOf("template", "professional"),
            title = "Software Engineer Resume",
            author = "Alice Johnson",
            email = "alice@example.com",
            phone = "+1-555-0101",
            summary = "Software engineer with 5 years of experience.",
            skills = listOf("Kotlin", "Java", "Spring Boot"),
            experience = listOf("Software Engineer at TechCorp"),
            education = listOf("BSc Computer Science"),
            font = "Arial",
            fontSize = 12
        )

        prototypes["invoice"] = Invoice(
            metaData = mutableListOf("paid", "online"),
            invoiceNumber = "INV-1001",
            customerName = "Acme Corporation",
            customerAddress = "123 Main Street",
            customerEmail = "billing@acme.com",
            issueDate = LocalDate.of(2026, 8, 1),
            dueDate = LocalDate.of(2026, 8, 31),
            items = listOf(
                "Website Development",
                "Database Configuration",
                "Deployment"
            ),
            subtotal = 2500.00,
            tax = 250.00,
            total = 2750.00,
            currency = "USD",
            notes = "Thank you for your business."
        )

        prototypes["report"] = Report(
            metaData = mutableListOf("internal", "quarterly"),
            title = "Q2 Engineering Report",
            author = "Alice Johnson",
            department = "Engineering",
            date = LocalDate.of(2026, 6, 30),
            summary = "Summary of engineering activities during Q2.",
            sections = listOf(
                "Introduction",
                "Completed Projects",
                "Challenges",
                "Future Plans"
            ),
            references = listOf(
                "Engineering Roadmap",
                "Project Management Report"
            ),
            font = "Arial",
            fontSize = 12,
            pageSize = 30
        )
    }

    fun get(name: String): DocumentPrototype {
        return prototypes[name]
            ?: throw IllegalArgumentException("Unknown prototype: $name")
    }
}