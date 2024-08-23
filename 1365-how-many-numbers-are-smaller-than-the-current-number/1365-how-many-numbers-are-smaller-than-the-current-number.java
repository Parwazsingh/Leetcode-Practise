





class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
 int[] newarray = new int[nums.length]; 
        for(int i = 0; i<nums.length; i++){
            int sum = 0;
             for(int j = 0; j<nums.length; j++){
if(nums[j] < nums[i] && nums[i] != nums[j]){
sum++;
}

             }
            newarray[i] = sum;
        }
        return newarray;
    }
}