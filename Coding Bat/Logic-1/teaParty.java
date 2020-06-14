public int teaParty(int tea, int candy) {
  if(tea<5 ||candy<5){
    return 0;
  }
  
  if((tea>=5 &&candy >= 2*tea) ||(candy>=5 && tea>=2*candy)){
    return 2;
  }
  
  return 1;
  
}

