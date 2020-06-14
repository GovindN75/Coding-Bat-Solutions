public boolean endOther(String a, String b) {
  String ab = a.toLowerCase();
  String ba = b.toLowerCase();

  return ab.endsWith(ba) || ba.endsWith(ab);
}
 