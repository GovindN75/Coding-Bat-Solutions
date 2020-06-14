public boolean gHappy(String str) {
  boolean happy = false;
  if(str.length() == 0){
    return true;
  }
  if(str.length()==1){
    return false;
  }
  if(str.charAt(str.length()-1) == 'g' && str.charAt(str.length()-2) !='g'){
    return false;
  }
  for(int i = 0; i<str.length()-1; i++){
    if(i ==0 && str.charAt(i) == 'g' && str.charAt(i+1) == 'g'){
      happy = true;
    }
    else if(i>0 && str.charAt(i) == 'g' && (str.charAt(i-1) == 'g' || str.charAt(i+1)=='g')){
      happy = true;
    }
    else if(i>0 && str.charAt(i) == 'g' && (str.charAt(i-1) != 'g' && str.charAt(i+1)!='g')){
      return false;
    }
    
  }
  return happy;
}
