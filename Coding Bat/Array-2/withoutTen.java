public int[] withoutTen(int[] nums) {
  List<Integer> zeroes = new ArrayList<Integer>();
  List<Integer> restOfNums = new ArrayList<Integer>();
  
  for(int i = 0; i<nums.length; i++){
    if(nums[i] != 10){
      restOfNums.add(nums[i]);
    }
    if(nums[i] == 10){
      zeroes.add(0);
    }
  }
  
  int[] arr = new int[zeroes.size() + restOfNums.size()];
  for(int i = 0; i<restOfNums.size();i++){
    arr[i] = restOfNums.get(i);
  }
  int k = 0;
  for(int i = restOfNums.size(); i<arr.length; i++){
    arr[i] = zeroes.get(k);
    k++;
  }
  return arr;
  
}
