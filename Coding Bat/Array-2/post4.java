public int[] post4(int[] nums) {
  List<Integer> arr = new ArrayList<Integer>();
  boolean found4 = false;
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 4){
      found4=true;
    }
    if(nums[i]!=4 && found4){
      arr.add(nums[i]);
    }
    if(nums[i] == 4 && found4){
      arr.clear();
      found4=true;
    }
  }
  int[] ans = new int[arr.size()];
  for(int i = 0; i<ans.length; i++){
    ans[i] = arr.get(i);
  }
  
  return ans;
  
}
