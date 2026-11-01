package com.sjh14o3.designPatterns.templateMethod.problem

class XmlDataProcessor: DataProcessor() {
    override fun readData() {
        println("Reading XML file...")
    }

    override fun parseData() {
        println("Parsing XML data...")
    }

    override fun validateData() {
        println("Validating XML data...")
    }
}