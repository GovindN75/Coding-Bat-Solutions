public int maxSpan(int[] nums) {
  int span = 0;
  int leftIndex = 0; 
  int rightIndex = nums.length-1;
  for(int i = 0; i<nums.length; i++){
    
    int k = nums.length-1;
    while(nums[i] !=nums[k]){
      k--;
    }
    int max = k-i+1; 
    if(max>span){
      span = max;
    }
    
    
  }
  return span;
}
