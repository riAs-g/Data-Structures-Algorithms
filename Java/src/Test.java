import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.DoubleUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.UnaryOperator;

class Test {
    public static void main(String[] args) throws IOException {
        // put your code here
//        List<Integer> list=new ArrayList<>();
//        Set<Integer> set = new HashSet<>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] s = reader.readLine().split(" ");
//        for (String string : s) {
//            set.add(Integer.parseInt(string));
//        }
//        set.removeIf(n -> n > 10);
//        System.out.println(set);
//        for (int j = list.size()-1; j > 0; j--) {
//            if (!(j%2 == 0))
//                System.out.print(list.get(j)+" ");

//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//
//        // Create a list of integers from 1 to N
//        List<Integer> numbers = new ArrayList<>();
//        if (!(N%2==0)) {
//            System.out.println((N/2)+1);
//        }else {
//            System.out.println(N/2);
        final String PREFIX = "__pref__";
        final String SUFFIX = "__suff__";
        int a = 10;
        int b = 20;
        int c = 30;
        DoubleUnaryOperator unaryOperator = (x) -> a*Math.pow(x,2)+b*Math.pow(x,1)+c;
        System.out.println(unaryOperator.applyAsDouble(1));
    }
}
