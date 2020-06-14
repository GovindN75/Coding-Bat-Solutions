public int stringMatch(String a, String b) {
  int cnt = 0;
  int str_length = Math.min(a.length(), b.length());
  String sub1;
  String sub2;
  for(int i = 0; i < str_length - 1; i++){
    sub1 = a.substring(i, i+2);
    sub2 = b.substring(i, i+2);
    if(sub1.equals(sub2)){
      cnt++;
    }
  }
  return cnt;
  
}
