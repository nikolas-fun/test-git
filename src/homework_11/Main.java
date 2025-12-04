package homework_11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
/*        List<String> wordList = new ArrayList<>();
        wordList.add("Jaguar");
        wordList.add("BMW");
        wordList.add("Porsche");
        wordList.add("bi");
        int j = 0;
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).length() > 3) {
                j++;
            }
            System.out.println("имеют длину > 3: " + j);
        }
        System.out.println();

        int f = 0;
        for (String word : wordList) {
            if (word.length() > 3) {
                f++;
            } else f = 0;
            System.out.println("имеют длину > 3: " + f);
        }

        System.out.println(wordList.size());
        System.out.println(wordList);*/

        List<String> listWord = new ArrayList<>();
        listWord.add("Jaguar");
        listWord.add("BMW");
        listWord.add("Porsche");
        listWord.add("Audi");


        String maxWord = "";

        for (String auto : listWord) {
            if (auto.length() > maxWord.length()) {// 6> 0
                maxWord = auto;// Jaguar

            }
        }
        System.out.println("Самое длинное слово: " + maxWord);
    }
}

