public int intMax(int a, int b, int c) {
  int max = 0;
  if(a>b){
    max = a;
  }
  else{
    max = b;
  }
  
  if(c>max){
    max=c;
  }
  return max;
}
