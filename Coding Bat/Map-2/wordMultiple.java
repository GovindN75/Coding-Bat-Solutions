public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Integer> count = new HashMap<String, Integer>();
  Map<String, Boolean> ans = new HashMap<String, Boolean>();
  for(int i = 0; i<strings.length; i++){
    String key = strings[i];
    if(count.containsKey(key)){
      int value = count.get(key);
      value++;
      count.put(key, value);
    }
    else{
      count.put(key, 1); 
    }
    if(count.get(key)>=2){
      ans.put(key, true);
    }
    else{
      ans.put(key, false);
    }
    
  }
  return ans;
}
