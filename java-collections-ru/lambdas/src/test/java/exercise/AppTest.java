package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testEnlargeArrayImage() {
        String[][] image1 = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String[][] actual1 = App.enlargeArrayImage(image1);
        String[][] expected1 = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        assertThat(actual1).isEqualTo(expected1);

        String[][] image2 = {
                {"*", "*", " ", "*", "*"},
                {"*", " ", "*", " ", "*"},
                {"*", " ", "*", " ", "*"},
                {"*", "*", " ", "*", "*"},
                {"*", " ", "*", " ", "*"},

        };
        String[][] actual2 = App.enlargeArrayImage(image2);
        String[][] expected2 = {
                {"*", "*", "*", "*", " ", " ", "*", "*", "*", "*"},
                {"*", "*", "*", "*", " ", " ", "*", "*", "*", "*"},
                {"*", "*", " ", " ", "*", "*", " ", " ", "*", "*"},
                {"*", "*", " ", " ", "*", "*", " ", " ", "*", "*"},
                {"*", "*", " ", " ", "*", "*", " ", " ", "*", "*"},
                {"*", "*", " ", " ", "*", "*", " ", " ", "*", "*"},
                {"*", "*", "*", "*", " ", " ", "*", "*", "*", "*"},
                {"*", "*", "*", "*", " ", " ", "*", "*", "*", "*"},
                {"*", "*", " ", " ", "*", "*", " ", " ", "*", "*"},
                {"*", "*", " ", " ", "*", "*", " ", " ", "*", "*"},
        };
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    void testEmptyEnlargeArrayImage() {
        String[][] image = {};
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = {};
        assertThat(actual).isEqualTo(expected);
    }
}
// END
