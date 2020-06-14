public int start1(int[] a, int[] b) {
  int cnt=0;
  if(a.length>0 &&a[0] == 1){
    cnt++;
  }
  if(b.length>0&&b[0]==1){
    cnt++;
  }
  
  return cnt;
}
