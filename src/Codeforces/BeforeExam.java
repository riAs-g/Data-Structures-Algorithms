package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class BeforeExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Days and Hours: ");
        String[] first  = scanner.nextLine().split(" ");

        int d = Integer.parseInt(first[0]);    //days
        int sumTime = Integer.parseInt(first[1]);

        int[]minArr = new int[d];   //min value also use as the result
        int[]leftArr = new int[d];

        System.out.println("Enter the values for "+d+" number of days serially:");
        for(int i=0;i<d;i++)
        {
            String[] arr = scanner.nextLine().split(" ");
            int min = Integer.parseInt(arr[0]);
            int max = Integer.parseInt(arr[1]);

            sumTime-=min;
            minArr[i] = min;
            leftArr[i] = max-min;
        }

        if(sumTime==0){
            System.out.println("YES");
            System.out.println(String.join(" ", Arrays
                    .stream(minArr)
                    .mapToObj(String::valueOf)
                    .toArray(String[]::new)));
        }
        else if(sumTime<0){
            System.out.println("NO");
        }
        //still need more time
        else{
            for(int i=0;i<d;i++)
            {
                if(sumTime>leftArr[i]){
                    sumTime -= leftArr[i];
                    minArr[i]+=leftArr[i];
                }
                else{
                    minArr[i]+=sumTime;
                    sumTime = 0;
                    System.out.println("YES");
                    System.out.println(String.join(" ", Arrays
                            .stream(minArr)
                            .mapToObj(String::valueOf)
                            .toArray(String[]::new)));
                    break;
                }
            }
        }

        //still need more time!!
        if(sumTime>0){
            System.out.println("NO");
        }
        scanner.close();
    }
}
