public String fizzString(String str) {
  if(str.startsWith("f") && str.charAt(str.length()-1) !='b'){
    return "Fizz";
  }
  
  if(str.startsWith("f") && str.charAt(str.length()-1) =='b'){
    return "FizzBuzz";
  }
  
  if(!str.startsWith("f") && str.charAt(str.length()-1) =='b'){
    return "Buzz";
  }
  
  return str;
  
  
}
