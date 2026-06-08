class Solution {
    static class stack{
        char[] arr;
        int top;
        stack(int size){
            arr=new char[size];
            top=-1;
        }

        public void push(char x){
            arr[++top]=x;
        }

        public char pop(){
            return arr[top--];
        }
    }

    public boolean isValid(String s) {
        stack st=new stack(s.length());
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
            }
            else if(st.top==-1)
            return false;
            else if(
                ch=='}'&& st.pop()!='{' ||
                ch==')'&& st.pop()!='(' ||
                ch==']'&& st.pop()!='['){
                    return false;
                }
        }

        if(st.top!=-1)
            return false;
        return true;
    }
}
