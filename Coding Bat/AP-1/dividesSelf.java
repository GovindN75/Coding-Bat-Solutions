public boolean dividesSelf(int n) {
  int x = n;
  while(x>0){
    int lastDig = x%10; 
    if(lastDig == 0){
      return false;
    }
    if(n%lastDig != 0){
      return false;
    }
    x/=10;
  }
  return true;
}
