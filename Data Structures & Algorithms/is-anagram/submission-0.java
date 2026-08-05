class Solution {
    public boolean isAnagram(String s, String t) {
     int n1=s.length();
     int n2=t.length();
     HashMap<Character,Integer> map=new HashMap<>();
     if(n1!=n2){
        return false;
     }
     else{
        for(int i=0;i<n1;i++){
            char curr=s.charAt(i);
            if(!map.containsKey(curr)){
                map.put(curr,1);
            }
            else{
                map.put(curr,map.get(curr)+1);
            }
        }

     }
     for(int i=0;i<n2;i++){
        char curr=t.charAt(i);
        if(map.containsKey(curr)){
            int count=map.get(curr);
            if(count==1){
                map.remove(curr);
            }
            else{
                map.put(curr,count-1);
            }
        }
        else{
            return false;
        }

     }
     if(map.isEmpty()){
        return true;
     }
     return false;



    }
}
