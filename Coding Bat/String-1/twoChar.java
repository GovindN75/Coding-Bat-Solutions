public String twoChar(String str, int index) {
  int num = index + 2; 
  
  if((index >= str.length()-1)){
    return str.substring(0, 2); 
  }
  if(index < 0){
    return str.substring(0, 2);
  }
  
  return str.substring(index, num);
  
}
