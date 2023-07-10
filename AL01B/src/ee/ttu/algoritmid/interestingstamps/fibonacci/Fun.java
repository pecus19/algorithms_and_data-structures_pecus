//package ee.ttu.algoritmid.fibonacci;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class Fun {
//    /**
//     * Return a list that contains the exact same numbers as the given list,
//     * but rearranged so that all the zeros are grouped at the start of the list.
//     * <p>
//     * The order of the non-zero numbers does not matter.
//     * So [1, 0, 0, 1] becomes [0 ,0, 1, 1].
//     * You may modify and return the given list or make a new list.
//     * <p>
//     * zeroFront([1, 0, 0, 1]) => [0, 0, 1, 1]
//     * zeroFront([0, 1, 1, 0, 1]) => [0, 0, 1, 1, 1]
//     * zeroFront([1, 0]) => [0, 1]
//     *
//     * @param numbers list of integers
//     * @return "ordered" list
//     */
//    public static List<Integer> zeroFront(List<Integer> numbers) {
//        ArrayList<Integer> output = new ArrayList<>();
//        for (Integer number : numbers) {
//            if (number == 0) {
//                output.add(number);
//            }
//
//        }
//        for (Integer number : numbers) {
//            if (number != 0) {
//                output.add(number);
//            }
//        }
//        return output;
//    }
//
//    /**
//     * You are given a string as an input where which represents a sequence of numbers in the format `num, num, num`
//     * Make a function frequencyBasedSort that returns a list where the most popular numbers of the input
//     * are at the front and the least popular numbers are at the back of the list.
//     * If two numbers are equally popular then the bigger number must come first.
//     * <p>
//     * Examples:
//     * frequencyBasedSort("3,1") => {3, 1}
//     * frequencyBasedSort("3,3,2,4,5,1,5") => {5, 5, 3, 3, 4, 2, 1}
//     * frequencyBasedSort("1,2,3,4,5,1,2,2,3,3,1") => {3, 3, 3, 2, 2, 2, 1, 1, 1, 5, 4}
//     *
//     * @param input the sequence of numbers as a string, separate the numbers by coma and leave no empty spaces
//     * @return a list that is sorted by to number popularity
//     */
//    public static List<Integer> frequencyBasedSort(String input) {
////        HashMap<Integer, Integer> hashMap = new HashMap<>();
////        ArrayList<String[]> integerArrayList = new ArrayList<>();
////        String[] string = input.split(",");
////        integerArrayList.add(string);
//////        System.out.println(Arrays.toString(string));
////
////        }
////        return null;
////    }
//
//    public static void main(String[] args) {
////        System.out.println(zeroFront(Arrays.asList(0, 1, 0))); // 0 0 1
////        System.out.println(zeroFront(Arrays.asList(1, 0, 0, 1))); // [0, 0, 1, 1]
////        System.out.println(zeroFront(Arrays.asList(0, 1, 1, 0, 1))); // [0, 0, 1, 1, 1]
////        System.out.println(zeroFront(Arrays.asList(1, 0))); // [0, 1]
////        System.out.println(zeroFront(Arrays.asList(1, 2, 0))); // [0, 1, 2]
//        System.out.println(frequencyBasedSort("1,2,1,3"));  // 1, 1, 3, 2
//        System.out.println(frequencyBasedSort("3,1"));  // {3, 1}
//        System.out.println(frequencyBasedSort("3,3,2,4,5,1,5"));  // {5, 5, 3, 3, 4, 2, 1}
//        System.out.println(frequencyBasedSort("1,2,3,4,5,1,2,2,3,3,1"));  // {3, 3, 3, 2, 2, 2, 1, 1, 1, 5, 4}
//    }
//
//
//}
