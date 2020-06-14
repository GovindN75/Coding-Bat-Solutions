public int luckySum(int a, int b, int c) {
  if(a!=13 && b!=13 && c!=13){
    return a+b+c;
  }
  
  if(a==13){
    return 0;
  }
  if(b==13 && a!=13){
    return a;
  }
  
  return a+b;
}
