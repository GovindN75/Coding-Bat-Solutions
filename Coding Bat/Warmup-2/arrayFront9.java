public boolean arrayFront9(int[] nums) {
  if(nums.length ==0){
    return false;
  }
  for(int i = 0; i<4; i++){
    if(nums[i] == 9){
      return true;
    }
    if(i>=nums.length - 1){
      return false;
    }
  }
  return false;
}
