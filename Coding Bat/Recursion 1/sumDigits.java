public int sumDigits(int n) {
  if(n<10){
    return n;
  }
  
  int lastdig = n%10;
  return lastdig+sumDigits(n/10);
  
}
