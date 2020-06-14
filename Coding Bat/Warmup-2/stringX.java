public String stringX(String str) {
  if(str.length()<=1){
    return str;
  }
  String ans = "";
  for(int i = 0; i<str.length();i++){
    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))){
      ans+=str.substring(i, i+1);
    }
  }
  return ans;
  
}
