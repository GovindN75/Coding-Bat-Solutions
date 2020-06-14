public int[] tenRun(int[] nums) {
  boolean isMultiple = false;
  int num = 0; 
  for(int i = 0; i<nums.length; i++){
     if (nums[i] % 10 == 0) {
      num = nums[i];
      isMultiple = true;
    }
    else if (nums[i] % 10 != 0 && isMultiple) {
      nums[i] =num;
    } 
  }
  return nums;
  
}
