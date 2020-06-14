public int[] pre4(int[] nums) {
  List<Integer> arr = new ArrayList<Integer>();
  
  for(int i = 0; i<nums.length;i++){
    if(nums[i]!=4){
      arr.add(nums[i]);
    }
    if(nums[i] == 4){
      break;
    }
  }
  
  int[] ans = new int[arr.size()];
  for(int i = 0; i<ans.length; i++){
    ans[i] = arr.get(i);
  }
  return ans;
  
}
