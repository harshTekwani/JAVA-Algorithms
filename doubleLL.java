public class doubleLL {
    // Declare private instance variables
    private Node head;  // the first node of the doubly linked list
    private Node tail;  // the last node of the doubly linked list
    private int size;   // the number of nodes in the doubly linked list

    // Constructor to initialize the doubly linked list
    doubleLL(){
        this.size = 0;
    }

    // Inner class Node represents a node in the doubly linked list
    public class Node{
        private int value;          // the value stored in the node
        private Node next;          // reference to the next node in the doubly linked list
        private Node previous;      // reference to the previous node in the doubly linked list

        // Constructor to create a node with a given value and no next/previous node
        Node(int value){
            this.value = value;
        }

        // Constructor to create a node with a given value and references to the next/previous node
        Node(int value, Node next, Node previous){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    // Add a new node to the beginning of the doubly linked list
    public void addfirst(int value){
        Node n1 = new Node(value);
        n1.next = head;
        if(head != null){
            head.previous = n1;  // Set the previous node of the head node to the new node
        }
        head = n1;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    // Add a new node to the end of the doubly linked list
    public void addlast(int value){
        Node n2 = new Node(value);
        if(head == null){
            n2.next = null;
            n2.previous = null;
            tail = n2;
            head = tail;
            size += 1;
            return;
        }
        tail.next = n2;
        n2.previous = tail;
        tail = n2;
        size += 1;
    }

    // Add a new node with a given value at a given index in the doubly linked list
    public void add(int value, int index){ 
        if(index == 0){
            addfirst(value);    // Add the node to the beginning of the doubly linked list
            return;
        }
        if(index == size){
            addlast(value);     // Add the node to the end of the doubly linked list
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;   // Traverse the doubly linked list to find the node at the given index
        }
        Node n3 = new Node(value, temp.next, temp);
        temp.next.previous = n3;
        temp.next = n3;
        size += 1;
    }

    // Display the values of the nodes in the doubly linked list
    public void displayDoubleLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display the values of the nodes in the doubly linked list in reverse order
    public void displayDoubleLLreverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value + " <--> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    // Main method to create a doubly linked list and test its methods

    public static void main(String[] arg) {
        // create a new instance of the doubleLL class
        doubleLL list = new doubleLL();
    
        // add some nodes to the linked list using the addfirst(), addlast(), and add() methods
        list.addlast(0);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);
        list.addlast(5);
        list.add(4,3);
    
        // display the linked list using the displayDoubleLL() method
        list.displayDoubleLL();
    
        // print the size of the linked list using the size variable
        System.out.println(list.size);
    
        // display the linked list in reverse order using the displayDoubleLLreverse() method
        list.displayDoubleLLreverse();
    }
    
}
