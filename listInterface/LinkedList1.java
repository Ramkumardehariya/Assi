// package Assignment2.listInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {

    void display(LinkedList a){
        for(int i = 0; i<a.size(); i++){
            System.out.print(a.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList<>();
        LinkedList1 l2 = new LinkedList1();

        l1.add(1);
        l1.add(5);
        l1.add('R');
        l1.add("string");
        l1.add(true);
        l1.add(3);


        LinkedList b = new LinkedList<>();

        b.add(1);
        b.add(5);
        b.add('R');
        b.add("string");
        b.add(true);
        b.add(3);

        l2.display(l1);
        l1.removeFirst();
        l1.addFirst(9);
        l1.add(2,7);
        l1.addAll(b);
        l1.addAll(1,b);
        l1.addLast(9);
    }
}
