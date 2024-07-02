package politicalZones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static politicalZones.PoliticalZones.getPoliticalZones;

class PoliticalZonesTest {
//    @Test
//    public void testPoliticalZones(){
//        PoliticalZones politicalZones = PoliticalZones;
//        assertNotNull(politicalZones);
//         }
    @Test
    public void testGetPoliticalZones() {
        PoliticalZones politicalZones = PoliticalZones.getPoliticalZones("Plateu");
            assertEquals(politicalZones, PoliticalZones.NORTH_CENTRAL);

        }

    }
