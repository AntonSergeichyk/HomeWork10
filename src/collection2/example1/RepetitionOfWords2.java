package collection2.example1;

import java.util.HashMap;
import java.util.Map;

public class RepetitionOfWords2 {

    public static void main(String[] args) {
        String text = "QWERTY qwerty asdfg asdfg zxcvb zxcvb ZXCVB";
        Map<String, Integer> textMap = new HashMap<>();

        createMap(text, textMap);
        System.out.println(textMap);
    }

    private static void createMap(String text, Map<String, Integer> textMap) {
        for (String word : text.split(" ")) {
            if (!textMap.containsKey(word)) {
                textMap.put(word, 1);
            } else {
                textMap.put(word, textMap.get(word) + 1);
            }
        }
    }
}
