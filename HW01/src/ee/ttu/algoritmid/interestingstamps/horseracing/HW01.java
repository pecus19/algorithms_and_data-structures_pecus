package ee.ttu.algoritmid.interestingstamps.horseracing;

import java.util.ArrayList;
import java.util.List;

public class HW01 implements RacingRegistrationSystem {

    AVLTree btsHorses = new AVLTree();
    AVLTree btsJockey = new AVLTree();
    List<RacingParticipant> output = new ArrayList<>();
    AVLTree participantsWithoutDuo = new AVLTree();
//    List<RacingParticipant> participantsWithDuo = new ArrayList<>();

    @Override
    public RacingDuo registerToRacing(RacingParticipant participant) throws IllegalArgumentException {
        if (participant != null && participant.getName() != null && !participant.getName().trim().isEmpty() && participant.getKind() != null && participant.getHeight() > 0) {
            if (participant.getKind().equals(RacingParticipant.Kind.JOCKEY)) {
                btsHorses.findSuitableHorse(btsHorses.getRoot(), participant);
                Node node = btsHorses.closest;
                //System.out.println(btsHorses);
                if (node == null) {
                    btsJockey.insert(participant);
                    //btsJockey.inorder();
//                    participantsWithDuo.add(participant);

                } else {
                    RacingParticipant neededPart = node.racingParticipant;
                    btsHorses.root = btsHorses.deleteKey(node.racingParticipant);
                    btsHorses.deleteKey(node.racingParticipant);
                    //btsHorses.inorder();
//                    participantsWithDuo.remove(neededPart);
                    btsHorses.closest = null;
                    btsHorses.distance = Double.MAX_VALUE;
                    return new RacingDuo() {
                        @Override
                        public RacingParticipant getJockey() {
                            return participant;
                        }

                        @Override
                        public RacingParticipant getHorse() {
                            return neededPart;
                        }
                    };
                }
            } else {
                btsJockey.findSuitableJockey(btsJockey.getRoot(), participant);
                Node node = btsJockey.closest;
                if (node == null) {
//                    participantsWithDuo.add(participant);
                    btsHorses.insert(participant);

                } else {

                    RacingParticipant neededPart = node.racingParticipant;
                    btsJockey.root = btsJockey.deleteKey(node.racingParticipant);
                    btsJockey.deleteKey(node.racingParticipant);
                    //btsJockey.inorder();
//                    participantsWithDuo.remove(neededPart);
                    btsJockey.closest = null;
                    btsJockey.distance = Double.MAX_VALUE;
                    return new RacingDuo() {
                        @Override
                        public RacingParticipant getJockey() {
                            return neededPart;
                        }

                        @Override
                        public RacingParticipant getHorse() {
                            return participant;
                        }
                    };
                }
            }
            btsJockey.closest = null;
            btsJockey.distance = Double.MAX_VALUE;
            btsHorses.closest = null;
            btsHorses.distance = Double.MAX_VALUE;
        } else {
            throw new IllegalArgumentException();
        }
        return null;
    }


    @Override
    public List<RacingParticipant> participantsWithoutDuo() {
        AVLTree allParticipants = new AVLTree();

        List<RacingParticipant> allHorses = btsHorses.getAllNodes();
        for (RacingParticipant horse : allHorses) {
            allParticipants.insert(horse);
        }

        List<RacingParticipant> allJockeys = btsJockey.getAllNodes();
        for (RacingParticipant jockey : allJockeys) {
            allParticipants.insert(jockey);
        }

        return allParticipants.getAllNodes();
//        participantsWithDuo.sort(Comparator.comparing(RacingParticipant::getHeight));
//        return participantsWithDuo;
    }
}