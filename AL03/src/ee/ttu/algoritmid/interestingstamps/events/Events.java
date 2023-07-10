package ee.ttu.algoritmid.interestingstamps.events;

import java.util.*;


public class Events {

    private final Map<Event, Integer> hashMap = new HashMap<>();
    public int top1Participants = 0;
    public int top2Participants = 0;

    public Events(int maxParticipants) {
    }

    public void registerParticipant(String eventName, int eventLengthMinutes, boolean freeTickets) {
        Event key1 = new Event(eventName, eventLengthMinutes, freeTickets);
        if (hashMap.containsKey(key1)) {
            hashMap.put(key1, hashMap.get(key1) + 1);
        } else {
            hashMap.put(key1, 1);
        }
        if (hashMap.get(key1) > top1Participants) {
            top1Participants = hashMap.get(key1);
        } else {
            if (hashMap.get(key1) <= top1Participants && hashMap.get(key1) > top2Participants) {
                top2Participants = hashMap.get(key1);
            }
        }

    }

    public int eventPopularity(String eventName, int eventLengthMinutes, boolean freeTickets) {
        Event key1 = new Event(eventName, eventLengthMinutes, freeTickets);
        if (hashMap.get(key1) == null) {
            return 0;
        }
        return hashMap.get(key1);
    }


    public int getTop1Participants() {
        return top1Participants;
    }

    public List<Integer> getTop2Participants() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(top1Participants);
        arrayList.add(top2Participants);
        return arrayList;
    }
//
//    public static void main(String[] args) {
//        hashMap.put("dssada", 2);
//        hashMap.put("dssdsadadaasdas", 42);
//        hashMap.put("dsasdad12qsada", 231);
//        hashMap.put("dswqeqe12sada", 23);
//        hashMap.put("dssasdasf12ada", 99);
//        hashMap.put("saafaf1", 1);

//    ArrayList<Integer> arrayList = new ArrayList<>();
//        Integer temp;
//        boolean sorted = false;
//
//        while (!sorted) {
//            sorted = true;
//            for (int i = 0; i < list.size() - 1; i++) {
//                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
//                    temp = list.get(i);
//                    list.set(i, list.get(i + 1));
//                    list.set(i + 1, temp);
//                    sorted = false;
//                }
//            }
//        }
//        System.out.println(list.get(list.size() - 1));
//    }

}