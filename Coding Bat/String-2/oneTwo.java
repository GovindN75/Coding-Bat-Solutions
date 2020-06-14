public String oneTwo(String str) {
  if(str.length()<3){
    return "";
  }
  String ans = "";
  for(int i = 0; i<str.length()-2;i+=3){
    ans+= str.substring(i+1, i+3)+str.charAt(i);
  }
  return ans;
}
