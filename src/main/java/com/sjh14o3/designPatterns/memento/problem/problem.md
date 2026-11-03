# Design Patterns Challenge: Memento Pattern

Behavioral Design Pattern

## Problem: Text Editor with Undo Functionality

### Scenario

You are developing a simple text editor.
Users can write text, modify it, and undo their previous changes.

Your task is to implement the Memento Design Pattern to provide
undo functionality without exposing the internal state of
the text editor.

### Requirements

Implement the following functionality:

1. Users can write text into the editor.
2. Users can save the current editor state.
3. Users can undo their last change.
4. Users can undo multiple changes, one at a time.
5. If there are no saved states to restore, undo should do nothing.
6. The editor's internal state must not be directly
  accessible to the history manager.

## Expected Classes

You should implement these three classes:

### 1. Editor (Originator)

Responsible for managing the text.

Responsibilities:

- Store the current text.
- Provide a method to modify the text.
- Create a memento containing its current state.
- Restore its state from a memento.

Suggested methods:

```
public class Editor {
    public void write(String text);

    public String getText();

    public EditorMemento save();

    public void restore(EditorMemento memento);
}
```

### 2. EditorMemento (Memento)

Responsible for storing a snapshot of the editor's state.

Requirements:

- Store the editor's text.
- Make the stored state immutable.
- Prevent external classes from modifying the snapshot.

### 3. EditorHistory (Caretaker)

Responsible for managing saved states.

Responsibilities:

- Maintain a collection of mementos.
- Save editor snapshots.
- Restore the previous snapshot when undo is requested.
- Never access or modify the internal contents of a memento.

Suggested methods:

```
public class EditorHistory {
    public void save(Editor editor);

    public void undo(Editor editor);
}
```

## Example execution

Your implementation should produce the following behavior:

```
Editor editor = new Editor();
EditorHistory history = new EditorHistory();

editor.write("Hello");
history.save(editor);

editor.write("Hello World");
history.save(editor);

editor.write("Hello World!");

System.out.println(editor.getText());
// Hello World!

history.undo(editor);

System.out.println(editor.getText());
// Hello World

history.undo(editor);

System.out.println(editor.getText());
// Hello

history.undo(editor);

System.out.println(editor.getText());
// Hello
```

## Your tasks

Before writing the code, think about these questions:

1. Why should `EditorHistory` store `EditorMemento` objects instead of storing strings directly?
2. Why should the memento's constructor be private or package-private?
3. Why shouldn't `EditorHistory` have access to the editor's internal text?
4. What is the difference between the Originator and Caretaker?
5. Why is the Memento pattern useful for implementing undo functionality?

## Constraints
- Use `ArrayList` or `Stack` to manage history.
- Do not use external libraries.
- Follow encapsulation principles.
- Implement the pattern yourself rather than using built-in undo functionality.