package staff;

public class CabinCrewMember {

    private String name;
    private RankType rank;

    public CabinCrewMember(String name, RankType rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName(){
        return this.name;
    }

    public RankType getRank() {
        return this.rank;
    }

    public String giveAnnouncement(String item) {
        return String.format("Please buy our %s from the trolley", item);
    }
}
