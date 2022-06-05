
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamsTests {
  private final String sex;
  private final Boolean expected;
  Feline feline;

  public LionParamsTests(String sex, Boolean expected) {
    this.sex = sex;
    this.expected = expected;
  }

  @Parameterized.Parameters // добавили аннотацию
  public static Object[][] haveMane() {
    return new Object[][] {
            { "Самец", true},
            { "Самка", false},
    };
  }

  @Test
  public void testDoesHaveMane() throws Exception {
  Boolean actual = new Lion(sex,feline).doesHaveMane();
  assertEquals(expected, actual);
  }
}
