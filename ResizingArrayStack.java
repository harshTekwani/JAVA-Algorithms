import java.util.Iterator;
public class ResizingArrayStack<Item> {
    private Item[] arr =(Item[]) new Object[1];
    private int N=0;

    public void resize(int max){
        Item[] temp =(Item[]) new Object[max]; 
        for(int i =0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr =temp;
    }
    public boolean isEmpty(){ 
        return N == 0; 
    }
    public int size(){ 
        return N; 
    }

    public void push(Item val){
        if(N==arr.length){
            resize(arr.length*2);
        }
        arr[N] = val;
        N+=1;

    }

    public Item push(){
        N-=1;
       Item data= arr[N];
       if(N>0 && N==arr.length/4){
        resize(arr.length/2);
       }
       return data;
    }
    
    public Iterator<Item> iterator(){
        return new ReverseArrayIterator(); 
    }

    private class ReverseArrayIterator implements Iterator<Item>{
        public int i =N;

        public boolean hasNext(){
            return i>0;
        }
        public Item next(){
            i-=1;
            return arr[i];
        }
    }

}
