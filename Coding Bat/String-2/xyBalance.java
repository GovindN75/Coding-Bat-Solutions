public boolean xyBalance(String str) {
  boolean isY = false;
  for(int i = str.length()-1; i>=0; i--){
    if(str.charAt(i) =='y'){
      isY = true;
    }
    if(str.charAt(i) =='x' && !isY){
      return false;
    }
    
  }
  
  return true;
}
