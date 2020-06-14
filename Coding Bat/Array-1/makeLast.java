public int[] makeLast(int[] nums) {
  int len = 2*nums.length;
  
  int[] ans = new int[len];
  
  ans[len-1] = nums[nums.length-1];
  return ans;
}
