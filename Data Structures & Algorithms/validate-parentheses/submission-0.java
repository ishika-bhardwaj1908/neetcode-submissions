class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr==']'||curr=='}'||curr==')'){
                if(st.isEmpty()){
                    return false;
                }
                else{
                    if(curr==']'&& st.peek()=='['||curr=='}'&& st.peek()=='{' || curr==')'&& st.peek()=='('){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }

            else{
                st.push(curr);
            }



        }
        if(st.isEmpty()){
            return true;
        }
        return false;
        
    }
}
