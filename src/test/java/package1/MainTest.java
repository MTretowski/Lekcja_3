package package1;

import org.junit.jupiter.api.Test;
import org.mockito.internal.verification.AtLeast;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainTest {

  @Test
  void addTest() {
    Main main = new Main();
    assertEquals(10, main.add(3, 7));
  }

  @Test
  void doSomethingTest() {
    ConsolePrinter consolePrinterMock = mock(ConsolePrinter.class);
    // Dla metod void
    doCallRealMethod().when(consolePrinterMock).print("x");
    // Dla metod, które coś zwracają
    // when(consolePrinterMock.print(anyString())).thenCallRealMethod();

    System.out.println();
    doCallRealMethod().when(consolePrinterMock).print(anyString(), eq("x"));

    new Main().doSomething(consolePrinterMock);

    verify(consolePrinterMock, new AtLeast(3)).print(anyString());
  }
}
