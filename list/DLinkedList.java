// package list;

public class DLinkedList{
    Node head;
    Node tail;

    static class Node{
        int data;
        Node next;
        Node prev;
    
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static DLinkedList insertAtHead(DLinkedList list, int data){
        Node temp = new Node(data);
        
        if(list.head == null){
            list.head = temp;
            list.tail = temp;
        }
        else{
            temp.next = list.head;
            list.head.prev = temp;
            list.head = temp;
        }
        return list;
    }

    public static DLinkedList insertAtTail(DLinkedList list, int data){
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
            temp.prev = node;
            list.tail = temp;
        }
        return list;
    }

    public static DLinkedList insertAtPositioin(DLinkedList list, int data, int position){
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
            temp.prev = prev;
            temp.next = node;
            node.prev = temp;
        }
        return list;
    }

    public static DLinkedList deleteNodeByPosition(DLinkedList list,int position){
        if(list.head == null){
            return list;
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
        curr.next.prev = prev;
        return list;
    }

    public static DLinkedList deleteNodeByData(DLinkedList list, int data){
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
        curr.next.prev = prev;
        return list;
    }

    public static void printReverse(Node curr){
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.prev;
        }
        System.out.println();
    }
    public static void printList(DLinkedList list){
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();

        list = insertAtHead(list, 20);
        list = insertAtHead(list, 10);
        list = insertAtHead(list, 5);
        DLinkedList.printList(list);
        System.out.println("head is->"+list.head.data);
        System.out.println("tail is -> "+ list.tail.data);

        list = insertAtTail(list, 30);
        list = insertAtTail(list, 40);
        DLinkedList.printList(list);


        System.out.println("head is->"+list.head.data);
        System.out.println("tail is -> "+ list.tail.data);

        insertAtPositioin(list, 100, 1);
        insertAtPositioin(list, 200, 3);
        insertAtPositioin(list, 300, 2);
        insertAtPositioin(list, 400, 4);
        DLinkedList.printList(list);

        deleteNodeByPosition(list, 1);
        System.out.println("Deleting Node");
        DLinkedList.printList(list);

        deleteNodeByPosition(list, 7);
        DLinkedList.printList(list);

        deleteNodeByPosition(list, 4);
        DLinkedList.printList(list);

        System.out.println("remove by data ");

        deleteNodeByData(list, 30);
        DLinkedList.printList(list);

        deleteNodeByData(list, 300);
        DLinkedList.printList(list);

        deleteNodeByData(list, 200);
        DLinkedList.printList(list);
        DLinkedList.printReverse(list.tail);
    }
}
