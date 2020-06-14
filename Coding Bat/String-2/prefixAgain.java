public boolean prefixAgain(String str, int n) {
  if(str.length()<=1){
    return false;
  }
  String prefix = str.substring(0, n);
  String suffix = str.substring(n);
  if(suffix.length()<prefix.length()){
    return false;
  }
  if(suffix.length() >= n){
    if(suffix.contains(prefix)){
      return true;
    }
  }
  return false;
}
