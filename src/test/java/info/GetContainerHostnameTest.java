package info;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class GetContainerHostnameTest {
  private ByteArrayOutputStream baos = new ByteArrayOutputStream();
  private PrintStream ps = new PrintStream(baos);

  @Before
  public void setup() {
      System.setOut(ps);
  }

  @Test
  public void shouldPrintStringToConsole() {
      GetContainerHostname.main(new String[] { });

      assertThat(output(), containsString("Container hostname is"));
  }

  private String output() {
      return new String(baos.toByteArray(), StandardCharsets.UTF_8);
  }
}
