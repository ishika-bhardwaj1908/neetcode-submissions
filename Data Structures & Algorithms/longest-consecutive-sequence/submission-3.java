class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxcount=1;
        int count=1;
        if(n==0 ||n==1){
            return n;
        }

        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }

            if(nums[i]+1==nums[i+1]){
                count++;
                maxcount=Math.max(count,maxcount);
            }
        
            else{
                count=1;
            }
        }
        return maxcount;
        
    }
}
