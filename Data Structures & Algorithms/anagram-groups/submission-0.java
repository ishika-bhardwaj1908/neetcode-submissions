class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> mainlist=new ArrayList<>();
       
        HashMap<String,List<String>> map=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            String curr=strs[i];
            char[] charArray=curr.toCharArray();
            Arrays.sort(charArray);
            String sortcurr=new String(charArray);
            if(!map.containsKey(sortcurr)){
                 List<String> sublist=new ArrayList<>();
                map.put(sortcurr,sublist);
                map.get(sortcurr).add(curr);
            }
            else{
                map.get(sortcurr).add(curr);
            }
        }

        for(String curr:map.keySet()){
            mainlist.add(map.get(curr));
        }
        return mainlist;
        
    }
}
