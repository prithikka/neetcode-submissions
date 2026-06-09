class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String str=tokens[i];
            if(str.equals("+")){
                int a=s.pop();
                int b=s.pop();
                s.push(a+b);
            }

            else if(str.equals("-")){
                int a=s.pop();
                int b=s.pop();
                s.push(b-a);
            }

            else if(str.equals("*")){
                int a=s.pop();
                int b=s.pop();
                s.push(a*b);
            }

            else if(str.equals("/")){
                int a=s.pop();
                int b=s.pop();
                s.push(b/a);
            }

            else{
                int n=Integer.parseInt(str);
                s.push(n);
            }
        }
        return s.peek();
    }
}
