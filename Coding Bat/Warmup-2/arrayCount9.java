public int arrayCount9(int[] nums) {
  int num = 9; 
  int count= 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == num){
      count++;
    }
  }
  return count;
  
}
