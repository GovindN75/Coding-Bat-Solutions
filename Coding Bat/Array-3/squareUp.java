public int[] squareUp(int n) {
  int[] ans = new int[n*n];
  for(int i = 0; i<n; i++){
    for(int k = 0; k<n; k++){
      if(k<n-i-1){
        continue;
      }
      ans[i*n  + k] = n-k;
    }
  }
  return ans;
}
