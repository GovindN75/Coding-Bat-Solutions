public String notReplace(String str) {
  
  if(str.length()<2){
    return str;
  }
  if(str.equals("is")){
    return "is not";
  }
  int i=0;
  
  String s = "";
  if(str.length() >=3 && str.substring(0, 2).equals("is") && !Character.isLetter(str.charAt(2))){
    s+="is not";
    i+=2;
  }
  while(i<str.length()){
    if(!Character.isLetter(str.charAt(i))){
      s+=str.charAt(i);
      i++;
    }
    else if(i>=1 && i<= str.length()-3 && !Character.isLetter(str.charAt(i-1)) && str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i+2))){
      s+="is not";
      i+=2;
    }
    else if(i>= 1 && !Character.isLetter(str.charAt(i-1)) && str.substring(i).equals("is")){
      s+= "is not"; 
      i+=2; 
    }
    else{
      s+= str.charAt(i);
      i++;
    }
  }
  return s;
  
}
