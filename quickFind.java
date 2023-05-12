import java.util.Arrays;

class QuickFindUF {

    // This array stores the parent of each element.
    private int[] arr;
  
    // This constructor creates an array of size `N` with each element pointing to itself.
    QuickFindUF(int N) {
      arr = new int[N];
      for (int i = 0; i < N; i++) {
        arr[i] = i;
      }
    }
  
    // This method compares two elements `p` and `q` and returns `true` if they are in the same set.
    public boolean compare(int p, int q) {
      // Returns `true` if the parents of `p` and `q` are equal.
      return arr[p] == arr[q];
    }
  
    // This method merges the sets containing elements `p` and `q`.
    public void union(int p, int q) {
      // Find the parents of `p` and `q`.
      int pid = arr[p];
      int qid = arr[q];
  
      // If the parents are equal, there is nothing to do.
      if (pid == qid) {
        return;
      }
    
    // If the parents of `p` and `q` are not equal, then we need to merge the two sets.
    // To do this, we need to iterate over the array and change the parent of all elements
    // whose parent is `pid` to `qid`.
      else{
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == pid) {
              arr[i] = qid;
            }
          }
      }

      System.out.println(Arrays.toString(arr));
     
    }
  }
  
  // This class is the main class of the program.
  public class quickFind {
  
    // This method is the entry point of the program.
    public static void main(String[] arg) {
      // Create a new QuickFindUF object with 10 elements.
      QuickFindUF q1 = new QuickFindUF(10);
  
      // Merge the elements 3 and 6.
      q1.union(3, 6);
    }
  }