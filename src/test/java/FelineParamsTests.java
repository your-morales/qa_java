import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamsTests {
  private final String animalKind;
  private final List<String> expected;

  public FelineParamsTests(String animalKind, List<String> expected) {
    this.animalKind = animalKind;
    this.expected = expected;
  }

  @Parameterized.Parameters // добавили аннотацию
  public static Object[][] getFoodList() {
    return new Object[][] {
            { "Травоядное", List.of("Трава", "Различные растения")},
            { "Хищник",List.of("Животные", "Птицы", "Рыба")},

    };
  }

    @Test
    public void testGetFood() throws Exception{
      List<String> actual = new Feline().getFood(animalKind);
      assertEquals(expected, actual);
    }
}
