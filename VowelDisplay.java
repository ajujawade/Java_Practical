import java.util.Scanner;

class VowelDisplayThread extends Thread {

    private String inputString;

    public VowelDisplayThread(String inputString) {
        this.inputString = inputString.toLowerCase();
    }

    @Override
    public void run() {
        System.out.println("Vowels in the string are: ");
        boolean foundVowel = false;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
                foundVowel = true;
            }
        }

        if (!foundVowel) {
            System.out.println("No vowels found in the string.");
        } else {
            System.out.println();
        }
    }
}

public class VowelDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String inputString = sc.nextLine();

        // Check for empty string or null input
        if (inputString.trim().isEmpty()) {
            System.out.println("The input string is empty.");
        } else {
            VowelDisplayThread vowelThread = new VowelDisplayThread(inputString);
            vowelThread.start();
        }

        // Close the scanner
        sc.close();
    }
}
