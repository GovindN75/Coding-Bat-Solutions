public int greenTicket(int a, int b, int c) {
  if(a!=b && b!=c && c!=a){
    return 0;
  }
  
  if(a==b && b==c && c==a){
    return 20;
  }
  
  return 10;
  
}
