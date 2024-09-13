
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue{
    Node head;
    Queue(){
        this.head = null;
    }
    void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    

    void remove(){
        if(head == null){
            System.out.print("/nQueue underflow ");
            return;
        }
        else{
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }
    
    
    boolean isEmpty(){
        return head == null;
    }

    int peek(){
        if(head == null){
            System.out.print("Queue overflow ");
            return 0;
        }
        else{
            return head.data;
        }
    }

    int element(){
        if(head == null){
            System.out.print("Queue overflow ");
            return 0;
        }
        else{
            return head.data;
        }
    }
}


public class ImplementQueue{
    void print(Queue st){
        while (!st.isEmpty()) {
            System.out.print(st.element()+" ");
            st.remove();
        }
    }
    public static void main(String[] args) {
        Queue st = new Queue();
        ImplementQueue s = new ImplementQueue();

        System.out.println(st.peek());
        st.add(4);
        st.add(5);
        st.add(6);
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        st.remove();

        s.print(st);
    }
}
