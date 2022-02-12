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

}
