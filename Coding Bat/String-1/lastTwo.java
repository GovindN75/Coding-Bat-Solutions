public String lastTwo(String str) {
  if(str.length()==2){
    String s = "";
    s +=str.charAt(1);
    s+=str.charAt(0);
    return s;
  }
  
  if(str.length()<2){
    return str;
  }
  
  int end = str.length()-2; 
  String rev="";
  rev+= str.charAt(str.length()-1);
  rev+= str.charAt(str.length()-2);
  return str.substring(0, end) + rev;
  
}
