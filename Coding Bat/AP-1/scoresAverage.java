public int scoresAverage(int[] scores) {
  if(scores.length == 2){
    return Math.max(scores[0], scores[1]);
  }
  int half = scores.length/2; 
  int a1 = average(scores, 0, half);
  int a2 = average(scores, half, scores.length-1);
  return Math.max(a1, a2);
  
}

public int average(int[]scores, int start, int end){
  
  int sum = 0; 
  int numElements = end-start; 
  
  for(int i = start; i<end; i++){
    sum+=scores[i]; 
  }
  return sum/numElements;
  
}



