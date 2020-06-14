public String sameEnds(String string) {
  int mid = string.length()/2;
  
  for(int i = mid; i>=0; i--){
    
    String s = string.substring(0, i);
    
    if(string.endsWith(s)){
    
      return s;
    }
  }
  
  return "";
  
}
