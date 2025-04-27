package GFG;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        String str="";
        try (Scanner input = new Scanner(System.in))
        {
            str=input.nextLine();
        }
        System.out.println(balancedParentheses(str));
    }

    private static boolean balancedParentheses(String str) {
        Stack<Character> s=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        char[] array = str.toCharArray();
        for (char ch: array) {
            if (ch=='{' || ch=='[' || ch=='(')
                s.push(ch);
            if (ch=='}' || ch==']' || ch==')'){
                if (s.isEmpty())
                    return false;
                if (map.get(s.pop())!=ch)
                    return false;
            }
        }
        return s.isEmpty();
    }
}