package plane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING777);
    }

    @Test
    public void hasType(){
        assertEquals(PlaneType.BOEING777, plane.getType());
    }

    @Test
    public void canAccessCapacity(){
        assertEquals (350, plane.getCapacity(plane));
    }

    @Test
    public void canAccessWeight(){
        assertEquals (7500, plane.getWeight(plane));
    }
}
