// MethodDemo.java
// This program demonstrates method creation and invocation in Java.

public class MethodDemo {
    
    // Create the greet Method
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // Create the printMessage Method
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Main method to call methods
    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is my message!"); // Calling printMessage method
    }
}
