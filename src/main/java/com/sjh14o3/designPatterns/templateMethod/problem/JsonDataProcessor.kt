package com.sjh14o3.designPatterns.templateMethod.problem

class JsonDataProcessor: DataProcessor() {
    override fun readData() {
        println("Reading Json file...")
    }

    override fun parseData() {
        println("Parsing Json data...")
    }

    override fun validateData() {
        println("Validating Json data...")
    }
}