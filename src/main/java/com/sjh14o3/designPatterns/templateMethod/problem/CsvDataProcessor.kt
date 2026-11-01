package com.sjh14o3.designPatterns.templateMethod.problem

class CsvDataProcessor: DataProcessor() {
    override fun readData() {
        println("Reading CSV file...")
    }

    override fun parseData() {
        println("Parsing CSV data...")
    }

    override fun validateData() {
        println("Validating CSV data...")
    }

    override fun beforeSave() {
        println("Running before saving procedure...")
    }
}