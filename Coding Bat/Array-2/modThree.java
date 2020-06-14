public boolean modThree(int[] nums) {
  for(int i = 0; i< nums.length; i++){
    if(i<nums.length - 2 && nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0){
      return true;
    }
    else if(i<nums.length - 2 && nums[i]%2==1 && nums[i+1]%2==1 && nums[i+2]%2==1){
      return true;
    }
  }
  return false;
}
