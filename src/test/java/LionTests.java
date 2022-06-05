import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

  @Mock
  Feline feline;

  @Test
  public void testLionGetFood() throws Exception{
    Lion lion = new Lion("Самец",feline);
    Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Робот")); // выведется Робот, мы замокали getFood у Фелине.
    List<String> actual = (lion.getFood());
    assertEquals("Робот", actual.get(0));
  }

  @Test
  public void testSexLionException() {
    assertThrows(Exception.class,()->{new Lion("Трансгендер",feline);}); // отлавливаем
  }

  @Test
  public void testLionGetKittens() throws Exception {
    Lion lion = new Lion("Самка",feline);
    Mockito.when(feline.getKittens()).thenReturn(1);
    int actual = (lion.getKittens());
    assertEquals(1, actual);
  }
}
