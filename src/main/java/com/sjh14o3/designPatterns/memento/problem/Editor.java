package com.sjh14o3.designPatterns.memento.problem;

public class Editor {
    private String text = "";

    public String getText() {
        return text;
    }

    public void write(String content) {
        this.text = content;
    }

    public void append(String content) {
        this.text += content;
    }

    public void clear() {
        this.text = "";
    }

    public EditorMemento save() {
        return new EditorMemento(text);
    }

    public void restore(EditorMemento memento) {
        this.text = memento.context();
    }

    public Editor(String content) {
        this.text = content;
    }

    public Editor() {}
}
