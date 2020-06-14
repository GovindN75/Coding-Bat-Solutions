public int[] evenOdd(int[] nums) {
  List<Integer> evens = new ArrayList<Integer>();
  List<Integer> odds = new ArrayList<Integer>();
  
  
  for(int i = 0; i<nums.length; i++){
    if(nums[i] %2 ==0){
      evens.add(nums[i]);
    }
    if(nums[i]%2!=0){
      odds.add(nums[i]);
    }
  }
  int[] ans = new int[evens.size() + odds.size()];
  for(int i = 0; i<evens.size(); i++){
    ans[i]=evens.get(i);
  }
  int k = 0; 
  for(int i = evens.size(); i<ans.length; i++){
    ans[i] = odds.get(k);
    k++;
  }
  
  return ans;
  
  
}
