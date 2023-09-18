import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
  public static void main(String[] args) {
    Comparator<Integer> com = new Comparator<Integer>() {
      public int compare(Integer i, Integer j) {
        if (i % 10 > j % 10) {
          return 1;
        } else {
          return -1;
        }
      }
    };
    List<Integer> nums = new ArrayList<>();
    nums.add(2222);
    nums.add(6383);
    nums.add(6975);
    nums.add(3811);
    nums.add(4109);

    Collections.sort(nums, com);

    for (int n : nums) {
      System.out.print(n + " ");
    }
  }
}
