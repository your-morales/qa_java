import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

  @Mock
  Feline feline;

  @Test
  public void testGetFoodForCat() throws Exception{
    Cat cat = new Cat(feline);
    Mockito.when(feline.eatMeat()).thenReturn(List.of("Робот")); // выведется Робот, мы замокали eatMeet у Фелине.
    List<String> actual = (cat.getFood()); //вызываем метод из тестируемого класса
    assertEquals("Робот", actual.get(0));
  }
  @Test
  public void testGetSoundCat(){
    Cat cat = new Cat(feline);
    String actual = cat.getSound();
    assertEquals("Мяу", actual); // сравнили ожидаемый результат с фактическим
  }

}
