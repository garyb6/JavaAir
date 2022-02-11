package plane;

public class Plane {

    private PlaneType type;

    public Plane(PlaneType planeType){
        this.type = planeType;
    }

    public PlaneType getType() {
        return this.type;
    }
}
