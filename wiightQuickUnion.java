import java.util.Arrays;

class WeightQuickUnionUf{
    private int[] arr;

    // size array to tack size of conected component(tree)
    // size = no of elements in tree
    private int[] size;

    WeightQuickUnionUf(int N){
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] =i;
        }
        size =new int[N];
        for(int i=0;i<N;i++){
            size[i] =1;
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

    public void union(int p , int q){
        //i and j are index value
        int i = root(p);
        int j = root(q);
        //now we will find tree which has more weight ie - which tree has more elements
        if(i == j){
            return;
        }
        if(size[i]>size[j]){
            arr[j]=i;
            size[i]+=size[j];
        }
        else{
            arr[i]=j;
            size[j]+=size[i];
        }
        System.out.println(Arrays.toString(arr));
    }

}
public class wiightQuickUnion {
    public static void main(String[] arg) {
        WeightQuickUnionUf q1 =new WeightQuickUnionUf(100);
        q1.union(3, 6);
        q1.union(8, 3);
        
}
    
}
