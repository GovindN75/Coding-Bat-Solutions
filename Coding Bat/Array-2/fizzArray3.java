public int[] fizzArray3(int start, int end) {
  if(end == 0){
    int[] ans = new int[0];
    return ans;
  }
  int[] ans= new int[end-start];
  for(int i = start; i<end; i++){
    ans[i-start] = i;
  }
  return ans;
  
}
