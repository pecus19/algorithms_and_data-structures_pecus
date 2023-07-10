package ee.ttu.algoritmid.interestingstamps.fibonacci;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam {

    /**
     * Given a list of numbers, count how many 2-s are alone (no 2 before or after it).
     * <p>
     * countSingleTwos([2, 2, 1, 3]) => 0
     * countSingleTwos([7, 6, 1, 3]) => 0
     * countSingleTwos([2, 2, 1, 2]) => 1
     * countSingleTwos([2, 2, 2, 1, 3, 2, 1, 2]) => 2
     */
    public static int countSingleTwos(List<Integer> numbers) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> integers = new ArrayList<>();
        int count = 0;
        if (numbers.get(0) == 2 && numbers.get(1) != 2) {
            count++;
        }
        if (numbers.get(numbers.size() - 1) == 2 && numbers.get(numbers.size() - 2) != 2) {
            count++;
        }
        for (int i = 1; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == 2 && !Objects.equals(numbers.get(i), numbers.get(i - 1)) && !Objects.equals(numbers.get(i), numbers.get(i + 1))) {
                count++;
            }
        }
        return count;
    }

    /**
     * Write a method that takes a string and decodes it.
     * The string may contain some numbers.
     * All numbers need to be replaced with a corresponding letter from the alphabet.
     * Each number n references to n-th character of the lowercase alphabet (abcdefghijklmnopqrstuvwxyz).
     * If n is out of bounds, then it should start from "a" again. (0, 26 and 52 correspond to "a")
     * <p>
     * Examples:
     * decodeMessage("0") => "a"
     * decodeMessage("0b2d4f6") => "abcdefg"
     * decodeMessage("h8") => "hi"
     * decodeMessage("11o11") => "lol"
     * decodeMessage("h8 th4r30 p17ogramme43") => "hi there programmer"
     * decodeMessage(":14 19h8s 8s 84e45t34n58 54oo37e523423") => ":o this is getting cooler"
     * decodeMessage("This one doesn't need to be changed!") => "This one doesn't need to be changed!"
     *
     * @param message the message that needs to be decoded
     * @return decoded message
     */
    public static String decodeMessage(String message) {
        ArrayList<Integer> integers = new ArrayList<>();
        String a = "abcdefghijklmnopqrstuvwxyz";
        String output = "";
        String final_output = "";


//            System.out.println(message);
//        if(a)
//        System.out.println(Arrays.toString(arrOfStr));
//        return message;
        return "";
    }


    public static void main(String[] args) {
        //1
//        List<Integer> ex11 = new ArrayList<>(Arrays.asList(2, 2, 1, 3));
//        List<Integer> ex12 = new ArrayList<>(Arrays.asList(7, 6, 1, 3));
//        List<Integer> ex13 = new ArrayList<>(Arrays.asList(2, 2, 1, 2));
//        List<Integer> ex14 = new ArrayList<>(Arrays.asList(2, 2, 2, 1, 3, 2, 1, 2));
//        List<Integer> ex15 = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 2, 2, 1, 2, 2));
//        System.out.println(countSingleTwos(ex11)); // 0
//        System.out.println(countSingleTwos(ex12)); // 0
//        System.out.println(countSingleTwos(ex13)); // 1
//        System.out.println(countSingleTwos(ex14)); // 2);
//        System.out.println(countSingleTwos(ex15)); // 1);
        //2
        System.out.println(decodeMessage("0")); //"a"
        System.out.println(decodeMessage("0b2d4f6")); // "abcdefg"
        System.out.println(decodeMessage("h8")); // "hi"
        System.out.println(decodeMessage("11o11")); //"lol"
        System.out.println(decodeMessage("h8 th4r30 p17ogramme43")); // "hi there programmer"
        System.out.println(decodeMessage(":14 19h8s 8s 84e45t34n58 54oo37e523423")); // ":o this is getting cooler"
        System.out.println(decodeMessage("This one doesn't need to be changed!"));// => "This one doesn't need to be changed!");


    }
}

