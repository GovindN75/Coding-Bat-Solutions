public String stringBits(String str) {
  if(str.length() <=1){
    return str;
  }
  if(str.length() == 2){
    return str.substring(0, 1);
  }
  
  String result = "";
  
  for(int i = 0; i< str.length(); i+=2)
  {
    result += str.charAt(i);
  }
  return result;
  
}
