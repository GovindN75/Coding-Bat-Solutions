public String fizzString2(int n) {
  if(n%3 == 0 && n%5!=0){
    return "Fizz!";
  }
  if(n%3!=0 && n%5==0){
    return "Buzz!";
  }
  if(n%3==0 && n%5==0){
    return "FizzBuzz!";
  }
  
  return Integer.toString(n)+"!";
  
}
