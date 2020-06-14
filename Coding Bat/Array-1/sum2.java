public int sum2(int[] nums) {
  if(nums.length<=1){
    if(nums.length == 0){
      return 0;
    }
    return nums[0];
  }
  
  int sum = 0; 
  for(int i =0; i <2; i++){
    sum+=nums[i];
  }
  return sum;
  
}
