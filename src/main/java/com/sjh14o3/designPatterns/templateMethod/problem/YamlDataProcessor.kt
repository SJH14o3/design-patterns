package com.sjh14o3.designPatterns.templateMethod.problem

class YamlDataProcessor: DataProcessor() {
    override fun readData() {
        println("Reading Yaml file...")
    }

    override fun parseData() {
        println("Parsing Yaml data...")
    }

    override fun validateData() {
        println("Validating Yaml data...")
        throw Exception("Validation failed! Processing cancelled.")
    }
}