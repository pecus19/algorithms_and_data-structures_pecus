package ee.ttu.algoritmid.interestingstamps.horseracing;

import java.util.ArrayList;

public class Node {

    RacingParticipant racingParticipant;
    Node left;
    Node right;
    int height;
    ArrayList<RacingParticipant> potentialPairs = new ArrayList<>();

    public Node(RacingParticipant racingParticipant) {
        this.racingParticipant = racingParticipant;
        left = right = null;
    }

    public RacingParticipant getRacingParticipant() {
        return racingParticipant;
    }

    @Override
    public String toString() {
        return "Node{" +
                ", racingParticipant=" + racingParticipant +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
    public StringBuilder printTree(StringBuilder prefix, boolean isTail, StringBuilder sb) {
        if(right != null) {
            right.printTree(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
        }

        sb.append(prefix).append(isTail ? "└── " : "┌── ").append(racingParticipant.getHeight()).append("\n");

        if(left != null) {
            left.printTree(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
        }

        return sb;
    }

}