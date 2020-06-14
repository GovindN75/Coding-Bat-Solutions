public int userCompare(String aName, int aId, String bName, int bId) {
  int a = aName.compareTo(bName);
  if(a<0){
    return -1;
  }
  if(a>0){
    return 1; 
  }
  if(a == 0){
    if(aId<bId){
      return -1;
    }
    else if(aId>bId){
      return 1;
    }
    
  }
  return 0;
}
