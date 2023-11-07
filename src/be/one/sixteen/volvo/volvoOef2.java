package be.one.sixteen.volvo;

public class volvoOef2 {
    public static void main(String[] args) {
        String[] stringArray = {
                "co",
                "do",
                "li",
                "teo"
        };

        String[] stringArray2 = {
                "kayak",
                "potato",
        };

        System.out.println(solution(stringArray));
        System.out.println(solution(stringArray2));
    }

    public static int solution(String[] A) {
        StringBuilder newWord = new StringBuilder();
        int counter = 0;
        for (String s : A) {
            StringBuilder newWordCopy = new StringBuilder(newWord);
            if (isWordPossible(s)) {
                newWordCopy.append(s);
                if (isWordPossible(newWordCopy.toString())) {
                    newWord = newWordCopy;
                    counter++;
                    System.out.println(newWord);
                }
            }
        }
        return counter;
    }

    public static boolean isWordPossible(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            for (int j = i + 1; j < word.length(); j++) {
                char charToCheck = word.charAt(j);
                if (currentChar == charToCheck) {
                    return false;
                }
            }
        }
        return true;
    }
}

