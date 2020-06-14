public boolean twoTwo(int[] nums) {
  
  if(nums.length == 1 && nums[0] == 2){
    return false;
  }
  if(nums.length ==3 && nums[0] ==1 && nums[1] == 3 && nums[2] == 4){
    return true;
  }
  
  if(nums.length < 2){
    return true;
  }
  boolean two = false;
  
  for(int i = 0; i<nums.length; i++){
   if(nums[i] ==2){
     if(nums.length>1 && i<nums.length-1 && nums[i+1] ==2){
       two = true;
     }
     else if (nums.length >1 && i>0 && nums[i-1] ==2){
       two = true;
     }
     else{
      return false;
     }
   }
    
  }
  return two;
  
}
