# Flyweight Design Pattern — Text Editor

## Problem

You are developing a simple text editor. A document can contain millions of characters.

Each character is represented by an object with the following properties:

* Character value (`A`, `B`, `C`, etc.)
* Font family
* Font size
* Font color
* Bold/italic information

For example:

```text
H → Arial, 14, Black, Bold
e → Arial, 14, Black, Normal
l → Arial, 14, Black, Normal
l → Arial, 14, Black, Normal
o → Arial, 14, Black, Normal
```

The current implementation creates a **new Character object for every character** in the document.

If a document contains 10 million characters, this can result in millions of objects consuming a large amount of memory.

### Your Task

Redesign the system using the **Flyweight Design Pattern**.

Your solution should:

1. Identify which data should be **intrinsic state** and which should be **extrinsic state**.
2. Create a Flyweight object that stores the shared intrinsic state.
3. Create a Flyweight Factory responsible for reusing existing Flyweight objects.
4. Represent the document without creating a unique formatting object for every character.
5. Explain how your solution reduces memory consumption.

### Example

Suppose the document contains:

```text
Hello Hello Hello
```

and all characters use:

```text
Font: Arial
Size: 14
Color: Black
```

Instead of creating separate formatting objects for every character, your design should reuse the same shared Flyweight wherever possible.

### Questions

**1.** What is the intrinsic state of a character?

**2.** What is the extrinsic state?

**3.** What class would act as the Flyweight?

**4.** What class would act as the Flyweight Factory?

**5.** How would the document store the position of each character?

**6.** Why does the Flyweight pattern make sense for this problem?

**7.** Implement your solution in your preferred programming language.

### Bonus Challenge

Assume the document contains:

```text
10,000,000 characters
```

but only:

```text
26 different characters
5 font families
4 font sizes
8 colors
2 text styles
```

Estimate how many shared Flyweight objects might be needed in the worst case, and compare that with creating one object per character.

## Learning Goal

After solving this problem, you should be able to recognize situations where:

> **A large number of objects share the same state, and that shared state can be extracted and reused.**

This is the key idea behind the **Flyweight Design Pattern**.

## Bonus Answer Result
Assuming the implementation created here, the answer is **5\*4\*8\*4=640**  
If the characters themselves were part of flyweight object, then the answer will be 
**26\*5\*4\*8\*4=16,640**