public String altPairs(String str) {
  String ans = "";
  for(int i =0; i<str.length();i+=4){
    int midNum = i+2;
    if(midNum >str.length()){
      midNum = str.length();
    }
    
    ans+=str.substring(i, midNum);
  }
  
  return ans;
}
