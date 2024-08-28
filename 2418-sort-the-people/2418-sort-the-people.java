class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String>  givenname = new HashMap<Integer, String>();
        String [] hello = new String[names.length];
        for(int i= 0; i<names.length; i++){
            givenname.put( heights[i], names[i]);
        }
        Arrays.sort(heights);

          
       for(int i=0; i<names.length ; i++){
hello[names.length - i - 1] = givenname.get(heights[i]);
       }

return hello;
    }
}