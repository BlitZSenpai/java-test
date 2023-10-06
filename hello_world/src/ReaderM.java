import java.io.*;

public class ReaderM {
  public static void main(String[] args) throws IOException {
    Reader input = new FileReader("c:\\Demo.txt");
    try {
      char c = (char) input.read();
      System.out.println(c);
    } finally {
      System.out.println("error");
    }
    input.close();
  }
}
