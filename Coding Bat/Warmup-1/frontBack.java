public String frontBack(String str) {
  if(str.length() <=1){
    return str;
  }
  String answer = str.substring(1, str.length()-1);
  
  return str.charAt(str.length()-1) + answer + str.charAt(0);
}
