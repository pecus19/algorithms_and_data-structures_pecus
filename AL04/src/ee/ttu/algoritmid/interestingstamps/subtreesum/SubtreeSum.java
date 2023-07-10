package ee.ttu.algoritmid.interestingstamps.subtreesum;

public class SubtreeSum {
    static int res;

    /**
     * Calculate sum of all right children for every node
     *
     * @param rootNode root node of the tree. Use it to traverse the tree.
     * @return
     */
    public Node calculateRightSums(Node rootNode) {
        Node right = rootNode.getRight();
        Node left = rootNode.getLeft();
        long sumRight = 0;
        long sumLeft = 0;
        if (right != null) {
            calculateRightSums(rootNode.getRight());
            sumRight += right.getSumOfAllChildren();
        }
        if (left != null) {
            calculateRightSums(rootNode.getLeft());
            sumLeft += left.getSumOfAllChildren();
        }
        rootNode.setSumOfAllChildren(sumRight + sumLeft + rootNode.getValue());
        rootNode.setSumOfAllRight(sumRight);
        return rootNode;

    }

    public static void main(String[] args) throws Exception {
        /**
         *  Use this example to test your solution
         *                  Tree:
         *                   15
         *               /       \
         *             10         17
         *           /   \       /  \
         *         3     13     5    25
         */
        Node rootNode = new Node(15);
        Node a = new Node(10);
        Node b = new Node(17);
        Node c = new Node(3);
        Node d = new Node(13);
        Node e = new Node(5);
        Node f = new Node(25);

        rootNode.setLeft(a);
        rootNode.setRight(b);
        a.setLeft(c);
        a.setRight(d);
        b.setLeft(e);
        b.setRight(f);

        SubtreeSum solution = new SubtreeSum();
        solution.calculateRightSums(rootNode);


        System.out.println(rootNode.getSumOfAllRight());
        System.out.println(a.getSumOfAllRight());
        System.out.println(b.getSumOfAllRight());
        System.out.println(c.getSumOfAllRight());
        System.out.println(rootNode.getSumOfAllChildren());
        System.out.println(a.getSumOfAllChildren());
        System.out.println(b.getSumOfAllChildren());
        System.out.println(c.getSumOfAllChildren());

        if (rootNode.getSumOfAllRight() != 47 ||
                a.getSumOfAllRight() != 13 ||
                b.getSumOfAllRight() != 25 ||
                c.getSumOfAllRight() != 0) {
            throw new Exception("There is a mistake in your solution.");
        }

        System.out.println("Your solution should be working fine in basic cases, try to push.");

    }

}