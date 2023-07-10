package ee.ttu.algoritmid.interestingstamps.horseracing;

import java.util.List;

public interface RacingRegistrationSystem {

    public RacingDuo registerToRacing(RacingParticipant participant) throws IllegalArgumentException;

    public List<RacingParticipant> participantsWithoutDuo();
}