public boolean scoresIncreasing(int[] scores) {
  boolean increase = false;
  for(int i = 0; i<scores.length-1; i++){
    if(scores[i+1]-scores[i] >=0){
      increase = true; 
    }
    else if(scores[i+1] - scores[i] <0){
      return false;
    }
    else{
      increase = false;
    }
  }
  return increase;
}
