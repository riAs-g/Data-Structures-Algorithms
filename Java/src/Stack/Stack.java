package Stack;

import java.util.ArrayList;

public class Stack {

    ArrayList<Integer> array=new ArrayList<>();

    public void push(int num){
        array.add(num);
    }

    public int pop(){
        int num=array.get(array.size()-1);
        array.remove(array.size()-1);
        return num;
    }

    public int size(){
        return array.size();
    }

    public void display(){
        int size=array.size();
        while (size>0){
            System.out.println(array.get(size-1));
            size--;
        }
    }
}
