public String firstTwo(String str) {
  if(str.length() <2){
    return str;
  }
  
  String sub = str.substring(0, 2);
  return sub;
  
}
