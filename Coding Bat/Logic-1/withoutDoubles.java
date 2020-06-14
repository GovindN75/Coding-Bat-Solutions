public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if(noDoubles && die1==die2){
    if(die2 == 6){
      die2 = 1;
    }
    else{
      die2 +=1;
    }
    return die1+die2;
  }
  
  
  return die1+die2;
  
  
}
