// this queue is of string type

public class LLqueues {
    // Declare head and tail pointers for linked list
    private Node head; 
    private Node tail;

    // Nested class representing a Node in the linked list
    private class Node{
        // Declare item and next variables
        private String item; 
        private Node next;

        Node(String item){
            // Initialize item variable
            this.item =item;
        }
    }

    // Method to add an item to the queue
    public void inQueue(String item){
        // Create a new Node with the item passed to the method
        Node n1 = new Node(item);
        // Set the next variable of this new Node to the current head
        n1.next =head;
        // Update the head pointer to the new Node
        head =n1;
        // If the tail pointer is null, update it to the new Node as well
        if(tail == null){
            tail =head;
        }
    }

    // Method to remove an item from the queue
    public String deQueue(){
        // Check if the head is null
        if(head == null){
            return "list is empty";
        }
        // If the head is the same as the tail, return the item of the head
        if(head == tail){
            return head.item;
        }
        // Create a temp variable starting at the head
        Node temp = head;
        // Create a variable to store the item to be returned (the item of the tail)
        String item = tail.item;
        // Loop through the list until reaching the second to last Node
        while(temp.next!=tail){
            temp =temp.next;
        }
        // Set the next variable of this second to last Node to null
        temp.next =null;
        // Update the tail pointer to this second to last Node
        tail=temp;
        // Return the item of the tail
        return item;
    }

    // Method to display the items in the queue
    public void displayLLqueue(){
        // Create a temp variable starting at the head
        Node temp = head;
        // Loop through the list, printing each item and an arrow until reaching the end
        while(temp!=null){
            System.out.print(temp.item+" -->");
            temp =temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] arg) {
        LLqueues q1 = new LLqueues();
        // Adding items to the queue
        q1.inQueue("1");
        q1.inQueue("2");
        q1.inQueue("3");
        q1.inQueue("4");
        q1.inQueue("5");
        // Display the queue
        q1.displayLLqueue();
        // Removing items from the queue
        System.out.println(q1.deQueue());
        System.out.println(q1.deQueue());
        // Display the queue again
        q1.displayLLqueue();
    }
}