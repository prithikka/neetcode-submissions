class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
            boolean flag=false;
        while(!s.isEmpty()&&s.peek()>0&&asteroids[i]<0){
            if(Math.abs(s.peek())>Math.abs(asteroids[i])){
                flag=true;
                break;
            }
            else if(Math.abs(s.peek())==Math.abs(asteroids[i])){
                s.pop();
                flag=true;
                break;
            }

            else if(Math.abs(s.peek())<Math.abs(asteroids[i])){
                s.pop();
            
            }

        }

        if(!flag)
        s.push(asteroids[i]);
    }
    
    int[] arr=new int[s.size()];
    for(int j=s.size()-1;j>=0;j--){
     arr[j]=s.pop();
    }
    return arr;
    }
}