import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner input=new Scanner(System.in)){
            System.out.println("Enter 5 numbers into linked list");
            LinkedList<Integer> ll=new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                ll.add(input.nextInt());
            }
            printingDouble(ll);
        }
    }

    private static void printingDouble(LinkedList<Integer> ll) {
        for (Integer integer : ll) {
            System.out.println(2*integer);
        }
    }
}