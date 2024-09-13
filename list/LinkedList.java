// package list;


public class LinkedList{
    Node head;
    Node tail;

    static class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedList insertAtHead(LinkedList list, int data){
        Node temp = new Node(data);
        
        if(list.head == null){
            list.head = temp;
            list.tail = temp;
        }
        else{
            temp.next = list.head;
            list.head = temp;
        }
        return list;
    }

    public static LinkedList insertAtTail(LinkedList list, int data){
        Node temp = new Node(data);
        
        if(list.head == null){
            list.head = temp;
            list.tail = temp;
        }
        else{
            Node node = list.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = temp;
            list.tail = node.next;
        }
        return list;
    }

    public static LinkedList insertAtPositioin(LinkedList list, int data, int position){
        if(position == 1){
            insertAtHead(list, data);
            return list;
        }
        Node temp = new Node(data);
        
        int count = 1;
        Node prev = null;
        Node curr = list.head;

        while (curr.next != null && count != position) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        if(curr.next == null){
            insertAtTail(list, data);
        }
        else{
            Node node = curr;
            prev.next = temp;
            temp.next = node;
        }
        return list;
    }

    public static LinkedList deleteNodeByPosition(LinkedList list,int position){
        if(list.head == null){
            return null;
        }
        if(position <= 0){
            System.out.println("please pass the right position");
            return list;
        }

        if(position == 1){
            Node temp = list.head;
            temp = temp.next;
            list.head = temp;
            return list;
        }

        int count = 1;
        Node prev = null;
        Node curr = list.head;

        while (curr.next != null && count != position) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        if(curr.next == null && position > count){
            System.out.println("Please pass a right position for remove data");
            return list;
        }

        prev.next = curr.next;
        return list;
    }

    public static LinkedList deleteNodeByData(LinkedList list, int data){
        if(list.head == null){
            return list;
        }
        if(list.head.data == data){
            Node temp = list.head;
            temp = temp.next;
            list.head = temp;
            return list;
        }

        Node prev = null;
        Node curr = list.head;

        while (curr.next != null && curr.data != data) {
            prev = curr;
            curr = curr.next;
        }

        if(curr.next == null && curr.data != data){
            System.out.println("Data not found");
            return list;
        }

        prev.next = curr.next;
        return list;
    }

    public static void printList(LinkedList list){
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insertAtHead(list, 20);
        list = insertAtHead(list, 10);
        list = insertAtHead(list, 5);
        LinkedList.printList(list);
        System.out.println("head is->"+list.head.data);
        System.out.println("tail is -> "+ list.tail.data);

        list = insertAtTail(list, 30);
        list = insertAtTail(list, 40);
        LinkedList.printList(list);


        System.out.println("head is->"+list.head.data);
        System.out.println("tail is -> "+ list.tail.data);

        insertAtPositioin(list, 100, 1);
        insertAtPositioin(list, 200, 3);
        insertAtPositioin(list, 300, 2);
        insertAtPositioin(list, 400, 4);
        LinkedList.printList(list);

        deleteNodeByPosition(list, 1);
        System.out.println("Deleting Node");
        LinkedList.printList(list);

        deleteNodeByPosition(list, 8);
        LinkedList.printList(list);

        deleteNodeByPosition(list, 0);
        LinkedList.printList(list);

        System.out.println("remove by data ");

        deleteNodeByData(list, 30);
        LinkedList.printList(list);

        deleteNodeByData(list, 300);
        LinkedList.printList(list);

        deleteNodeByData(list, 200);
        LinkedList.printList(list);
    }
}
