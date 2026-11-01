package com.sjh14o3.designPatterns.templateMethod.problem

abstract class DataProcessor {
    fun process() { // final by default
        try {
            readData()
            parseData()
            validateData()
            beforeSave()
            saveData()
            logCompletion()
        } catch (e: Exception) {
            println(e.message)
        }
    }

    protected abstract fun readData()
    protected abstract fun parseData()
    protected abstract fun validateData()

    protected open fun beforeSave() {
        // optional method
    }

    private fun saveData() {
        println("Saving data...")
    }
    private fun logCompletion() {
        println("Processing completed!")
    }
}