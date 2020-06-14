public int bigDiff(int[] nums) {
  Arrays.sort(nums);
  int diff = nums[nums.length - 1] - nums[0];
  return diff;
}
