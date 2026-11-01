# Kotlin Design Pattern Exercise: Template Method Pattern

Behavioral Pattern

## Problem: Data Processing Pipeline

### Scenario

You are developing a data processing system that imports data from different file formats.

The system needs to support:

- CSV files
- JSON files
- XML files

Although each file format has its own implementation details, the overall processing workflow is the same.

Every file must go through these steps:

1. Read Data – Read the file contents.
2. Parse Data – Convert the raw contents into structured data.
3. Validate Data – Check whether the data is valid.
4. Save Data – Store the processed data.
5. Log Completion – Print a completion message.

The order of these steps must never change.

However, each file format has different implementations for reading, parsing, and validating data.

## Your task

Implement this system using the Template Method Pattern.

### Requirements

1. Create an abstract class

Create an abstract class called `DataProcessor`.

It should define the main processing algorithm in a method called:

```
fun process()
```

This method must execute all five steps in the correct order.

2. Define abstract methods

The following operations must be implemented by subclasses:

```
abstract fun readData()
abstract fun parseData()
abstract fun validateData()
```

3. Define common operations

The following operations should have default implementations in the base class:

```
fun saveData()
fun logCompletion()
```

4. Create concrete implementations

Implement three subclasses:

- `CsvDataProcessor`
- `JsonDataProcessor`
- `XmlDataProcessor`

Each subclass must provide its own implementation of the abstract operations.

5. Test your implementation

Create a `main()` function that:

- Creates one instance of each processor.
- Calls `process()` on each instance.
- Demonstrates that the processing sequence remains consistent across all three formats.

## Expected output

Your output should look similar to this:

```
=== CSV Processing ===
Reading CSV file...
Parsing CSV data...
Validating CSV data...
Saving data...
Processing completed!

=== JSON Processing ===
Reading JSON file...
Parsing JSON data...
Validating JSON data...
Saving data...
Processing completed!

=== XML Processing ===
Reading XML file...
Parsing XML data...
Validating XML data...
Saving data...
Processing completed!
```

## Bonus challenges

After completing the basic exercise, try these challenges:

1. Hook method: Add an optional `beforeSave()` method that subclasses can override. It should do nothing by default.
2. Final method: Prevent subclasses from overriding `process()`. How can Kotlin help you enforce this?
3. Open/closed principle: Add a new `YamlDataProcessor` without modifying the existing `DataProcessor` class.
4. Validation failure: What happens if `validateData()` throws an exception? Should `saveData()` still execute?
  Modify your implementation to ensure invalid data is never saved.

## Learning objectives

By completing this exercise, you should understand:

- How the Template Method Pattern defines an algorithm's skeleton.
- How inheritance allows subclasses to customize individual steps.
- The difference between abstract methods, concrete methods, and hook methods.
- How Kotlin's `abstract`, `open`, and `final` keywords support this pattern.