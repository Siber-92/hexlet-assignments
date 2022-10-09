package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        if (image.length == 0) {
            return image;
        }

        String[][] result = new String[image.length * 2][image[0].length * 2];

        List<String> list = Arrays.stream(image)
                .flatMap(Arrays::stream)
                .map(elt -> Collections.nCopies(2, elt))
                .flatMap(List::stream).toList();

        int indexOfListElement = 0;

        for (int iEven = 0, i = 1; i < result.length; iEven += 2, i += 2) {
            for (int j = 0; j < result[0].length; j++) {
                result[iEven][j] = list.get(indexOfListElement);
                result[i][j] = list.get(indexOfListElement);
                if (indexOfListElement + 1 < list.size()) {
                    indexOfListElement++;
                }
            }
        }
        return result;
    }
}
// END
