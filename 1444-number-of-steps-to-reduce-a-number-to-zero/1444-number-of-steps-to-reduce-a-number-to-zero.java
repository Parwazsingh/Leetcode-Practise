class Solution {
    public int numberOfSteps(int num) {
        int i = 0;
        int j= 0;

        while(num!=0){
            if(num%2 ==0){
        num = num/2;
        i++;
            
            }
            else{
                num--;
                j++;
            }
            
        }
        int sum = i +j;
        return sum;
        
        }
    }
