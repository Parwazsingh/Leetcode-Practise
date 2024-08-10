class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int j = 0;
        int result = 0;
        for(int i = 0; i<points.length - 1; i++){
            
       result += Math.max(Math.abs(points[i + 1][j] - points[i][j]) , Math.abs(points[i +1][j+1] - points[i][j+1]));
    
        }
        return result;
    }
}