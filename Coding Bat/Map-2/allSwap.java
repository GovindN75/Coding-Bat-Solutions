public String[] allSwap(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(int i = 0; i<strings.length; i++){
    String tmp = String.valueOf(strings[i].charAt(0));
    if(map.containsKey(tmp)){
      int index = map.get(tmp);
      String val= strings[index];
      strings[index] = strings[i];
      strings[i] = val;
      map.remove(tmp);
    }
    else{
      map.put(tmp, i);
    }
  }
  return strings;
}
