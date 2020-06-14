public int[] shiftLeft(int[] nums) {
  if(nums.length<=1){
    return nums;
  }
  
  int[] ans = new int[nums.length];
  ans[ans.length-1] = nums[0]; 
  for(int i = 1; i<nums.length; i++){
    ans[i-1] = nums[i];
  }
  return ans;
  
}
