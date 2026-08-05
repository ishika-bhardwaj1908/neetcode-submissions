class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int curr: nums){
            if(!map.containsKey(curr)){
                map.put(curr,1);
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}