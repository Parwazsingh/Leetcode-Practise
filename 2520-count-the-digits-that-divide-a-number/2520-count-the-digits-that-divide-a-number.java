class Solution {
    public int countDigits(int num) {
    int count = 0;
        int ans = num;
        int answer = 0;
       
    while(ans > 0){
        answer = ans%10;
  ans = ans/10; 
        if(num%answer ==0){
count ++;
          
        }
    }
    return count;
    }
           
    
}