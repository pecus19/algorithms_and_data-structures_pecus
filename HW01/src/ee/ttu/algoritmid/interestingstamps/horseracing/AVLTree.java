package ee.ttu.algoritmid.interestingstamps.horseracing;

import java.util.ArrayList;
import java.util.List;

public class AVLTree {
    ArrayList<Node> listOfNodes = new ArrayList<>();
    Node closest = null;
    double distance = Double.MAX_VALUE;
    List<RacingParticipant> allNodes = new ArrayList<>();



    public Node root;

    public Node find(RacingParticipant racingParticipant) {
        Node current = root;
        while (current != null) {
            if (current == racingParticipant) {
                break;
            }
            current = current.racingParticipant.getHeight() < racingParticipant.getHeight() ? current.right : current.left;
        }
        return current;
    }

    public void insert(RacingParticipant racingParticipant) {
        root = insert(root, racingParticipant);
    }

    public void delete(RacingParticipant racingParticipant) {
        root = delete(root, racingParticipant);
    }

    public Node getRoot() {
        return root;
    }

//    public int height() {
//        return root == null ? -1 : root.height;
//    }

    private Node insert(Node node, RacingParticipant racingParticipant) {
        if (node == null) {
            return new Node(racingParticipant);
        } else if (node.racingParticipant.getHeight() > racingParticipant.getHeight()) {
            node.left = insert(node.left, racingParticipant);
        } else if (node.racingParticipant.getHeight() < racingParticipant.getHeight()) {
            node.right = insert(node.right, racingParticipant);
        } else {
            node.right = insert(node.right, racingParticipant);
        }
        allNodes.add(node.racingParticipant);
        return rebalance(node);
    }

    Node deleteKey(RacingParticipant racingParticipant) {
        root = delete(root, racingParticipant);
        return root;
    }

    private Node delete(Node node, RacingParticipant racingParticipant) {
        if (node == null) {
            return node;
        } else if (node.racingParticipant.getHeight() > racingParticipant.getHeight()) {
            node.left = delete(node.left, racingParticipant);
        } else if (node.racingParticipant.getHeight() < racingParticipant.getHeight()) {
            node.right = delete(node.right, racingParticipant);
        } else {
            if (node.left == null || node.right == null) {
                node = (node.left == null) ? node.right : node.left;
            } else {
                Node mostLeftChild = mostLeftChild(node.right);
                node.racingParticipant = mostLeftChild.racingParticipant;
                node.right = delete(node.right, mostLeftChild.racingParticipant);
            }
        }

        if (node != null) {
            node = rebalance(node);
        }
        return node;
    }


    private Node mostLeftChild(Node node) {
        Node current = node;
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    private Node rebalance(Node z) {
        updateHeight(z);
        int balance = getBalance(z);
        if (balance > 1) {
            if (height(z.right.right) > height(z.right.left)) {
                z = rotateLeft(z);
            } else {
                z.right = rotateRight(z.right);
                z = rotateLeft(z);
            }
        } else if (balance < -1) {
            if (height(z.left.left) > height(z.left.right)) {
                z = rotateRight(z);
            } else {
                z.left = rotateLeft(z.left);
                z = rotateRight(z);
            }
        }
        return z;
    }

    private Node rotateRight(Node y) {
        Node x = y.left;
        Node z = x.right;
        x.right = y;
        y.left = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private Node rotateLeft(Node y) {
        Node x = y.right;
        Node z = x.left;
        x.left = y;
        y.right = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private void updateHeight(Node n) {
        n.height = 1 + Math.max(height(n.left), height(n.right));
    }

    private int height(Node n) {
        return n == null ? -1 : n.height;
    }

    public int getBalance(Node n) {
        return (n == null) ? 0 : height(n.right) - height(n.left);
    }

    public void findSuitableHorse(Node node, RacingParticipant participant) {
        if (node == null) {
            return;
        }
        double horseHeight = node.racingParticipant.getHeight();
        double jockeyHeight = participant.getHeight();
        double heightDiff = jockeyHeight - horseHeight;
        if (jockeyHeight > horseHeight) {
            if (heightDiff <= 15 && heightDiff >= 5) {
                findClosestToTen(node, participant);
                findSuitableHorse(node.right, participant);
            } else if (heightDiff >= 15) {
                findSuitableHorse(node.right, participant);
                return;
            } else if (heightDiff <= 5) {
                findSuitableHorse(node.left, participant);
                return;
            }
        } else if (jockeyHeight < horseHeight) {
            findSuitableHorse(node.left, participant);
            return;
        }
        findSuitableHorse(node.left, participant);
    }

    private double closer(double a, double b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }

    public void findSuitableJockey(Node node, RacingParticipant participant) {
        if (node == null) {
            return;
        }

        double jockeyHeight = node.racingParticipant.getHeight();
        double horseHeight = participant.getHeight();
        double heightDiff = jockeyHeight - horseHeight;
        if (jockeyHeight > horseHeight) {
            if (heightDiff <= 15 && heightDiff >= 5) {
                findClosestToTen(node, participant);
                findSuitableJockey(node.left, participant);
            } else if (heightDiff >= 15) {
                findSuitableJockey(node.left, participant);
                return;
            } else if (heightDiff <= 5) {
                findSuitableJockey(node.right, participant);
                return;
            }
        } else {
            findSuitableJockey(node.right, participant);
            return;
        }
        findSuitableJockey(node.right, participant);
    }


    public void findClosestToTen(Node node, RacingParticipant participant) {
        double newDistance;
        if (node.racingParticipant.getHeight() - participant.getHeight() < 0) {
            newDistance = participant.getHeight() - node.racingParticipant.getHeight();
        } else {
            newDistance = node.racingParticipant.getHeight() - participant.getHeight();
        }
        if (closest == null) {
            closest = node;
            distance = newDistance;
        } else {
            if (closer(newDistance, 10) < closer(distance, 10)) {
                closest = node;
                distance = newDistance;
            } else if (closer(newDistance, 10) == closer(distance, 10)) {
                if (node.racingParticipant.getHeight() < closest.racingParticipant.getHeight()) {
                    closest = node;
                    distance = newDistance;
                }
            }
        }
    }

    public String toString2() {
        if (root != null) {
            return root.printTree(new StringBuilder(), true, new StringBuilder()).toString();
        }
        return "";
    }
    void inorder() {
        inorder_Recursive(root);
    }

    // recursively traverse the BST
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            allNodes.add(root.racingParticipant);
            //System.out.print(root.getRacingParticipant().getHeight() + " ");
            inorder_Recursive(root.right);
        }
    }
    public List<RacingParticipant> getAllNodes() {
        allNodes.clear();
        inorder();
        return allNodes;
    }



}