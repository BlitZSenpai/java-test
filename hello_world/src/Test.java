import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    int n = 5;
    List<Integer> arr1 = new ArrayList<Integer>(n);
    List<Integer> arr2 = new ArrayList<Integer>(n);
    for (int i = 1; i <= n; i++) {
      arr1.add(i);
      arr2.add(i + 1);
    }
    System.out.println(arr1);
    System.out.println(arr2);
  }
}
