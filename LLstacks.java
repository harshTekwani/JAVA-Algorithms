// Genrics = <> It is used for obeject type
//for primitive data type use wrapper obj for eg gor int use Integer ie-<Integer>

public class LLstacks<Items> {
    // This class represents a linked list stack.
  
    // The head of the linked list.
    private Node head;
  
    // This class represents a node in a linked list stack.
    private class Node{
      // The value of the node.
      private Items item;
  
      // The next node in the linked list.
      private Node next;
  
      // Constructs a new node with the given value.
      public Node(Items item){
        // Initialize the value to the given value.
        this.item = item;
      }
    }
  
    // Returns true if the linked list stack is empty.
    public boolean isEmpty(){
      // Return true if the head of the linked list is null.
      return head == null;
    }
  
    // Pushes the given item onto the linked list stack.
    public void push(Items item){
      // Create a new node with the given item.
      Node n1 = new Node(item);
  
      // Set the next node of the new node to the head of the linked list.
      n1.next = head;
  
      // Set the head of the linked list to the new node.
      head = n1;
    }
  
    // Pops the item from the top of the linked list stack.
    public Items pop(){
      // If the linked list stack is empty, return null.
      if(head == null){
        return null;
      }
  
      // Get the item from the head of the linked list.
      Items item = head.item;
  
      // Set the head of the linked list to the next node of the head.
      head = head.next;
  
      // Return the item.
      return item;
    }
  
    // The main method.
    public static void main(String[] args) {
      // Create a linked list stack of strings.
      LLstacks<String> stack = new LLstacks<String>();
  
      // Push some strings onto the stack.
      stack.push("Hello");
      stack.push("World");
  
      // Pop a string from the stack.
      String poppedString = stack.pop();
  
      // Print the popped string.
      System.out.println(poppedString);
    }
  }