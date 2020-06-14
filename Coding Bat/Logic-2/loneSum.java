public int loneSum(int a, int b, int c) {
  if(a!=b && b!=c && c!=a){
    return a+b+c;
  }
  
  if(a==b && b==c && c==a){
    return 0;
  }
  
  if(a==b){
    return c;
  }
  
  if(b==c){
    return a;
  }
  
  return b;
  
}
