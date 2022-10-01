package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String setOfSymbol, String word) {
        List<String> symbolsList = new ArrayList<>();

        Collections.addAll(symbolsList, convertStringToSymbolArrayLowerCase(setOfSymbol));

        for (String symbol : convertStringToSymbolArrayLowerCase(word)) {
            if (!symbolsList.contains(symbol)) {
                return false;
            }
            symbolsList.remove(symbol);
        }
        return true;
    }

    public static String[] convertStringToSymbolArrayLowerCase(String str) {
        return str.toLowerCase().split("");
    }
}
//END
