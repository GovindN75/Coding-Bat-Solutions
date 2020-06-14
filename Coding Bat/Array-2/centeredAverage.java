public int centeredAverage(int[] nums) {
  Arrays.sort(nums);
  int sum = 0;
  for(int i = 1; i<nums.length-1; i++){
    sum+=nums[i];
  }
  
  int num = nums.length - 2;
  
  return sum/num;
  
}
