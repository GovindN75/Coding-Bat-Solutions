public int[] copyEvens(int[] nums, int count) {
  int x = 0; 
  List<Integer> ans = new ArrayList<Integer>();
  for(int i = 0; i<nums.length; i++){
    if(nums[i] %2==0){
      ans.add(nums[i]);
      x++;
    }
    if(x == count){
      break;
    }
  }
  
  int[] arr = new int[count];
  for(int i = 0; i<arr.length;i++){
    arr[i] = ans.get(i);
  }
  return arr;
  
}
