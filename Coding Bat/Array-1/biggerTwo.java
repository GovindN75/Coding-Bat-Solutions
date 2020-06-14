public int[] biggerTwo(int[] a, int[] b) {
  int sum1 = 0; 
  int sum2 = 0;
  for(int i = 0;i<a.length;i++){
    sum1+= a[i];
  }
  
  for(int i = 0; i<b.length;i++){
    sum2+=b[i];
  }
  
  if(sum1>sum2){
    return a;
  }
  if(sum1==sum2){
    return a;
  }
  return b;
  
  
}
