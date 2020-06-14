public Map<String, String> firstChar(String[] strings) {
  Map<String, String> ans = new HashMap<String, String>();
  for(int i = 0; i<strings.length; i++){
    String key = String.valueOf(strings[i].charAt(0));
    if(ans.containsKey(key)){
      String v = ans.get(key) + strings[i];
      ans.put(key, v);
    }
    else{
      ans.put(key, strings[i]); 
    }
    
  }
  
  return ans;
}
