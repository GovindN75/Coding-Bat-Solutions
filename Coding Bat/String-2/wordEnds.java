public String wordEnds(String str, String word) {
  String s = "";
  
  int len1 = str.length();
  int len2 = word.length();
  int ind = str.indexOf(word);
  int k = 0; 
  while(ind!=-1){
    k = ind+word.length();
    if(ind>=1){
      s+=str.charAt(ind-1);
    }
    if(k<len1){
      s+=str.charAt(k);
    }
    ind = str.indexOf(word, k);
  }
  
  return s;
}
