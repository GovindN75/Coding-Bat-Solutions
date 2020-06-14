public int commonTwo(String[] a, String[] b) {
  int aInd = 0; 
  int count = 0;
  int bInd = 0; 
  if(a[0].equals(b[0])){
    count++;
    aInd++;
    bInd++;
  } 
  else if(a[0].compareTo(b[0])<0){
    aInd++;
  } 
  else{
      bInd++;
  }
  while(aInd<a.length && bInd < b.length){
    if(aInd>0 && a[aInd-1].equals(a[aInd])){
      aInd++;
    }
    else if(a[aInd].equals(b[bInd])){
      count++;
      bInd++;
      aInd++;
    }
    else if(a[aInd].compareTo(b[bInd])<0){
      aInd++;
    }
    else{
      bInd++;
    }
  }
  return count;
}
