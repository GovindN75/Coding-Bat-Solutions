public boolean tripleUp(int[] nums) {
  if(nums.length<=2){
    return false;
  }
  
  for(int i = 0; i<nums.length-2; i++){
    if(nums[i] +1 == nums[i+1] && nums[i+1] +1 == nums[i+2]){
      return true;
    }
  }
  return false;
  
}