public int[] makeMiddle(int[] nums) {
  if(nums.length==2){
    return nums;
  }
  
  int mid = nums.length/2;
  int[] arr = new int[2];
  
  arr[0] = nums[mid-1];
  arr[1] = nums[mid];
  
  return arr;
  
}
