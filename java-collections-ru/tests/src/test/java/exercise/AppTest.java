package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    List<Integer> numbers;

    @BeforeEach
    void initIntegerList() {
        this.numbers = new ArrayList<>();
        this.numbers.add(1);
        this.numbers.add(2);
        this.numbers.add(3);
        this.numbers.add(5);
    }

    @Test
    void testTake() {
        int actual1 = 2;
        assertThat(App.take(numbers, actual1))
                .hasSize(actual1)
                .isEqualTo(numbers.subList(0, actual1));

        int actual2 = 3;
        assertThat(App.take(numbers, actual2))
                .hasSize(actual2)
                .isEqualTo(numbers.subList(0, actual2));

        int actual3 = 0;
        assertThat(App.take(numbers, actual3))
                .isEmpty();

        int actual4 = 10;
        assertThat(App.take(numbers, actual4))
                .isEqualTo(numbers);
    }
}
