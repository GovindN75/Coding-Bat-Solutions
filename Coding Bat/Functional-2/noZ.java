public List<String> noZ(List<String> strings) {
  strings.removeIf(n -> n.contains("z")==true);
  return strings;
}
