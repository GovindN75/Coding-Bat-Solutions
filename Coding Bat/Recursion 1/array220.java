public boolean array220(int[] nums, int index) {
  if(index >= nums.length-1){
    return false;
  }
  
  return nums[index] * 10 == nums[index + 1] || array220(nums, index +1); 
}
