public int[] rotateLeft3(int[] nums) {
  int[] ans = new int[nums.length];
  ans[0] = nums[1];
  ans[1] = nums[2];
  ans[2] = nums[0];
  return ans;
}
