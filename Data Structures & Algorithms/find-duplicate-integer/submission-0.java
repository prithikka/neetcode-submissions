class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j])
                  {
                    index=i;
                    break;
                  }
            }
        }
        return nums[index];
    }
}
