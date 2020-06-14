public boolean xyzMiddle(String str) {
  if(str.length()<3){
    return false;
  }
  
  int mid1 = str.length()/2 -1;
  int mid2 = str.length()/2 -2;
  
  if(str.length()%2 == 0){
    return str.substring(mid1, mid1+3).equals("xyz") || str.substring(mid2, mid2+3).equals("xyz");
    
  }
  
  return str.substring(mid1, mid1+3).equals("xyz");
  
}
