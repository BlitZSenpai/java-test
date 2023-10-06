class calc {
  public int add(int x, int y) {
    return x + y;
  }
}

class Adv extends calc {
  public int add(int x, int y, int z) {
    return x + y + z;
  }
}

public class OverRide {
  public static void main(String[] args) {
    Adv obj = new Adv();
    int r = obj.add(3, 4, 5);
    System.out.println(r);
  }
}
