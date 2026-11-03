package com.sjh14o3.designPatterns.memento.problem;

public class Main {
    public static void main(String[] args) {
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
    }
}
