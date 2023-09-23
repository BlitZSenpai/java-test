import java.util.*;
import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {
    int n = 5;
    List<Integer> arr1 = new ArrayList<Integer>(n);
    List<Integer> arr2 = new Vector<Integer>(n);
    for (int i = 1; i <= n; i++) {
      arr1.add(i);
      arr2.add(i + 1);
    }
    System.out.println(arr1);
    for (int a : arr1)
      System.out.println(a);
    System.out.println(arr2);
    for (int b : arr2)
      System.out.println(b);
  }
}
