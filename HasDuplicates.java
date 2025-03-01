// HasDuplicates.java
class HasDuplicates {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HasDuplicates solution = new HasDuplicates();
        int[] nums = {1, 2, 3, 4, 5, 6, 1}; // Example input
        System.out.println(solution.hasDuplicate(nums)); // Should print true
    }
}
