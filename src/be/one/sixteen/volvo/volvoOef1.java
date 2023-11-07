package be.one.sixteen.volvo;


public class volvoOef1 {


    //De eerste test was een Java test waarbij ik moest checken of er in een gegeven String geen 'b' voor een 'a' voorkwam.
    public static void main(String[] args) {
        System.out.println(solution("ab")); // true
        System.out.println(solution("ba")); // false
        System.out.println(solution("b")); // true
        System.out.println(solution("aa")); // true
        System.out.println(solution("aabb")); // true
        System.out.println(solution("aaba")); // false
    }


    public static boolean solution(String example) {

        if (example.length() > 1) {
            char[] characterArray = example.toLowerCase().toCharArray();

            for (int i = 1; i < characterArray.length; i++) {
                if (characterArray[i] == 'a') {
                    if (characterArray[i - 1] == 'b') {
                        return false;
                    }
                }
            }
        }
        return true;
    }


//    public static boolean solution(String example) {
//        char[] characterArray = example.toLowerCase().toCharArray();
//
//        for (int i = 1; i < characterArray.length; i++) {
//            if (characterArray[i] == 'a' && isBeforeB(characterArray, i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean isBeforeB(char[] characterArray, int index) {
//        if (index > 0 && characterArray[index - 1] == 'b') {
//            return true;
//        }
//        return false;
//    }


}
