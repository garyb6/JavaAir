package plane;

public class Plane {

    public PlaneType type;

    public Plane(PlaneType planeType){
        this.type = planeType;
    }

    public PlaneType getType() {
        return this.type;
    }

    public int getWeight(Plane plane){
        return plane.type.weight;
    }

    public int getCapacity(Plane plane){
        return plane.type.capacity;
    }
}
