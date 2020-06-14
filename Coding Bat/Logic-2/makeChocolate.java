public int makeChocolate(int small, int big, int goal) {
  if(big*5 > goal && small >=goal%5){
    return goal%5;
  }
  else if(big*5 == goal){
    return 0;
  }
  else if(small >=goal%5 && goal<=small +big*5){
    return goal - big*5;
  }
  return -1;
  
}
