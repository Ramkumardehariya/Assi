
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    Node head;
    Stack(){
        this.head = null;
    }
    void push(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    void pop(){
        if(head == null){
            System.out.print("/nStack underflow ");
            return;
        }
        else{
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }
    int top(){
        if(head == null){
            System.out.print("stack underflow");
            return 0;
        }
        return head.data;
    }
    boolean isEmpty(){
        return head == null;
    }
    int peek(){
        if(head == null){
            System.out.print("stack overflow ");
            return 0;
        }
        else{
            return head.data;
        }
    }
}


public class ImplementStack {
    void print(Stack st){
        while (!st.isEmpty()) {
            System.out.print(st.top()+" ");
            st.pop();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        ImplementStack s = new ImplementStack();

        System.out.println(st.peek());
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        st.pop();

        s.print(st);
    }
}
