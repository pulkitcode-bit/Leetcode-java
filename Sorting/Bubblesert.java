import java.util.Arrays;

public class Bubblesert {
  public static void main(String[] args) {
    int[] arr = {2,1,6,7,8,0};
    bubblesort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void bubblesort(int[] nums) {
    boolean swap;
    //run for every step
    for (int i = 0; i < nums.length; i++) {
      swap = false;
      //    for each element,max item will come at the laast index
      for (int j = 1; j < nums.length - i; j++) {
        //swap if first element is greater then second
        if (nums[j] < nums[j - 1]) {
          //swap
          int temp = nums[j];
          nums[j] = nums[j - 1];
          nums[j - 1] = temp;
          swap = true;
        }
      }
         if (!swap) {
      break;
    }
    }
 
    
   }
}
