public String startOz(String str) {
  if(str.length() <=1){
    return str;
  }
  
  if(str.charAt(0) == 'o' && str.charAt(1) =='z'){
    return "oz";
  }
  else if(str.charAt(0) == 'o'&& !(str.charAt(1) =='z')){
    return "o";
  }
  else if(!(str.charAt(0) == 'o')&& (str.charAt(1) =='z')){
    return "z";
  }
  return "";
}
