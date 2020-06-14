public String[] fizzBuzz(int start, int end) {
  String[] nums = new String[end-start];
  for(int i = start; i<end; i++){
    if(i%15 == 0){
      nums[i-start] = "FizzBuzz"; 
    }
    else if(i%3 == 0){
      nums[i-start] = "Fizz";
    }
    else if(i%5 == 0){
      nums[i-start] = "Buzz";
    }

    else{
      nums[i-start] = String.valueOf(i);
    }
  }
  return nums;
}
