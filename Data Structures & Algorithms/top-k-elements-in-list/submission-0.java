class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int curr:nums){
            if(!map.containsKey(curr)){
                map.put(curr,1);
            }
            else{
                map.put(curr,map.get(curr)+1);
            }

        }

        ArrayList<Integer>[] freq=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            freq[i]=new ArrayList<>();
        }
        for(int curr:map.keySet()){
            int val=curr;
            int count=map.get(curr);
            freq[count].add(val);
        }
        int i=0;
        for(int j=n;j>=0;j--){
            for(int curr:freq[j]){
                ans[i]=curr;
                i++;
                if(i==k){
                    return ans;
                }

            }
        }
        return ans;
        
    }
}
