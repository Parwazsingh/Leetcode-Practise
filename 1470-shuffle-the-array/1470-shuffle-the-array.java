class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] numbers = new int[2*n];
        int j = 0;
        for(int i = 0; i<n; i++){
            numbers[j++] = nums[i];
             numbers[j++] = nums[i + n];

        }
        return numbers;
    }
}