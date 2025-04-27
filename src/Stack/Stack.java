package Stack;

import java.util.ArrayList;

public class Stack {

    ArrayList<Integer> array=new ArrayList<>();

    public void push(int num){ array.add(num); }

    public int pop(){
        int num=array.getLast();
        array.removeLast();
        return num;
    }

    public int top(){ return array.getLast(); }

    public boolean isEmpty(){ return array.isEmpty(); }

    public void display(){
        int size=array.size();
        while (size>0){
            System.out.println(array.get(size-1));
            size--;
        }
    }
}
