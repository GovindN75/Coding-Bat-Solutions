public String withoutString(String base, String remove){
  // This is a more elegant solution compared to the other one
  // it is more complex so make sure you understand it well.
    
  int removeInd = base.toLowerCase().indexOf(remove.toLowerCase());
  while(true){
    if(removeInd == -1){
      return base;
    }
    return base.substring(0, removeInd) + withoutString(base.substring(removeInd + remove.length()),remove); 
  }
}