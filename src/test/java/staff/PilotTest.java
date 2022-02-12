package staff;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot ("Desmond", RankType.Captain, "li123");
    }

    @Test
    public void hasName(){
        assertEquals("Desmond", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.Captain, pilot.getRank());
    }

    @Test
    public void hasLicenceNum(){
        assertEquals("li123", pilot.getLicenceNum());
    }
}
