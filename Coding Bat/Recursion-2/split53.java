public boolean split53(int[] nums) {
  return s(0, nums, 0, 0);
}

public boolean s(int start, int[] nums, int g1, int g2){
  if(start>=nums.length){
    return g1==g2;
  }
  if(nums[start] %5 == 0){
    return s(start+1, nums, g1+nums[start], g2);
  }
  if(nums[start]%3 == 0){
    return s(start+1, nums, g1, g2+nums[start]); 
  }
  return s(start+1, nums,g1+nums[start], g2) || s(start+1, nums, g1, g2+nums[start]);
}
