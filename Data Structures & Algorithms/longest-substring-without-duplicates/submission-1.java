class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int maxlength=0;
        for(int r=0;r<s.length();r++){
            char curr=s.charAt(r);
            if(map.containsKey(curr)){
                if(map.get(curr)>=l){
                    l=map.get(curr)+1;
                    
                }
            }
            
                map.put(curr,r);
            
            maxlength=Math.max(maxlength,r-l+1);
        }
        return maxlength;

        
    }
}
