public int[] copyEndy(int[] nums, int count) {
  List<Integer> endy = new ArrayList<Integer>();
  for(int i = 0; i<nums.length; i++){
    if(nums[i]>=0 &&nums[i]<=10){
      endy.add(nums[i]);
    }
    else if(nums[i]>=90 && nums[i]<=100){
      endy.add(nums[i]);
    }
  }
  int[] ans = new int[count];
  for(int i = 0; i<ans.length; i++){
    ans[i] = endy.get(i);
  }
  return ans;
}
