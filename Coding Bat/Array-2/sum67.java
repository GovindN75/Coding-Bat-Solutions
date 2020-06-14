public int sum67(int[] nums) {
  if(nums.length == 0){
    return 0; 
  }
  int sum = 0; 
  boolean six = false;
  for(int i =0; i<nums.length; i++){
    if(nums[i] == 6){
      six = true;
    }
    if(six == false){
      sum+=nums[i];
    }
   if(six && nums[i] == 7){
      six = false;
    }
    
  }
  
  return sum;
  
}
