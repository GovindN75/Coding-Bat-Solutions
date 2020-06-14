public int sumLimit(int a, int b) {
  int sum = a+b;
  String o = String.valueOf(a);
  String s = String.valueOf(sum);
  if(s.length() > o.length()){
    return a;
  }
  return sum;
  
}
