public int[] zeroFront(int[] nums) {
  List<Integer> zeroes = new ArrayList<Integer>();
  List<Integer> restOfNums = new ArrayList<Integer>();
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 0){
      zeroes.add(nums[i]);
    }
    if(nums[i] != 0){
      restOfNums.add(nums[i]);
    }
  }
  
  int[] ans = new int[zeroes.size() + restOfNums.size()];
  for(int i = 0;i<zeroes.size(); i++){
    ans[i] = zeroes.get(i);
  }
  int k = 0;
  for(int i = zeroes.size(); i<ans.length; i++){
    ans[i] = restOfNums.get(k);
    k++;
  }
  return ans;
  
}
