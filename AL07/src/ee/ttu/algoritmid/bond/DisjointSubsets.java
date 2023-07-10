package ee.ttu.algoritmid.bond;

import java.util.HashMap;
import java.util.Map;

public class DisjointSubsets {
    private Map<String, String> parent = new HashMap<>();

    // stores the depth of trees
    private Map<String, Integer> rank = new HashMap<>();

    public String find(String element) throws IllegalArgumentException {
        if (element == null) {
            throw new IllegalArgumentException("First");
        }
        if (parent.get(element) == null) {
            throw new IllegalArgumentException();
        }
        if (!parent.get(element).equals(element)) {
            // сжатие пути
            parent.put(element, find(parent.get(element)));
        }
        return parent.get(element);

    }

    public void union(String element1, String element2) throws IllegalArgumentException {
        if (element1 != null || element2 != null) {
            String x = find(element1);
            String y = find(element2);

            if (x.equals(y)) {
                return;
            }
            if (rank.get(x) > rank.get(y)) {
                parent.put(y, x);
            } else if (rank.get(x) < rank.get(y)) {
                parent.put(x, y);
            } else {
                parent.put(x, y);
                rank.put(y, rank.get(y) + 1);
            }
        } else {
            throw new IllegalArgumentException();
        }

    }


    public void addSubset(String element) throws IllegalArgumentException {
        // should throw IllegalArgumentException if the element is already present
        if (element != null) {
            if (parent.containsKey(element)) {
                throw new IllegalArgumentException();
            } else {
                parent.put(element, element);
                rank.put(element, 0);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void addFriendlySubset(String element) throws IllegalArgumentException {
        // should throw IllegalArgumentException if the element is already present
        if (element != null) {
            if (parent.containsKey(element)) {
                throw new IllegalArgumentException();
            } else {
                parent.put(element, element);
                rank.put(element, 1);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void addUnFriendlySubset(String element) throws IllegalArgumentException {
        // should throw IllegalArgumentException if the element is already present
        if (element != null) {
            if (parent.containsKey(element)) {
                throw new IllegalArgumentException();
            } else {
                parent.put(element, element);
                rank.put(element, 1);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}