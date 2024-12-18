import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // Creating a StringTokenizer instance
        StringTokenizer st = new StringTokenizer("Java is fun to learn", " ");

        // 1. Count tokens
        System.out.println("Total tokens: " + st.countTokens());

        // 2. Iterating through tokens using hasMoreTokens() and nextToken()
        System.out.println("Tokens:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // Using a different delimiter
        StringTokenizer st2 = new StringTokenizer("Apple,Orange,Banana,Grapes", ",");

        // 3. Iterating through tokens
        System.out.println("\nTokens with ',' as a delimiter:");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        // Checking if more tokens are available
        System.out.println("Has more tokens? " + st2.hasMoreTokens());
    }
}
