// package Assignment2.listInterface;

import java.util.ArrayList;
import java.util.Vector;

public class Vector1 {

    void display(Vector a){
        for(int i = 0; i<a.size(); i++){
            System.out.print(a.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Vector v1 = new Vector<>();
        Vector1 v2 = new Vector1();

        v1.add(1);
        v1.add(5);
        v1.add('R');
        v1.add("string");
        v1.add(true);
        v1.add(3);


        Vector b = new Vector<>();

        b.add(1);
        b.add(5);
        b.add('R');
        b.add("string");
        b.add(true);
        b.add(3);

        v2.display(v1);
        v1.removeFirst();
        v1.addFirst(9);
        v1.add(2,7);
        v1.addAll(b);
        v1.addAll(1,b);
        v1.addLast(9);
    }
}
