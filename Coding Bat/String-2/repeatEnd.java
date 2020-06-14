public String repeatEnd(String str, int n) {
  String s = "";
  int k = n;
  while(k>0){
    k--;
    s += str.substring(str.length()-n);
  }
  return s;
}
