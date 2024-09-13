// package Assignment2.listInterface;

import java.util.ArrayList;
import java.util.Stack;

public class Stack1 {

    void display(Stack a){
        for(int i = 0; i<a.size(); i++){
            System.out.print(a.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Stack s1 = new Stack<>();
        Stack1 s2 = new Stack1();

        s1.add(1);
        s1.add(5);
        s1.add('R');
        s1.add("string");
        s1.add(true);
        s1.add(3);


        Stack b = new Stack<>();

        b.add(1);
        b.add(5);
        b.add('R');
        b.add("string");
        b.add(true);
        b.add(3);

        s2.display(s1);
        s1.removeFirst();
        s1.addFirst(9);
        s1.add(2,7);
        s1.addAll(b);
        s1.addAll(1,b);
        s1.addLast(9);
    }
}
