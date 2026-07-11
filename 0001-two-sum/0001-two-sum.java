class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans=new int[2];
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(mpp.containsKey(rem)){
            ans[0]= mpp.get(rem);
            ans[1]=i;
            break;
            }
            else
            mpp.put(nums[i],i);
        }
        return ans;
    }
}