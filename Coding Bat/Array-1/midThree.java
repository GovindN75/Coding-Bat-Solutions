public int[] midThree(int[] nums) {
  if(nums.length == 3){
    return nums;
  }
  
  int mid = nums.length/2;
  
  int[] arr=  new int[3];
  arr[0] = nums[mid-1];
  arr[1] = nums[mid];
  arr[2] = nums[mid+1];
  return arr;
  
}
