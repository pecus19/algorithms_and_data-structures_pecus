package ee.ttu.algoritmid.interestingstamps;

import java.util.*;

public class InterestingStamps {
    public static List<Integer> findStamps(int sum, List<Integer> stampOptions) throws IllegalArgumentException {
//        if (sum <= 0) {
//
//        }
        if (stampOptions.size() <= 0) {
            throw new IllegalArgumentException();
        } else {
            ArrayList<ArrayList> result = new ArrayList();
            Collections.sort(stampOptions);
            backtrack(stampOptions, 0, sum, new ArrayList(), result);
            HashMap<Integer, ArrayList> map = new HashMap<>();
            HashMap<Integer, Integer> fakeMap = new HashMap<>();
            int occurrences = 0;
            int counter = 0;
            int size = 1000000000;
            for (int i = 0; i < result.size(); i++) {
                if (result.get(i).size() < size) {
                    size = result.get(i).size();
                }
            }
            for (int i = 0; i < result.size(); i++) {
                if (result.get(i).size() == size) {
                    map.put(counter, result.get(i));
                    fakeMap.put(counter, 100);
                    counter++;
                }
            }
            for (int i = 0; i < map.size(); i++) {
                if (fakeMap.get(i) != null) {
                    for (int j = 0; j < map.get(i).size(); j++) {
                        for (int k = 0; k < 10000; k += 10) {
                            if (map.get(i).get(j).equals(k)) {
                                if (map.get(j) != null) {
//                            System.out.println("!!!!!!");
                                    fakeMap.put(i, fakeMap.get(i) + 10);
//                                map.get(i).add(100); // works
//                            fakeMap.get(i).remove("1");
                                }
                            }
                        }
                        if (map.get(i).get(j).equals(1)) {
                            fakeMap.put(i, fakeMap.get(i) + 10);
                        }
                    }
                }
            }
            int maxKey = 0;
            for (Integer key : fakeMap.keySet()) {
                if (maxKey == 0 || fakeMap.get(key) < fakeMap.get(maxKey)) {
                    maxKey = key;
                }
            }
            return map.get(maxKey);
        }
//        System.out.println(maxKey);
//
//        System.out.println(fakeMap);

    }

    public static void backtrack(List<Integer> cand, int start, int target, ArrayList<
            Integer> list, ArrayList<ArrayList> result) {
        if (target < 0)
            return;
        if (target == 0)
            result.add(new ArrayList(list));
        for (int i = start; i < cand.size(); i++) {
            list.add(cand.get(i));
            backtrack(cand, i, target - cand.get(i), list, result);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(List.of(10));
//        ArrayList arrayList = new ArrayList<>(List.of());
        int target = 1000;
        System.out.println(findStamps(target, arrayList));
    }
}