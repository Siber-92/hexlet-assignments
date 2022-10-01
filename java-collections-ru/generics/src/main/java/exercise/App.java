package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// BEGIN
public class App {
    public static <T> List<Map<T, String>> findWhere(List<Map<T, String>> books, Map<T, String> tags) {
        List<Map<T, String>> result = new ArrayList<>();

        for (Map<T, String> book : books) {
            if (book.entrySet().containsAll(tags.entrySet())) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
