class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            int curr=nums[i];
            if(map.containsKey(target-curr)){
                ans[0]=i;
                ans[1]=map.get(target-curr);
                 Arrays.sort(ans);
                 return ans;
            }
            else{
                map.put(curr,i);
            }

        }
        
        return ans;
        
    }
}
