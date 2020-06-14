public int maxBlock(String str) {
  int count = 0;
  int falseCount = 1;
  
  for(int i = 0;i<str.length()-1;i++){
    if(str.charAt(i) == str.charAt(i+1)){
      falseCount++;
    }
    else{
      falseCount = 1;
    }
    
    if(count<falseCount){
      count = falseCount;
    }
  }
  return count;
  
}
