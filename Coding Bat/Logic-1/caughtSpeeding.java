public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday && (speed>=66 && speed<=85)){
    return 1;
  }
  if(isBirthday && speed<66){
    return 0;
  }
  if(isBirthday && (speed>=86)){
    return 2;
  }
  if(speed<=60){
    return 0;
  }
  if(!isBirthday && speed>=81){
    return 2;
  }
  return 1;
}
