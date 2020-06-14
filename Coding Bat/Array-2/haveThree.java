public boolean haveThree(int[] nums) {
  if(nums.length <3){
    return false;
  }
  int count = 0;
  if(nums[0] == 3){
    count++;
  }
  for(int i = 1; i<nums.length; i++){
    if(nums[i] ==3 && nums[i-1] ==3){
      return false;
    }
    if(nums[i] == 3){
      count++;
    }
  }
  if(count ==3 ){
    return true;
  }
  return false;
  
  
}
