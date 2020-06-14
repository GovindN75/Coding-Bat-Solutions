public int[] reverse3(int[] nums) {
  int[] ans = new int[nums.length];
  ans[2] = nums[0];
  ans[1] = nums[1];
  ans[0] = nums[2];
  return ans;
}
