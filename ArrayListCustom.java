import java.util.*;

public class ArrayListCustom <T>{
    // n = default size of an array
    private int n=10;
    private T[] arr;
    // idx = index of arr
    private int idx =0;
    
    // Constructor to initialize ArrayListCustom with default size
    ArrayListCustom(){
        // Create an array of Object type and then cast it to T[] to create a generic array
        this.arr = (T[])new Object[n];
    }

    // Method to check if the array is full
    public boolean isfull(){
        return arr.length == n;
    }

    // Method to resize the array by doubling its size
    public void resize(){
        // Create a temporary array of double the current size
        T[] temp =(T[])new Object[n*2];
        
        // Copy all the items of arr to temp
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        
        // Set the reference of arr to temp, so that arr points to the new resized array
        arr =temp;
    }
    
    // Method to add an item to the array
    public void add(T x){
        // Check if the array is full, and resize it if necessary
        if(isfull()){
            resize();
        }
        
        // Add the item to the array at index idx
        arr[idx] = x;
        
        // Increment the value of idx by 1
        idx++;
    }

    // Method to remove the last item from the array and return it
    public T remove(){
        // Get the last element of the array
        T element  = arr[idx-1];
        
        // Decrement the value of idx by 1
        idx--;
        
        // Return the last element of the array
        return element;
    }

    // Method to print the contents of the array and its size
    public void printarr(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]  + " ");
        }
        
        // Print the size of the array (i.e. the number of elements stored in it)
        System.out.println();
        System.out.println("size = " + idx);
    }

    // Method to accept a list of type Number or its subclass like Integer, Float, etc.
    public void getList(List<? extends Number> list){
        // Do something with the list
    }

    public static void main(String[] args) {
        // Create an instance of ArrayListCustom with Integer as its type parameter
        ArrayListCustom<Integer> obj1 =new ArrayListCustom<>();
        
        // Add some elements to the array
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);
        obj1.add(5);
        obj1.add(6);
        obj1.add(7);
        obj1.add(8);
        obj1.add(9);
        obj1.add(10);
        
        // Attempt to add one more element to the array when it's already full (i.e. 10 elements)
        // This should trigger the resize() method and double the size of the array to 20
        obj1.add(11);
        
        // Remove the last element from the array
        System.out.println(obj1.remove()); 
        
        // Add one more element to the array after removing the last one
        obj1.add(12);
        
        // Print the contents of the array and its size
        obj1.printarr();
    }
}
