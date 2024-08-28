class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count = 0;
        int sum = 0;
        int [] newarrray = new int[2];
        HashSet<Integer> firstone = new HashSet<>();
        HashSet<Integer> secondone= new HashSet<>();
        for(int i = 0; i<nums1.length; i++){
            firstone.add(nums1[i]);
        }
         for(int j = 0; j<nums2.length; j++){
           if(firstone.contains(nums2[j])){
             count++;
           }
         }
            for(int i = 0; i<nums2.length; i++){
            secondone.add(nums2[i]);
        }
           for(int j = 0; j<nums1.length; j++){
           if(secondone.contains(nums1[j])){
             sum++;
           }
           }
newarrray[0] = sum;

   newarrray[1] = count;
return newarrray;

        }
        


    }
