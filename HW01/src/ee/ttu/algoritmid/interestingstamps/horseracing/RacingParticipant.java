package ee.ttu.algoritmid.interestingstamps.horseracing;

public interface RacingParticipant {
    public enum Kind {

        HORSE,
        JOCKEY

    }
    public String getName();

    public Kind getKind();

    public double getHeight();

}