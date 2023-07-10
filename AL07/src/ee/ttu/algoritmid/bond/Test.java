package ee.ttu.algoritmid.bond;

public class Test {
    public void testUnfriendlyAfterTalking() {
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

//        if (!AL07.Network.UNFRIENDLY.equals(network)) {
//            fail("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
//        }

//        network = solution.memberOfNetwork("Dylan");
//
//        if (!AL07.Network.UNFRIENDLY.equals(network)) {
//            fail("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
//        }
//
//        network = solution.memberOfNetwork("Evan");
//
//        if (!AL07.Network.UNFRIENDLY.equals(network)) {
//            fail("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
//        }
//
//        network = solution.memberOfNetwork("Felipe");
//
//        if (!AL07.Network.UNFRIENDLY.equals(network)) {
//            fail("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
//        }
//
//        network = solution.memberOfNetwork("George");
//
//        if (!AL07.Network.UNFRIENDLY.equals(network)) {
//            fail("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
//        }
//
//        network = solution.memberOfNetwork("Homer");
//
//        if (!AL07.Network.UNFRIENDLY.equals(network)) {
//            fail("After talking to a person from unfriendly network, the person should belong to the unfriendly network");
//        }
//
//        solution.addPerson("Random");
//        network = solution.memberOfNetwork("Random");
//        if (!AL07.Network.UNKNOWN.equals(network)) {
//            fail("A person who hasn't talked to anybody should belong to UNKNOWN network");
//        }

    }
}
