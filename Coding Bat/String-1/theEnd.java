public String theEnd(String str, boolean front) {
  if(front){
    return str.substring(0, 1);
  }
  String s = "";
  s += str.charAt(str.length()-1);
  return s;
}
