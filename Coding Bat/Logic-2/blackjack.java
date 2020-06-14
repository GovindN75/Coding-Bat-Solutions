public int blackjack(int a, int b) {
  if(a == 21 && b==21){
    return a;
  }
  if(a>21 && b<=21){
    return b;
  }
  if(a>21 && b>21){
    return 0;
  }
  if(b==21 && a!=21){
    return b;
  }
  if(a<21 && b<21){
    if(a>b){
      return a;
    }
    return b;
  }
  return a;
}
