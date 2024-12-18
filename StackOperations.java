import java.util.Scanner;

class Stack {
    private int[] arr;
    private int top = -1;
    private int maxSize;

    public Stack(int maxSize) {
        arr = new int[maxSize];
        this.maxSize = maxSize;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int x) {
        if (isFull()) System.out.println("Stack Overflow. Cannot push " + x);
        else arr[++top] = x;
    }

    public int pop() {
        return isEmpty() ? -1 : arr[top--];
    }

    public int peek() {
        return isEmpty() ? -1 : arr[top];
    }

    public void display() {
        if (isEmpty()) System.out.println("Stack is empty.");
        else {
            for (int i = top; i >= 0; i--) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

public class StackOperations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter max size: ");
            Stack stack = new Stack(scanner.nextInt());
            int choice;

            do {
                System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
                System.out.print("Choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter element: ");
                        stack.push(scanner.nextInt());
                    }
                    case 2 -> {
                        int popped = stack.pop();
                        if (popped != -1) System.out.println(popped + " popped.");
                        else System.out.println("Stack Underflow.");
                    }
                    case 3 -> {
                        int topElement = stack.peek();
                        if (topElement != -1) System.out.println(topElement + " is the top element.");
                        else System.out.println("Stack is empty.");
                    }
                    case 4 -> stack.display();
                    case 5 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice.");
                }
            } while (choice != 5);
        }
    }
}
