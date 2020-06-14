public String lastChars(String a, String b) {
  
  if(a.length() == 0 && b.length() == 0){
    return "@@";
  }
  else if(a.length()==0 && b.length()>0){
    return "@"+b.substring(b.length()-1);
  }
  else if(a.length()>0 && b.length()==0){
    return a.substring(0, 1)+"@";
  }
  
  
  String ans = "";
  ans += a.charAt(0);
  ans+=b.charAt(b.length()-1);
  return ans;
}
