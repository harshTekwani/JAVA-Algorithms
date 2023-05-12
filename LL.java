public class LL {
    // This class represents a linked list.
  
    // The head of the linked list.
    private Node head;
  
    // The tail of the linked list.
    private Node tail;
  
    // The size of the linked list.
    private int size;
  
    // Constructs a new linked list with no elements.
    public LL() {
      // Initialize the size to 0.
      this.size = 0;
    }
  
    // This class represents a node in a linked list.
    private class Node {
      // The value of the node.
      private int value;
  
      // The next node in the linked list.
      private Node next;
  
      // Constructs a new node with the given value.
      public Node(int value) {
        // Initialize the value to the given value.
        this.value = value;
      }
  
      // Constructs a new node with the given value and next node.
      public Node(int value, Node next) {
        // Initialize the value and next node to the given values.
        this.value = value;
        this.next = next;
      }
    }
  
    // Adds the given value to the beginning of the linked list.
    public void addFirst(int value) {
      // Create a new node with the given value.
      Node n1 = new Node(value);
  
      // Set the next node of the new node to the head of the linked list.
      n1.next = head;
  
      // Set the head of the linked list to the new node.
      head = n1;
  
      // If the linked list was empty, set the tail to the new node.
      if (tail == null) {
        tail = n1;
      }
  
      // Increment the size of the linked list.
      size += 1;
    }
  
    // Adds the given value to the end of the linked list.
    public void addLast(int value) {
      // Create a new node with the given value.
      Node n2 = new Node(value);
  
      // If the linked list is empty, set the head and tail to the new node.
      if (tail == null) {
        head = n2;
        tail = n2;
      } else {
        // Set the next node of the tail to the new node.
        tail.next = n2;
  
        // Set the tail to the new node.
        tail = n2;
      }
  
      // Increment the size of the linked list.
      size += 1;
    }
  
    // Adds the given value to the linked list at the specified index.
    public void add(int value, int index) {
      // If the index is out of bounds, do nothing.
      if (index < 0 || index >= size) {
        return;
      }
  
      // If the index is 0, add the value to the beginning of the linked list.
      if (index == 0) {
        addFirst(value);
        return;
      }
  
      // If the index is size - 1, add the value to the end of the linked list.
      if (index == size - 1) {
        addLast(value);
        return;
      }
  
      // Create a new node with the given value.
      Node n3 = new Node(value);
  
      // Find the node at the specified index.
      Node temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
  
      // Set the next node of the new node to the next node of the found node.
      n3.next = temp.next;
  
      // Set the next node of the found node to the new node.
      temp.next = n3;
  
      // Increment the size of the linked list.
      size += 1;
    }

     public void deleteFirst() {
      // If the linked list is empty, do nothing.
      if (head == null) {
        return;
      }

      // Set the head of the linked list to the next node of the head.
      head = head.next;

      // If the linked list is now empty, set the tail to null.
      if (head == null) {
        tail = null;
      }

      // Decrement the size of the linked list.
      size -= 1;
    }

    // Removes the last element from the linked list.
    public void deleteLast() {
      // If the linked list is empty, do nothing.
      if (head == null) {
        return;
      }

      // Find the node before the last node.
      Node temp = head;
      while (temp.next != tail) {
        temp = temp.next;
      }

      // Set the next node of the found node to null.
      temp.next = null;

      // Set the tail of the linked list to the found node.
      tail = temp;

      // Decrement the size of the linked list.
      size -= 1;
    }

    // Removes the element at the specified index from the linked list.
    public void delete(int index) {
      // If the index is out of bounds, do nothing.
      if (index < 0 || index >= size) {
        return;
      }

      // If the index is 0, remove the first element from the linked list.
      if (index == 0) {
        deleteFirst();
        return;
      }

      // If the index is size - 1, remove the last element from the linked list.
      if (index == size - 1) {
        deleteLast();
        return;
      }

      // Find the node at the specified index.
      Node temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }

      // Set the next node of the found node to the next node of the next node.
      temp.next = temp.next.next;

      // Decrement the size of the linked list.
      size -= 1;
    }

    // Displays the linked list.
    public void displayLL() {
      // Create a string to hold the elements of the linked list.
      String str = "";

      // Iterate over the linked list, adding the elements to the string.
      Node temp = head;
      while (temp != null) {
        str += temp.value + " --> ";
        temp = temp.next;
      }

      // Print the string.
      System.out.println(str + "End");
    }

    // The main method.
    public static void main(String[] args) {
      // Create a new linked list.
      LL list = new LL();

      // Add some elements to the linked list.
      list.addLast(0);
      list.addFirst(2);
      list.addFirst(1);
      list.addLast(3);
      list.addLast(4);
      list.add(10, 3);

      // Display the linked list.
      list.displayLL();

      // Remove the first element from the linked list.
      list.deleteFirst();

      // Display the linked list.
      list.displayLL();

      // Remove the last element from the linked list.
      list.deleteLast();

      // Display the linked list.
      list.displayLL();

      // Remove the element at index 2 from the linked list.
      list.delete(2);

      // Display the linked list.
      list.displayLL();
    }
  }













