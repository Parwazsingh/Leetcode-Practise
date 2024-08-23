class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int numberpairs = 0;
        int sum = 0;
        for(int i =0; i<nums.size(); i++){
            for(int j = i+1; j<nums.size(); j++){
                sum = nums.get(i) + nums.get(j);
                if(sum < target){
                    numberpairs++;
                }
            }
        }
        return numberpairs;
    }
}