public List wordsWithoutList(String[] words, int len) {
  List<String> ans = new ArrayList<String>();
  for(int i = 0; i<words.length; i++){
    if(words[i].length() != len){
      ans.add(words[i]);
    }
  }
  return ans;
}
