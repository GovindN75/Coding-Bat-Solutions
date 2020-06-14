public boolean has12(int[] nums) {
  boolean has1 = false;
  boolean has2 = false;
  int index1=0;
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 1){
      has1 = true;
      index1 = i;
    }
    if(i>index1 && nums[i] == 2){
      has2 = true;
    }
    else{
      has2 = false;
    }
  }
  
  return has1 && has2;
  
}
