public int[] seriesUp(int n) {
  int length = n*(n+1)/2;
  int index = 0;
  int[] ans = new int[length];
  for(int i = 1; i<=n; i++){
    for(int j = 1; j<i+1; j++){
      ans[index] = j;
      index++;
    }
  }
  return ans;
  
}
