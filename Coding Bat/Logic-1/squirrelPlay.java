public boolean squirrelPlay(int temp, boolean isSummer) {
  if(isSummer && (temp>=60 && temp<=100)){
    return true;
  }
  
  if(isSummer && !(temp>=60 && temp<=100)){
    return false;
  }
  
  if(!isSummer && (temp>=60 && temp<=90)){
    return true;
  }
  return false;
  
}
