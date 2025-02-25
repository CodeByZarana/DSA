class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // If nums1 has no valid elements, simply copy nums2 over.
        if (m == 0) {
            for (int idx = 0; idx < n; idx++) {
                nums1[idx] = nums2[idx];
            }
            return;
        }
        
        // i points to the last valid element of nums1.
        int i = m - 1;
        // j points to the last element of nums2.
        int j = n - 1;
        // k points to the end of nums1.
        int k = m + n - 1;
        
        while (j >= 0) {
            // Check if we've exhausted nums1's valid elements.
            if (i < 0) {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
            else if (nums2[j] > nums1[i]) {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
            else if (nums2[j] < nums1[i]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else {  // when nums2[j] equals nums1[i]
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}
