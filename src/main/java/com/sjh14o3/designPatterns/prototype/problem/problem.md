# Prototype Design Pattern — Learning Problem

**Difficulty:** Intermediate
**Goal:** Practice the **Prototype Design Pattern** by cloning existing objects instead of constructing them from scratch.

### Problem: Document Template Cloning

You are building a document-management system. Users can create documents such as:

* `Resume`
* `Report`
* `Invoice`

Creating these documents from scratch is expensive because each document may contain complex formatting, sections, metadata, and configuration.

The system frequently needs to create a new document that is **almost identical to an existing document**, with only a few properties changed.

For example:

```text
Original Resume
 ├── title: "Software Engineer Resume"
 ├── author: "Alice"
 ├── font: "Arial"
 ├── fontSize: 12
 ├── sections: [Education, Experience, Skills]
 └── metadata: {...}

             ↓ clone()

New Resume
 ├── title: "Software Engineer Resume"
 ├── author: "Bob"          ← changed
 ├── font: "Arial"
 ├── fontSize: 12
 ├── sections: [Education, Experience, Skills]
 └── metadata: {...}
```

### Your Task

Design a solution using the **Prototype Design Pattern**.

Your implementation should:

1. Define a common `DocumentPrototype` interface or abstract class.
2. Provide a `clone()` operation.
3. Implement at least three concrete prototypes:

    * `Resume`
    * `Report`
    * `Invoice`
4. Ensure that cloning creates a **new object**, not another reference to the original.
5. Demonstrate that modifying the cloned document does **not** modify the original.
6. Include at least one **nested mutable object** (for example, a list of sections) and ensure your
implementation handles it correctly.

Here are the variables each document needs:
### 1. Resume
* `title`
* `author`
* `email`
* `phone`
* `summary`
* `skills`
* `experience`
* `education`
* `font`
* `fontSize`
* `metadata`

### 2. Report
* `title`
* `author`
* `department`
* `date`
* `summary`
* `sections`
* `references`
* `font`
* `fontSize`
* `pageSize`
* `metadata`

### 3. Invoice
* `invoiceNumber`
* `customerName`
* `customerAddress`
* `customerEmail`
* `issueDate`
* `dueDate`
* `items`
* `subtotal`
* `tax`
* `total`
* `currency`
* `notes`
* `metadata`

### Example Usage

The intended usage should look conceptually like:

```text
resume1 = prototypeRegistry.get("resume")
resume2 = resume1.clone()

resume2.author = "Bob"

print(resume1.author)  // Alice
print(resume2.author)  // Bob
```