public String[] wordsWithout(String[] words, String target) {
  List<String> ans = new ArrayList(); 
  for(int i =0 ; i<words.length; i++){
    if(!(words[i].equals(target))){
      ans.add(words[i]);
    }
  }
  String[] result = new String[ans.size()];
  for(int i = 0; i<result.length; i++){
    result[i] = ans.get(i);  
  }
  return result;
}
