class LLQueue<T> {
    // Declare head and tail pointers for linked list
    private Node<T> head; 
    private Node<T> tail;

    // Nested class representing a Node in the linked list
    private class Node<T>{
        // Declare item and next variables
        private T item; 
        private Node<T> next;

        Node(T item){
            // Initialize item variable
            this.item =item;
        }
    }

    // Method to add an item to the queue
    public void inQueue(T item){
        // Create a new Node with the item passed to the method
        Node<T> n1 = new Node<>(item);
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
    public T deQueue(){
        // Check if the head is null
        if(head == null){
            return null;
        }
        // If the head is the same as the tail, return the item of the head
        if(head == tail){
            return head.item;
        }
        // Create a temp variable starting at the head
        Node<T> temp = head;
        // Create a variable to store the item to be returned (the item of the tail)
        T item = tail.item;
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
        Node<T> temp = head;
        // Loop through the list, printing each item and an arrow until reaching the end
        while(temp!=null){
            System.out.print(temp.item+" -->");
            temp =temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] arg) {
        LLQueue<Integer> q1 = new LLQueue<>();
        // Adding items to the queue
        q1.inQueue(1);
        q1.inQueue(2);
        q1.inQueue(3);
        q1.inQueue(4);
        q1.inQueue(5);
        // Display the queue
        q1.displayLLqueue();
        // Removing items from the queue
        System.out.println(q1.deQueue());
        System.out.println(q1.deQueue());
        // Display the queue again
        q1.displayLLqueue();
    }
} 














