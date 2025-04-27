package GFG;
import java.util.Scanner;
import java.util.Stack;

public class HistogramArea {
    public static void main(String[] args) {
        System.out.println("Enter an array");
        int[] arr=new int[7];
        try (Scanner input = new Scanner(System.in))
        {
            for (int i = 0; i < arr.length; i++) {
                arr[i]=input.nextInt();
            }
        }
        System.out.println(greatestArea(arr));
    }

    public static int greatestArea(int[] arr) {
        int area=Integer.MIN_VALUE;
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
                while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                    int tp=s.pop();
                    int curr=arr[tp]*(s.isEmpty()?i:(i-s.peek()-1));
                    area=Math.max(curr,area);
                }
                s.push(i);
            }
            while (!s.isEmpty()){
                int tp=s.pop();
                int curr=arr[tp]*(s.isEmpty()?arr.length:(arr.length-s.peek()-1));
                area=Math.max(curr,area);
            }
        return area;
    }
}