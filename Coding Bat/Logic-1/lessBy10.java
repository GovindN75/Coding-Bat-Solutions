public boolean lessBy10(int a, int b, int c) {
  int dif1 = Math.abs(a-b);
  int dif2 = Math.abs(b-c);
  int dif3 = Math.abs(c-a);
  
  if(dif1>=10 || dif2>=10 || dif3>=10){
    return true;
  }
  return false;
  
}
