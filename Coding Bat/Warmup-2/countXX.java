int countXX(String str) {
  if(str.length()<=1){
    return 0;
  }
  
  if(str.length()>=2 && (str.charAt(0) =='x' && str.charAt(1) == 'x')){
    return 1+countXX(str.substring(1));
  }
  
  return countXX(str.substring(1));
  
}
