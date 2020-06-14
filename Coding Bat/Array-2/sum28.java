public boolean sum28(int[] nums) {
  if(nums.length <4){
    return false;
  }
  
  int count = 0; 
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 2){
      count++;
    }
  }
  if(count!=4){
    return false;
  }
  return true;
  
}
