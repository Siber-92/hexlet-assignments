 package exercise;

 import static org.assertj.core.api.Assertions.assertThat;
 import org.junit.jupiter.api.Test;

 // Протестируем метод App.java.factorial(), который возвращает факториал переданного числа.

 class AppTest {

     @Test
     void testFactorial() {
         // Нужно протестировать основную функциональность и пограничные случаи

         // Основная функциональность
         int actual1 = App.java.factorial(5);
         assertThat(actual1).isEqualTo(120);

         int actual2 = App.java.factorial(3);
         assertThat(actual2).isEqualTo(6);

         // Пограничные случаи

         int actual3 = App.java.factorial(0);
         assertThat(actual3).isEqualTo(1);

         int actual4 = App.java.factorial(1);
         assertThat(actual4).isEqualTo(1);
     }
 }
