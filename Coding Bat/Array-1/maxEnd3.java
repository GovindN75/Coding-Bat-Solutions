public int[] maxEnd3(int[] nums) {
  int[] ans = new int[nums.length];
  
  if(nums[0] >= nums[nums.length-1]){
    for(int i =0; i<nums.length;i++){
      ans[i] = nums[0];
    }
    return ans;
  }
  for(int i = 0; i<nums.length; i++){
    ans[i] = nums[nums.length-1];
  }
  return ans;
  
}
