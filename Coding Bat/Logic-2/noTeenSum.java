public int noTeenSum(int a, int b, int c) {
  
  if((a<13 || a>19) && (b<13||b>19) && (c<13 &&c>19)){
    return a+b+c;
  }
  return fixTeen(a) + fixTeen(b) + fixTeen(c);
}

public int fixTeen(int n){
  if(n == 15|| n==16){
    return n;
  }
  if((n>=13 && n<15) || (n>16 &&n<=19)){
    return 0;
  }
  return n;

  
  
}

