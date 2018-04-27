/*
    Amazing string == no repeated characters eg. abab, zxcv
    Not amazing eg. aab abbbaa
    */

public class AmazingStringOperationCounter {

    public int minimumOperations(String input) {

        int repCount = 1;
        int finalResult = 0;

        int length = input.length();
        for (int i = 0; i < length - 1; i++) {
            char c1 = input.charAt(i);
            char c2 = input.charAt(i + 1);
            if (c1 == c2) {
                repCount += 1;
            } else {
                finalResult += repCount / 2;
                repCount = 1;
            }
        }
        finalResult += repCount / 2;
        return finalResult;
    }



}

