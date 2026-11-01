package com.sjh14o3.designPatterns.templateMethod.problem

fun main() {
    val csvProcessor = CsvDataProcessor()
    val jsonProcessor = JsonDataProcessor()
    val xmlProcessor = XmlDataProcessor()
    val yamlProcessor = YamlDataProcessor()

    println("=== CSV Processing ===")
    csvProcessor.process()
    println()

    println("=== Json Processing ===")
    jsonProcessor.process()
    println()

    println("=== XML Processing ===")
    xmlProcessor.process()
    println()

    println("=== Yaml Processing ===")
    yamlProcessor.process()
    println()
}