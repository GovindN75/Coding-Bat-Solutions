public int[] make2(int[] a, int[] b) {
  if(a.length == 2){
    return a;
  }
  
  if(a.length==1){
    
    int[] arr = new int[2];
    arr[0] = a[0];
    arr[1] = b[0];
    return arr;
  }
  
  if(a.length == 0 && b.length>=2){
    int[] arr = new int[2];
    arr[0] = b[0];
    arr[1] = b[1];
    return arr;
  }
  
  
    int[] arr = new int[2];
    arr[0] = a[0];
    arr[1] = a[1];
    return arr;
  
}
