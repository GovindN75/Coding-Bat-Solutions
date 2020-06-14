public int countYZ(String str) {
  int count = 0;
  String a = str.toLowerCase();
  if(a.endsWith("z") || a.endsWith("y")){
    count++;
  }
  
  for(int i = 0; i<str.length();i++){
    if(a.charAt(i) == ' ' && (a.charAt(i-1) == 'y' || a.charAt(i-1) == 'z')){
      count++;
    } 
    else if(i>0 && !Character.isLetter(a.charAt(i)) && (a.charAt(i-1) == 'y' || a.charAt(i-1) == 'z')){
      count++;
    }
  }
  return count;
  
}
