package com.awesome.dsa.stack;

import java.util.Stack;

public class TextEditor {
    private Stack<String> actions;
    private StringBuilder text;

    public TextEditor() {
        actions = new Stack<>();
        text = new StringBuilder();
    }

    public void type(String word) {
        actions.push(word);
        text.append(word);
    }

    public void undo() {
        if (!actions.isEmpty()) {
            String lastAction = actions.pop();
            text.setLength(text.length() - lastAction.length());
        }
    }

    public String getText() {
        return text.toString();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.type("Hello");
        editor.type(" World");
        System.out.println("Text: " + editor.getText()); // Output: Hello World

        editor.undo();
        System.out.println("After undo: " + editor.getText()); // Output: Hello
    }
}
