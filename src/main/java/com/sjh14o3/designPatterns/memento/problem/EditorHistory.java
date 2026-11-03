package com.sjh14o3.designPatterns.memento.problem;

import java.util.Stack;

public class EditorHistory {
    private final Stack<EditorMemento> history = new Stack<>();

    public void save(Editor editor) {
        history.push(editor.save());
    }

    public void undo(Editor editor) {
        if (history.isEmpty()) return; // nothing to undo
        EditorMemento memento = history.pop();
        editor.restore(memento);
    }
}