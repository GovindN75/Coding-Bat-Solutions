public String deFront(String str) {    
  if(str.charAt(0) == 'a' && str.charAt(1) =='b'){
    return str;
  }
  if(str.charAt(0) == 'a' && str.charAt(1) !='b'){
    String s = "";
    s+= str.charAt(0);
    s+=str.substring(2);
    return s;
  }
  if(str.charAt(0) != 'a' && str.charAt(1) =='b'){
    return str.substring(1);
  }
  
  return str.substring(2);
  
  
}
