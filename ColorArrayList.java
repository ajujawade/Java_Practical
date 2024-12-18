import java.util.ArrayList;
import java.util.Scanner;

public class ColorArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many Colors you want to enter ? ");
        int num = sc.nextInt();
        sc.nextLine();

        ArrayList<String> colors = new ArrayList<>();

        for (int i = 1; i <= num; i++){
            System.out.println("Enter Color " + i + " : " );
            String color = sc.nextLine();
            colors.add(color);
        }

        System.out.print("Colors in ArrayList : ");
        for (String color : colors){
            System.out.print(color + " ");
        }

    }
}
