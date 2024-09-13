import java.util.ArrayList;

public class Arraylist1 {
    

    void display(ArrayList a){
        for(int i = 0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();

        Arraylist1 a1 = new Arraylist1();

        a.add(1);
        a.add(5);
        a.add('R');
        a.add("string");
        a.add(true);
        a.add(3);


        ArrayList b = new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add('R');
        a.add("string");
        a.add(true);
        a.add(3);
        

        a1.display(a);
        a.removeFirst();
        a.addFirst(9);
        a.add(2,7);
        a.addAll(b);
        a.addAll(1,b);
        a.addLast(9);

        a1.display(a);
        a.clear();
    
        a.indexOf(a);
    }
}
