public boolean more14(int[] nums) {
  if(nums.length<1){
    return false;
  }
  
  int oneC = 0; 
  int fourC = 0; 
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 1){
      oneC++;
    }
    if(nums[i] == 4){
      fourC++;
    }
    
  }
  if(oneC > fourC){
    return true;
  }
  
  return false;
}
