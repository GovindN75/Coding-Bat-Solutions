public int[] fix34(int[] nums) {
  int i = 0; 
  int k = i+1;
  while(i<nums.length && nums[i] !=3){
    i++;
  }
  
  while(k<nums.length && nums[k]!=4){
    k++;
  }
  
  while(i<nums.length){
    if(nums[i] == 3){
      int temp = nums[i+1];
      nums[i+1] = nums[k];
      nums[k] = temp;
    }
    while(k<nums.length && nums[k]!=4){
      k++;
    }
    i++;
  }
  
  return nums;
  
}
