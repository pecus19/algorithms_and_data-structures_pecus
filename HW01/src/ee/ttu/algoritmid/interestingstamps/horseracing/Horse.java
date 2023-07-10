package ee.ttu.algoritmid.interestingstamps.horseracing;

public class Horse implements RacingParticipant {
    private String name;
    private Kind kind;
    private double height;

    public Horse(String name, Kind kind, double height) {
        this.name = name;
        this.kind = kind;
        this.height = height;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public Kind getKind() {
        return Kind.HORSE;
    }

    @Override
    public double getHeight() {
        return 0;
    }
}
