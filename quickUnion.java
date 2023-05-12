
import java.util.Arrays;

class QuickUnionUF{
    private int[] arr;
    QuickUnionUF(int N){
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] =i;
        }
    }

    private int root(int i){
        while(arr[i]!=i){
            i= arr[i];
        }
        return i;
    }
    // p and q are index value
    public  boolean connected(int p, int q){
        return root(p) == root(q);
    }

    //p = child node
    //q = parent node
    public void union(int p , int q){
        int i = root(p);
        int j = root(q);
        arr[i]  = j;
        System.out.println(Arrays.toString(arr));
    }
}

public class quickUnion {
    public static void main(String[] arg) {
        QuickFindUF q1 =new QuickFindUF(10);
        q1.union(3, 6);
        q1.union(8, 3);
        
}
}

