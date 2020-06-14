public String front3(String str) {
  if(str.length() <=3){
    String answer = str+str+str;
    return answer;
  }
  
  String front = str.substring(0, 3);
  return front+front+front;
  
}
