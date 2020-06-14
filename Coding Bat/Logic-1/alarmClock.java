public String alarmClock(int day, boolean vacation) {
  if(!vacation&&(day>0 && day<6)){
    return "7:00";
  }
  if(!vacation&&(day==6 || day == 0)){
    return "10:00";
  }
  if(vacation &&(day>0 && day<6)){
    return "10:00";
  }
 
  return "off";
 
  
}
