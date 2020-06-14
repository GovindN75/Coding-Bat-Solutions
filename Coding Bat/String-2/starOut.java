public String starOut(String str) {
  int length = str.length();
  String ans = "";
  for(int i = 0;i<length;i++){
    if(i==0 && str.charAt(i) != '*'){
      ans += str.charAt(i);
    }
    if(i>0 && str.charAt(i)!='*' && str.charAt(i-1)!='*'){
      ans += str.charAt(i);
    }
    if(i>0 && str.charAt(i) == '*' && str.charAt(i-1)!='*'){
      ans = ans.substring(0, ans.length()-1);
    }
    
  }
  return ans;
}
