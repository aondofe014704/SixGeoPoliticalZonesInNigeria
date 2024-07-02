package politicalZones;

import java.util.Arrays;
import java.util.List;

public enum PoliticalZones {
    NORTH_CENTRAL("Benue", "Plateu", "Kogi", "Kwara", "Niger", "FCT","Nasarawa"),
    NORTH_EAST("Borno", "Yobe", "Taraba", "Adamawa","Bauchi", "Gombe", "Taraba"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa","Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Rivers", "Bayelsa","Cross-River", "Delta", "Edo"),
    SOUTH_WEST("Ondo", "Ogun", "Osun", "Lagos", "Oyo", "Ekiti");

    private String [] zones;

    PoliticalZones(String... zones) {
        this.zones = zones;
    }
   public List<String> getZones(){
        return Arrays.asList(zones);
   }
    public static PoliticalZones getPoliticalZones(String zones){
        for(PoliticalZones zone : PoliticalZones.values()){
            if(zone.getZones().contains(zones)) return zone;

            }
        return null;
    }
}
