package package1;

public class Main {
  public static void main(String[] args) {
    new Main().doSomething(new ConsolePrinter());
  }

  public void doSomething(ConsolePrinter consolePrinter) {
    consolePrinter.print("XYZ");
    consolePrinter.print("ABC");
    consolePrinter.print("ZZZ");
    consolePrinter.print("123");

    for (int i = 0; i < 5; i++) {
      consolePrinter.print(String.valueOf(i));
    }

    consolePrinter.print("XYZ");
    consolePrinter.print("ABC");
    consolePrinter.print("ZZZ");
  }

  public int add(int x, int y) {
    return x + y;
  }
}
