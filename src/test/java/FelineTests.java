import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class FelineTests {

  Feline feline = new Feline(); // создали экземпляр класса

  @Test
  public void testEatMeat() throws Exception {
    List<String> actual = feline.eatMeat(); // вызвали проверяемый метод
    assertEquals(3, actual.size()); // сравнили что размер листа 3
    assertEquals("Животные", actual.get(0)); // сравнили ожидаемый результат с фактическим
    assertEquals("Птицы", actual.get(1)); // сравнили ожидаемый результат с фактическим
    assertEquals("Рыба", actual.get(2)); // сравнили ожидаемый результат с фактическим
  }

  @Test
  public void testGetFamily(){
    String actual = feline.getFamily();
    assertEquals("Кошачьи", actual); // сравнили ожидаемый результат с фактическим
  }

  @Test
  public void testGetKittens(){
    int actual = feline.getKittens();
    assertEquals(1, actual); // сравнили ожидаемый результат с фактическим
  }
  @Test
  public void testGetKittensParams(){
    int actual = feline.getKittens(2);
    assertEquals(2, actual); // сравнили ожидаемый результат с фактическим
  }
  @Test
  public void testGetFoodOther() {
    assertThrows(Exception.class,()->{feline.getFood("Единорог");}); // отлавливаем
  }



}
