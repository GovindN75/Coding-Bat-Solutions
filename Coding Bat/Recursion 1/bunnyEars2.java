public int bunnyEars2(int bunnies) {
  if(bunnies == 0){
    return 0; 
  }
  
  if(bunnies % 2 == 0)
  {
    return 3 + bunnyEars2(bunnies - 1);
  }
  
  if((bunnies-1)%2 ==0){
    return 2 + bunnyEars2(bunnies-1);
  }
  
  return bunnyEars2(bunnies-1);
  
}
