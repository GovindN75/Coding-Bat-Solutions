public boolean splitOdd10(int[] nums) {
  return s(0, nums, 0, 0);
}

public boolean s(int start, int[] nums, int g1, int g2){
  if(start>=nums.length){
    return (g1%2 == 1 && g2%10 == 0)||(g1%10 == 0 && g1%2 == 1);
  }
  
  return (s(start+1, nums, g1+nums[start], g2)||(s(start+1, nums, g1, g2+nums[start])));
  
}
