public String everyNth(String str, int n) {
  if(str.length()<=1){
    return str;
  }
  String ans = "";
  for(int i = 0; i<str.length(); i+=n){
    ans += str.charAt(i);
  }
  return ans;
}
