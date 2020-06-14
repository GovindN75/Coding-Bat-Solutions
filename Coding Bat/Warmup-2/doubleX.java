boolean doubleX(String str) {
  int x = str.indexOf("x");
  if(x==-1){
    return false;
  }
  if(x+1 >= str.length()){
    return false;
  }
  
  return str.substring(x+1, x+2).equals(" x");
  
}
