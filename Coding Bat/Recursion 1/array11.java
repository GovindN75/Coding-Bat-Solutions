public int array11(int[] nums, int index) {
  int count = 0;
  if(index >= nums.length){
    return 0;
  }
  
  if(nums[index] == 11){
    count++;
    return count + array11(nums, index + 1);
  }
  return array11(nums, index + 1);
 
}
