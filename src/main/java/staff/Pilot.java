package staff;

public class Pilot extends CabinCrewMember {

    private String licenceNum;

    public Pilot(String name, RankType rank, String licenceNum) {
        super(name, rank);
        this.licenceNum = licenceNum;
    }


    public String getLicenceNum() {
        return this.licenceNum;
    }

    public String flyPlane() {
        return "Where's the start button? Ah-ha! There it is! *pilot presses button*";
    }
}
