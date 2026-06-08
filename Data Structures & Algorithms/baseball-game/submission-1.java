class Solution {
    static class stack{
        int[] arr;
        int top;
        stack(int capacity){
            arr=new int[capacity];
            top=-1;
        }
        public void push(int x){
            arr[++top]=x;
        }
        public void op(char x){
            if(x=='+'){
                int a=arr[top];
                int b=arr[top-1];
                arr[++top]= a+b;
            }
            else if(x=='C'){
                top=top-1;
            }
            else if(x=='D'){
                int a=arr[top];
                arr[++top]=a*2;
            }
        }
        public int stacksum(){
            int sum=0;
            for(int i=0;i<=top;i++){
                sum+=arr[i];
            }
            return sum;
        }

    }
    
    public int calPoints(String[] operations) {
        stack s=new stack(operations.length);
        for(int i=0;i<operations.length;i++){
            String str=operations[i];
            if (str.equals("+") || str.equals("C") || str.equals("D")) 
            {
            s.op(str.charAt(0));
            } 
        else {
            int num = Integer.parseInt(str);
            s.push(num);
        }
        }
        return s.stacksum();
    }
}