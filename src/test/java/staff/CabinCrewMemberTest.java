package staff;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabincrewmember;

    @Before
    public void before(){
        cabincrewmember = new CabinCrewMember("Richard", RankType.SeniorCrew);
    }

    @Test
    public void hasName(){
        assertEquals("Richard", cabincrewmember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.SeniorCrew, cabincrewmember.getRank());
    }

    @Test
    public void canGiveAnnouncement(){
        assertEquals("Please buy our expensive tat from the trolley", cabincrewmember.giveAnnouncement("expensive tat"));

    }
}
