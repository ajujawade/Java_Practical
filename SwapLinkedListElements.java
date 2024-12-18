import java.util.*;

public class SwapLinkedListElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> number = new LinkedList<>();

        System.out.println("Enter No. of Elements in Linked List: ");
        int num = sc.nextInt();
        System.out.println("Enter Elements of Linked List: ");
        for (int i = 0; i < num; number.add(sc.nextInt()), i++);

        System.out.println("Original Linked List: " + number);

        System.out.println("Enter indices to swap: ");
        int index1 = sc.nextInt(), index2 = sc.nextInt();

        if (index1 >= 0 && index1 < number.size() && index2 >= 0 && index2 < number.size()) {
            int temp = number.get(index1);
            number.set(index1, number.get(index2));
            number.set(index2, temp);
            System.out.println("Linked List After Swapping: " + number);
        } else {
            System.out.println("Invalid Index!");
        }
    }
}
