public String seeColor(String str) {
  if(str.length()==0){
    return "";
  }
  
  if(str.length()<=3 && str.charAt(0) !='r'){
    return "";
  }

  if(str.length()>=3 && str.substring(0, 3).equals("red")){
    return "red";
  }
  else if(str.length()>=4 && str.substring(0, 4).equals("blue")){
    return "blue";
  }
  return "";
  
  
}
