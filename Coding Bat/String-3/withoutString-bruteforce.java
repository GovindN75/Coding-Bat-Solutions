public String withoutString(String base, String remove) {
  // this is a hardcoded solution. For a recursive solution, take a look at the 
  // folder named withoutString-recursive.java
  String rl = remove.toLowerCase();
  String ru = remove.toUpperCase();
  String a = base.replaceAll(remove, "");
  String b = a.replaceAll(rl, "");
  String c = b.replaceAll(ru, "");
  return c;
}
