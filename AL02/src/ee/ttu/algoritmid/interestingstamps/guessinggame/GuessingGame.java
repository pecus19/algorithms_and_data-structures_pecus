package ee.ttu.algoritmid.interestingstamps.guessinggame;

import java.util.*;

public class GuessingGame {

    Teacher teacher;

    public GuessingGame(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * @param noteArray - All the possible notes.
     * @return the name of the note.
     * Note[] array = {new Note("A 3", 220.00),
     * new Note("A 4", 440.00),
     * new Note("E 4", 329.63),
     * new Note("Dis 5", 622.25),
     * new Note("G 2", 98.00),
     * new Note("Es 7", 2489.02),
     * new Note("C 3", 130.81),
     * new Note("B 3", 246.94)
     * };
     */
    public String play(Note[] noteArray) {
        Arrays.sort(noteArray, (first, second) -> (first.getFrequency() != second.getFrequency()) ?
                (int) (first.getFrequency() - second.getFrequency()) :
                (first.getName().compareTo(second.getName())));
        int lo = 0;
        int hi = noteArray.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (Objects.equals(teacher.isIt(noteArray[mid]), "higher")) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return noteArray[lo].getName();
    }

}
