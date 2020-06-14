public int maxMod5(int a, int b) {
  if(a==b){
    return 0;
  }
  
  if(a>b && a%5 == b%5){
    return b;
  }
  
  if(a>b && a%5 != b%5){
    return a;
  }
  if(b>a && a%5==b%5){
    return a;
  }
  
  return b;
  
}
