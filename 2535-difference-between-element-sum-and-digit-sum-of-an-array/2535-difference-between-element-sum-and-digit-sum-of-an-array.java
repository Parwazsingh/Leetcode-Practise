class Solution {
    public int differenceOfSum(int[] nums) {
       int elementsum = 0;
       int digitsum = 0;
    int answer = 0;
       for(int i = 0; i<nums.length;i++){
elementsum  = elementsum + nums[i];
           
       }
        for(int i = 0; i<nums.length;i++){
while(nums[i]>0){
     answer = nums[i]%10;
    digitsum = digitsum + answer;
    nums[i] = nums[i]/10;
     
}
        }
        return elementsum - digitsum;
    }
}