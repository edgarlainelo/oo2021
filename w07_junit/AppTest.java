import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
  
  @Test
  public void firstTest(){
    assertEquals("1 equals 1", 1, 1);
  }

  @Test
  public void secondTest(){
    assertEquals("1 equals 1", 1, 2);
  }

  @Test
  public void testSum(){
    assertEquals("sum should be 5+5=10", 10, App.sum(5, 5));
  }
}
