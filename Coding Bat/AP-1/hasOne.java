public boolean hasOne(int n) {
 
 int lastDig = n%10; 
 if(n%10 == 1){
   return true;
 }
  while(n>0){
    n/=10; 
    if(n%10 == 1){
      return true;
    }
  }
  return false;
 
  
}
