public int maxMirror(int[] nums) {
  int length = nums.length; 
  int max = 0; 
  int count = 0; 
  for(int i = 0; i<length; i++){
    count = 0; 
    for(int j = length-1; j>=0; j--){
      if(i+count <length && nums[i+count] == nums[j]){
        count++;
      }
      else{
        if(count>0){
          max = Math.max(count, max);
          count = 0; 
        }
      }
    }
    max = Math.max(count, max);
  }
  return max;
}
