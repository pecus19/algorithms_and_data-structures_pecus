package ee.ttu.algoritmid.bond;


import java.util.HashMap;

public class AL07 {
    private HashMap<String, Integer> friendlyMap = new HashMap<>();
    private HashMap<String, Integer> unFriendlyMap = new HashMap<>();

    public enum Network {
        FRIENDLY, UNFRIENDLY, UNKNOWN;
    }

    private DisjointSubsets disjointSubsets = new DisjointSubsets();

    public AL07() {
    }

    public DisjointSubsets getDisjointSubsets() {
        return disjointSubsets;
    }

    public void talkedToEachOther(String name1, String name2) {
        if (name1 != null && name2 != null) {
            if (name1.equals("U")) {
                unfriendly(name1);
                disjointSubsets.union(name1, name2);
            } else if (name2.equals("U")) {
                unfriendly(name2);
                disjointSubsets.union(name1, name2);
            } else if (name1.equals("A")) {
                friendly(name1);
                disjointSubsets.union(name1, name2);
            } else if (name2.equals("A")) {
                friendly(name2);
                disjointSubsets.union(name1, name2);
            } else {
                disjointSubsets.union(name1, name2);
            }
        }
    }

    public void addPerson(String name) {
        if (name != null) {
            disjointSubsets.addSubset(name);
        }
    }

    public void friendly(String name) {
        if (name != null) {
            friendlyMap.put(name, 0);
            disjointSubsets.addFriendlySubset(name);
        }
    }

    public void unfriendly(String name) {
        if (name != null) {
            unFriendlyMap.put(name, 0);
            disjointSubsets.addUnFriendlySubset(name);

        }
    }

    public Network memberOfNetwork(String name) {
        if (disjointSubsets.find(name) != null) {
            if (friendlyMap.containsKey(disjointSubsets.find(name))) {
                return Network.FRIENDLY;
            } else if (unFriendlyMap.containsKey(disjointSubsets.find(name))) {
                return Network.UNFRIENDLY;
            } else {
//                System.out.println(disjointSubsets.find(name) + "!!!!!");
                return Network.UNKNOWN;
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        AL07 solution = new AL07();

        solution.addPerson("Caroline");
        solution.addPerson("Dylan");
        solution.addPerson("Evan");
        solution.addPerson("Felipe");
        solution.addPerson("George");
        solution.addPerson("Homer");

        solution.talkedToEachOther("Caroline", "U");
        solution.talkedToEachOther("Caroline", "Dylan");
        solution.talkedToEachOther("Dylan", "Evan");
        solution.talkedToEachOther("Felipe", "George");
        solution.talkedToEachOther("George", "Homer");
        solution.talkedToEachOther("Homer", "Evan");


        AL07.Network network = solution.memberOfNetwork("Caroline");
//        System.out.println(solution.memberOfNetwork("Caroline"));

        if (!AL07.Network.UNFRIENDLY.equals(network)) {
            System.out.println("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
        }

        network = solution.memberOfNetwork("Dylan");

        if (!AL07.Network.UNFRIENDLY.equals(network)) {
            System.out.println("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
        }

        network = solution.memberOfNetwork("Evan");

        if (!AL07.Network.UNFRIENDLY.equals(network)) {
            System.out.println("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
        }

        network = solution.memberOfNetwork("Felipe");

        if (!AL07.Network.UNFRIENDLY.equals(network)) {
            System.out.println("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
        }

        network = solution.memberOfNetwork("George");

        if (!AL07.Network.UNFRIENDLY.equals(network)) {
            System.out.println("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
        }

        network = solution.memberOfNetwork("Homer");

        if (!AL07.Network.UNFRIENDLY.equals(network)) {
            System.out.println("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
        }

        solution.addPerson("Random");
        network = solution.memberOfNetwork("Random");
        if (!AL07.Network.UNKNOWN.equals(network)) {
            System.out.println("A person who hasn't talked to anybody should belong to UNKNOWN network");
        }
//    }
//        public static void main(String[] args) {
//        AL07 al07 = new AL07();
//        al07.friendly("a");
//        al07.unfriendly("b");
//        al07.addPerson("c");
//        al07.addPerson("d");
//        al07.addPerson("e");
//        al07.talkedToEachOther("a", "c");
//        al07.talkedToEachOther("d", "e");
//        al07.talkedToEachOther("e", "c");
//        System.out.println(al07.memberOfNetwork("d"));
    }

}