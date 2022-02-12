package plane;

public class Plane {

    public PlaneType type;

    public Plane(PlaneType planeType){
        this.type = planeType;
    }

    public PlaneType getType() {
        return this.type;
    }
}
