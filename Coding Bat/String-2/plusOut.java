public String plusOut(String str, String word) {
  String plus = "";
  int k = 0; 
  
  while(k<str.length()){
    if(str.substring(k).startsWith(word)){
      plus+=word;
      k+=word.length();
    }
    else{
      plus+="+";
      k++;
    }
  }
  return plus;
  
}
