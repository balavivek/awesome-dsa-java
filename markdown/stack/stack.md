A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. This means that the last element added to the stack is the first one to be removed. Stacks are used in various real-time applications such as undo mechanisms in text editors, backtracking algorithms, and expression evaluation.

### Basic Stack Operations
1. **Push**: Add an element to the top of the stack.
2. **Pop**: Remove the top element from the stack.
3. **Peek**: Retrieve the top element without removing it.
4. **isEmpty**: Check if the stack is empty.

### Example: Undo Mechanism in Text Editors
In a text editor, the undo feature can be implemented using a stack. Each action (like typing a character) is pushed onto the stack. When the user performs an undo operation, the last action is popped from the stack.

#### Implementation
[TextEditor.java](../src/main/java/com/awesome/concepts/stack/TextEditor.java)



### Example: Browser Back Button
A browser's back button can be implemented using two stacks. One stack keeps track of the history of visited pages, and the other stack keeps track of the forward history.

#### Implementation

[Browser.java](../src/main/java/com/awesome/concepts/stack/Browser.java)

These examples demonstrate how stacks can be used in real-time applications to manage actions and navigation history.