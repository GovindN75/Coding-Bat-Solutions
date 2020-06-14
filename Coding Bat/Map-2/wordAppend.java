public String wordAppend(String[] strings) {
  String ans = "";
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(int i = 0; i< strings.length; i++){
    String key = strings[i];
    if(map.containsKey(key)){
      int value = map.get(key);
      value++;
      if(value%2==0){
        ans += key; 
      }
      map.put(key, value);
    }
    else{
        map.put(key, 1);
      }
  }
  return ans;
}
