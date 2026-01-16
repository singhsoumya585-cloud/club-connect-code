
package clubs;

import java.util.ArrayList;
import java.util.List;

public class ClubService {

    private List<Club> clubs = new ArrayList<>();

    public ClubService() {
        clubs.add(new Club("1", "Chess Club"));
        clubs.add(new Club("2", "Robotics Club"));
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public void joinClub(Club club) {
        club.addMember();
    }
}
