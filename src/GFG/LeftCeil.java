package GFG;
import java.util.Scanner;
import java.util.TreeSet;

public class LeftCeil {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.println("Enter an array");
            Integer[] arr=new Integer[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=input.nextInt();
            }
            leftCeil(arr);
        }
    }

    private static void leftCeil(Integer[] arr) {
        TreeSet<Integer> tree=new TreeSet<>();
        tree.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (tree.contains(tree.ceiling(arr[i])))
                System.out.println(tree.ceiling(arr[i]));
            else
                System.out.println(-1);
            tree.add(arr[i]);
        }
    }
}