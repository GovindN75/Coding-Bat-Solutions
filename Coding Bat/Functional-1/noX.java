public List<String> noX(List<String> strings) {
  strings.replaceAll(n -> n.replaceAll("x", ""));
  return strings;
}
