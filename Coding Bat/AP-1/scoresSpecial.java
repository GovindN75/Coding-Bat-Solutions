public int scoresSpecial(int[] a, int[] b) {
  int a1 = maxs(b);
  int b1 = maxs(a);
  return a1+b1;
  
  
}

public int maxs(int[] a){
  int max = 0; 
  for(int i = 0; i<a.length; i++){
    if(a[i]%10 == 0 && a[i]>max){
      max = a[i];
    }
  }
  return max;
}

