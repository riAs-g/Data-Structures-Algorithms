package LinkedLists;

import java.util.Scanner;

public class AddTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n, num1 = scanner.nextInt();
        List list1 = new List();
        while (num1 > 0) {
            n = num1 % 10;
            list1.insertFirst(n);
            num1 = num1 / 10;
        }
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        List list2 = new List();
        while (num2 > 0) {
            n = num2 % 10;
            list2.insertFirst(n);
            num2 = num2 / 10;
        }
        System.out.println(addLists(list1, list2));
        scanner.close();
    }

    private static long addLists(List list1, List list2) {
        long sum = 0, k = 1;
        while (list1.head != null && list2.head != null) {
            sum += (list1.head.data + list2.head.data) * k;
            k *= 10;
            list1.head = list1.head.next;
            list2.head = list2.head.next;
        }
        while (list1.head != null) {
            sum += (list1.head.data) * k;
            k *= 10;
            list1.head = list1.head.next;
        }
        while (list2.head != null) {
            sum += (list2.head.data) * k;
            k *= 10;
            list2.head = list2.head.next;
        }
        return sum;
    }
}
