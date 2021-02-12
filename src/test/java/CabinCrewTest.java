import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Simon", Rank.CAPTAIN);
    }

    @Test
    public void hasName() {
        assertEquals("Simon", cabinCrewMember.getName());
    }

    @Test
    public void canChangeName() {
        cabinCrewMember.setName("Teemo");
        assertEquals("Teemo", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, cabinCrewMember.getRank());
    }

    @Test
    public void canChangeRank() {
        cabinCrewMember.setRank(Rank.FIRSTOFFICER);
        assertEquals(Rank.FIRSTOFFICER, cabinCrewMember.getRank());
    }
}
