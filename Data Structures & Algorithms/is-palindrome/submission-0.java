class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String cleaned=s.replaceAll("[^a-zA-Z0-9]","");
        int n=cleaned.length();
       int i=0;
       while(i<n/2){
        if(cleaned.charAt(i)!=cleaned.charAt(n-1-i)){
            return false;
        }
        i++;
       }
       return true;
    }
}
