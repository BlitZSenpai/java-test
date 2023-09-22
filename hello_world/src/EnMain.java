class Area {
  int length;
  int breadth;

  Area(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public void getArea() {
    int area;
    area = length * breadth;
    System.out.println("Area of Rectangle = " + area);
  }
}

public class EnMain {
  public static void main(String[] args) {
    Area rectange = new Area(10, 20);
    rectange.getArea();
  }
}