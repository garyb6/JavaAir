package plane;

public enum PlaneType {
    BOEING777(350, 7500),
    AIRBUSA330(250, 5000);



    public final int capacity;
    public final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }
}
