public boolean linearIn(int[] outer, int[] inner) {
  boolean present = false;
  int i = 0; 
  int j = 0; 
  
  while(i < outer.length && j<inner.length){
    if(inner[j] > outer[i]){
      i++;
    }
    else if(inner[j]<outer[i]){
      return false;
    }
    else{
      j++;
    }
  }
  
  if(j!=inner.length){
    return false;
  }
  
  return true;
  
  
}
