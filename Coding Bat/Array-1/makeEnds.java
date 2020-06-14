public int[] makeEnds(int[] nums) {
  if(nums.length==1){
    int[] result = new int[2];
    result[0] = nums[0];
    result[1] = nums[0];
    return result;
  }
  int[] ans = new int[2];
  ans[0] = nums[0];
  ans[1] = nums[nums.length-1];
  return ans;
}
