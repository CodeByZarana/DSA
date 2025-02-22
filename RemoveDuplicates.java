// RemoveDuplicates.java

public class RemoveDuplicates {

    // Function to remove duplicates from sorted array
    public int removeDuplicates(int[] nums) {
        // Check for empty array
        if (nums.length == 0) {
            return 0;
        }
        
        // i is the inspector and k is the builder
        // First num[0] is always unique because the array is sorted, so k starts from 1
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not equal to the previous one, it's unique
            if (nums[i] != nums[i-1]) {
                nums[k] = nums[i];  // Place unique element at index k
                k++;  // Increment k for the next unique element
            }
        }
        return k;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an object of RemoveDuplicates class
        RemoveDuplicates solution = new RemoveDuplicates();

        // Test Case 1: Example given in the problem statement
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        testRemoveDuplicates(solution, nums1);

        // Test Case 2: Array with all duplicates
        int[] nums2 = {1, 1, 1, 1, 1, 1, 1};
        testRemoveDuplicates(solution, nums2);

        // Test Case 3: Array with no duplicates
        int[] nums3 = {1, 2, 3, 4, 5};
        testRemoveDuplicates(solution, nums3);

        // Test Case 4: Empty array
        int[] nums4 = {};
        testRemoveDuplicates(solution, nums4);

        // Test Case 5: Array with one element
        int[] nums5 = {42};
        testRemoveDuplicates(solution, nums5);

        // Test Case 6: Array with all unique elements but unordered (not a valid input, but for testing)
        int[] nums6 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        testRemoveDuplicates(solution, nums6);

        // Test Case 7: Large array with many duplicates (Performance Test)
        int[] nums7 = new int[10000];
        for (int i = 0; i < 10000; i++) {
            nums7[i] = i / 100;  // 100 occurrences of each number
        }
        testRemoveDuplicates(solution, nums7);
    }

    // Helper method to run test cases and print the result
    private static void testRemoveDuplicates(RemoveDuplicates solution, int[] nums) {
        int k = solution.removeDuplicates(nums);

        // Print the number of unique elements
        System.out.println("Number of unique elements: " + k);

        // Print the array up to k to show the unique elements
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }
}
