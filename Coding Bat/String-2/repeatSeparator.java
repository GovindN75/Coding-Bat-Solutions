public String repeatSeparator(String word, String sep, int count) {
  String s = "";
  for(int i = 0; i<count;i++){
    if(i < count-1){
      s +=  word+sep;
    }
    else{
      s+= word;  
    }
    
  }
  return s;
}
