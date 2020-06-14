public String mixString(String a, String b) {
  String ans = "";
  int len = Math.min(a.length(), b.length());
  for(int i  = 0; i<len; i++){
    ans+= a.charAt(i);
    ans+= b.charAt(i);
  }
  if(a.length()<b.length()){
    ans+= b.substring(len);
  }
  else if(b.length()<a.length()){
    ans+=a.substring(len);
  }
  return ans;
}
