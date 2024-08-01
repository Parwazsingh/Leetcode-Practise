class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        Boolean [ ] result = new Boolean[n];
        int [ ] extraArray = new int[n]; 
        for(int i = 0; i<n; i++){
  extraArray[i] = extraCandies + candies[i];
            
        }
        int max = candies[0];
             for(int i = 0; i<n; i++){
            if( candies[i] > max){
         max =  candies[i];
                }
             }
                 
                   for(int i = 0; i<n; i++){
                       if(extraArray[i] >= max){
                          result[i] = true;

                              }
                       else{
                result[i] =  false;
                       }

            
        }
        return Arrays.asList(result);
    }

}