package com.awesome.dsa.stack;

import java.util.Stack;

public class Browser {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public Browser() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = "Home";
    }

    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear();
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
        }
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.visit("Page1");
        browser.visit("Page2");
        System.out.println("Current Page: " + browser.getCurrentPage()); // Output: Page2

        browser.back();
        System.out.println("After back: " + browser.getCurrentPage()); // Output: Page1

        browser.forward();
        System.out.println("After forward: " + browser.getCurrentPage()); // Output: Page2
    }
}
