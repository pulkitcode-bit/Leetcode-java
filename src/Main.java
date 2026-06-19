import java.util.Arrays;

class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums); // sort the array

        int a = nums.length;
        int b = a / 2;
        float[] arr = new float[b];

        int i = 0;
        int j = a - 1;
        int idx = 0;

        while (i < j) {
            int min = nums[i];
            int max = nums[j];
            float avg = (min + max) / 2.0f;
            arr[idx] = avg;
            idx++;
            i++;
            j--;
        }

        Arrays.sort(arr); // sort the averages array

        int count = 1; // at least one average is present

        for (i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        return count;
    }

    // 👇 Main method to test the function
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {4,1,4,0,3,5}; // Example test case
        int result1 = sol.distinctAverages(nums1);
        System.out.println("Number of distinct averages: " + result1); // Output should be 1

        int[] nums2 = {1, 2, 3, 4, 5, 6}; // Another test
        int result2 = sol.distinctAverages(nums2);
        System.out.println("Number of distinct averages: " + result2); // Output should be 3
    }
}
