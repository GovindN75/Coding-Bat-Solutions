public int sumNumbers(String str) {
  String numbers = "";
  int num = 0;
  int sum = 0;
  int factor = 1;
  
  for(int i = str.length()-1; i>=0;i--){
    
    numbers += str.charAt(i);
    
    if(Character.isDigit(numbers.charAt(0))){
      num = Integer.parseInt(numbers) * factor;
      factor *= 10;
      sum +=num;
    }
    else{
      factor = 1;
    }
    numbers = "";
  }
  return sum;
  
}
