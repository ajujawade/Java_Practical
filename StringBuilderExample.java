public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder instance
        StringBuilder sb = new StringBuilder("Hello");

        // 1. Append method
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. Insert method
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // 3. Replace method
        sb.replace(6, 10, "Amazing");
        System.out.println("After replace: " + sb);

        // 4. Delete method
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // 5. Reverse method
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. Length and capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
