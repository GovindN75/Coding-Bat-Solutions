public String endUp(String str) {
  if(str.length()<=3){
    return str.toUpperCase();
  }
  String ans = str.substring(0, str.length()-3);
  String an = str.substring(str.length()-3);
  return ans + an.toUpperCase();
}
