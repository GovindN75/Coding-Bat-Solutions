public boolean lastDigit(int a, int b, int c) {
  int last1 = a%10;
  int last2 = b%10;
  int last3 = c%10;
  
  if(last1 == last2 || last2==last3||last3==last1){
    return true;
  }
  
  return false;
}
