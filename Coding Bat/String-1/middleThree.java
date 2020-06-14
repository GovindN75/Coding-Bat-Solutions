public String middleThree(String str) {
  if(str.length()<=3){
    return str; 
  }
  
  int mid = str.length()/2;
  String s = "";
  
  s += str.charAt(mid-1);
  s+=str.charAt(mid);
  s+=str.charAt(mid+1); 
  return s;
  
}
