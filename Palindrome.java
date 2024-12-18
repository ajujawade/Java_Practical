import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine().toLowerCase();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }

        System.out.println("rev = " + rev);

        if (str.equals(rev)){
            System.out.println(str + " is a Palindrome.");
        }
        else {
            System.out.println(str + " is Not a Palindrome.");
        }

    }

}
