public boolean makeBricks(int small, int big, int goal) {
  return small >= goal%5 && goal<= small + big*5;
}
