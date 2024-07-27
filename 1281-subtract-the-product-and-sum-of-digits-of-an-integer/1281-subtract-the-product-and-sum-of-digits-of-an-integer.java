class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int answersum = 0;
        int productsum = 1;
        int producer = 0;
        while( n > 0){
     sum = n %10;
            answersum = sum + answersum; 
            productsum =  sum*productsum;
      n = n/10;
         
        
        }
   
    return productsum - answersum;
    }
}