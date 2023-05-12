public class Shellsort {

    // This method displays the elements of an array.
    public static void displayArray(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  
    // This method sorts the elements of an array using the shellsort algorithm.
    public static void main(String[] args) {
      int[] arr = {3, 7, 4, 9, 2, 5, 7, 1, 5};
      int n = arr.length;
      int gap = n / 2;
  
      // Iterate over all gaps.
      for (int k = gap; k >= 1; k /= 2) {
        // Iterate over all elements that are k-sorted.
        for (int i = k; i < n; i++) {
          // Save the current element.
          int current = arr[i];
  
          // Iterate over the subarray starting at i - k and swap the current element with the smaller element.
          int j = i - k;
          for (int l = j; l >= 0; l -= k) {
            if (current < arr[l]) {
              // Swap the current element with the smaller element.
              int temp = arr[i];
              arr[i] = arr[l];
              arr[l] = temp;
              current = arr[l];
            } else {
              break;
            }
          }
        }
      }
  
      // Display the sorted array.
      displayArray(arr);
    }
  }