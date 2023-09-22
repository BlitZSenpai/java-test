class A extends Thread {
  public void start() {
    System.out.println("Thread A");
    for (int i = 0; i <= 3; i++) {
      System.out.println("Thread A:" + i);
    }
  }
}

class B extends Thread {
  public void start() {
    System.out.println("Thread B");
    for (int i = 0; i <= 3; i++) {
      System.out.println("Thread B:" + i);
    }
  }
}

public class Thread2 {
  public static void main(String[] args) {
    A thread1 = new A();
    B thread2 = new B();
    thread1.start();
    thread2.start();
  }
}
