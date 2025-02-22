public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                // Return one-indexed result
                return new int[]{i + 1, j + 1};
            }
        }
        // In case no valid pair is found (should not happen per problem constraints)
        return new int[]{i + 1, j + 1};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        // Example test case
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(numbers, target);
        System.out.println("Indices (one-indexed): " + result[0] + ", " + result[1]);
    }
}
