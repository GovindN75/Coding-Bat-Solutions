public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] ans = new String[n];
  int aInd = 0; 
  int bInd = 0; 
  for(int i = 0; i<n; i++){
    if(a[aInd].compareTo(b[bInd])<0){
      ans[i] = a[aInd];
      aInd++;
    }
    else if(a[aInd].compareTo(b[bInd])>0){
      ans[i] = b[bInd];
      bInd++;
    }
    else{
      ans[i] = a[aInd];
      aInd++;
      bInd++;
    }
  }
  return ans;
  
}
