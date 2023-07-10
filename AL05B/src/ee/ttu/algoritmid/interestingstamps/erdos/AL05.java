package ee.ttu.algoritmid.interestingstamps.erdos;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class AL05 {
    public Graph graph = new Graph();

    private class Graph {
        private Map<String, List<String>> graph = new HashMap<>();
        private Map<String, Integer> erdosNumbers = new HashMap<>();
        List<String> list = new ArrayList<>();

        public void addDirectedEdge(String one, String other) {
            if (!graph.containsKey(one)) {
                List<String> edges = new ArrayList<>();
                edges.add(other);
                graph.put(one, edges);
            } else if (!graph.get(one).contains(other)) {
                graph.get(one).add(other);
            }
        }

        /**
         * Add undirected addEdge to the graph.
         *
         * @param one   one element of the edge
         * @param other the other element of edge
         */
        public void addEdge(String one, String other) {
            addDirectedEdge(one, other);
            addDirectedEdge(other, one);
            if (!erdosNumbers.containsKey(one)) {
                erdosNumbers.put(one, -1);
            }
            if (!erdosNumbers.containsKey(other)) {
                erdosNumbers.put(other, -1);
            }
        }

        /**
         * Return the graph.
         *
         * @return the internal graph structure.
         */
        public Map<String, List<String>> getGraph() {
            return graph;
        }

        /**
         * Perform breadth first search.
         *
         * @param goal the goal vertex to find
         * @return the Erdos number of goal or -1 if there is no chain of coauthors leading from Erdös to goal.
         * Note that search should always start from "Paul Erdös" whose Erdös number is 0.
         */
        public Integer breadthFirstSearch(String goal) {
            Queue<Integer> queue = new LinkedList<Integer>();
            Map<String, Integer> checkMap = new HashMap<>();
            for (Map.Entry<String, List<String>> entry : graph.entrySet()) {
                checkMap.put(entry.getKey(), -1);
            }
            boolean marked[] = new boolean[graph.size()];

            // create a queue
            Queue<String> que = new LinkedList<String>();
            que.add("Paul Erdös");
            checkMap.put("Paul Erdös", checkMap.get("Paul Erdös") + 1);
            marked[list.indexOf("Paul Erdös")] = true;
            // do until queue is empty
            while (que.size() > 0) {

                // get the first element of queue
                String x = "Paul Erdös";
                x = que.peek();

                // dequeue element
                que.remove();

                // traverse neighbors of node x
                for (int i = 0; i < graph.get(x).size(); i++) {
//                System.out.println(graph.get(x));
                    // b is neighbor of node x
                    String b = graph.get(x).get(i);
                    // if b is not marked already
                    if (!marked[list.indexOf(b)]) {

                        // enqueue b in queue
                        que.add(b);

                        // level of b is level of x + 1
                        int counter = 999999999;
                        if (graph.containsKey(b)) { // petja
                            for (int j = 0; j < graph.get(b).size(); j++) { // lox den ago paul
                                if (checkMap.get(graph.get(b).get(j)) < counter && checkMap.get(graph.get(b).get(j)) >= 0) {
                                    counter = checkMap.get(graph.get(b).get(j));
                                }
                            }
                        }
                        checkMap.put(b, counter + 1);

                        // mark b
                        marked[list.indexOf(b)] = true;
                    }
                }
            }
//        System.out.println(checkMap);
            return checkMap.get(goal);
        }
    }

    /**
     * Use buildGraphAndFindErdosNumber to build a graph using the Graph class and then use its breadthFirstSearch to
     * return the Erdos number.
     *
     * @param coauthors the list of people who have coauthored scientific papers as pairs
     *                  (e.g., [["Juhan", "Jaan"], ["Juhan", "Siiri"]] means that "Juhan" has published with "Jaan" and "Siiri")
     * @param scientist the name of the scientist whose Erdös number needs to be determined or -1 if it can`t be done
     * @return the Erdos number of the scientist
     */
    public Integer buildGraphAndFindErdosNumber(List<SimpleEntry<String, String>> coauthors,
                                                String scientist) {
        for (int i = 0; i < coauthors.size(); i++) {
            String pair = String.valueOf(coauthors.get(i));
            String[] subStr;
            subStr = pair.split("=");
            graph.addEdge(subStr[0], subStr[1]);
            if (!graph.list.contains(subStr[0])) {
                graph.list.add(subStr[0]);
            }
            if (!graph.list.contains(subStr[1])) {
                graph.list.add(subStr[1]);
            }
        }
        return graph.breadthFirstSearch(scientist);

    }

    public static void main(String[] args) {
//        public void testOnePathToAuthor() {
        AL05 impl = new AL05();
        List<SimpleEntry<String, String>> coauthors = new ArrayList<SimpleEntry<String, String>>();
        coauthors.add(new SimpleEntry("Paul Erdös", "Person2"));
        coauthors.add(new SimpleEntry("Person2", "Person3"));
        coauthors.add(new SimpleEntry("Person3", "Person4"));
        coauthors.add(new SimpleEntry("Person4", "Person5"));
//        coauthors.add(new SimpleEntry<>("Paul Erdös", "Petja"));
//        coauthors.add(new SimpleEntry<>("Paul Erdös", "Vanja"));
//        coauthors.add(new SimpleEntry<>("Vanja", "Ago"));
//        coauthors.add(new SimpleEntry<>("Petja", "Lox"));
//        coauthors.add(new SimpleEntry<>("Petja", "Den"));
//        coauthors.add(new SimpleEntry<>("Petja", "Ago"));
//        coauthors.add(new SimpleEntry<>("Vanja", "Nik"));
//        coauthors.add(new SimpleEntry<>("Nik", "Ja"));
        System.out.println(impl.buildGraphAndFindErdosNumber(coauthors, "Person5"));
//            test(response, 4);

    }
}

