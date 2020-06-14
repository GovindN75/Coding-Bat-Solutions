public boolean array6(int[] nums, int index) {
  if(nums.length == 0){
    return false;
  }
  if(nums[index] == 6){
    return true;
  }
  if(index + 1 == nums.length){
    return false;
  }
  return array6(nums, index + 1);
}
