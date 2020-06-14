public String mirrorEnds(String string) {
  String ans = "";
  
  int length = string.length();
  
  for(int i = 0, j=length-1; i<length; i++, j--){
    
    if(string.charAt(i) == string.charAt(j)){
      
      ans+=string.charAt(i);
      
    }
    else{
      
      break;
    }
  }
  
  return ans;
}
