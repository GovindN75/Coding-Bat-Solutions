public String getSandwich(String str) {
  if(str.length()<=10){
    return "";
  }
  
  int bread1 = str.indexOf("bread");
  int bread2 = str.lastIndexOf("bread");
  if(bread1 == -1 || bread2 == -1){
    return "";
  }
  
  if(bread1+4==bread2){
    return "";
  }
  else{
    return str.substring(bread1+5, bread2);
  }
  
}
