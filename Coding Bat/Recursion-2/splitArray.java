public boolean splitArray(int[] nums) {
  return s(0, nums, 0, 0);
}

public boolean s(int start, int[] nums, int g1, int g2){
  if(start>=nums.length){
    return g1==g2;
  }
  if(s(start+1, nums, g1+nums[start],  g2)){
    return true;
  }
  if(s(start+1, nums, g1, g2+nums[start])){
    return true;
  }
  return false;
}
