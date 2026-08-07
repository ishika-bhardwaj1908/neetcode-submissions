class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> mainlist=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> sublist=new ArrayList<>();
                    sublist.add(nums[i]);
                    sublist.add(nums[j]);
                    sublist.add(nums[k]);
                    set.add(sublist);
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }
                else{
                    k--;
                }
            }

      }
             for(List<Integer> curr:set){
                mainlist.add(curr);
        }
        return mainlist;
    }
}
