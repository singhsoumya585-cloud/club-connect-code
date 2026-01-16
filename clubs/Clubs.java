package clubs;

public class Club {
    private String id;
    private String name;
    private int memberCount;

    public Club(String id, String name) {
        this.id = id;
        this.name = name;
        this.memberCount = 0;
    }

    public void addMember() {
        memberCount++;
    }

    public String getName() {
        return name;
    }
}

