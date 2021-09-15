package Base;


import java.util.ArrayList;

public class Planet extends OrbitalObject {

    public Planet(String color, int numberInSystem, boolean habitable, boolean isAMoon, String location, long distanceFromSun) {
        super(color, numberInSystem, habitable, isAMoon, location, distanceFromSun);
    }

//    public Planet() {
//
//    }

    public static Planet getPlanet(){
        
    }



    public ArrayList CreateOrbitalObject() {
        ArrayList<OrbitalObject> planets = new ArrayList<>();
        OrbitalObject earth = new OrbitalObject("Blue", 3, true, false, "Solsystem", 43) {
        };
        OrbitalObject mars = new OrbitalObject("Red", 4, false, false, "Solsystem", 43) {
        };
        planets.add(earth);
        planets.add(mars);
        return planets;
    }

    //Metode oprettet til jUnit test
    public int vowelCount(String s) {
        int count = 0;

        if (s == null) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (lowerCaseVowels.contains(s.charAt(i))) {
                count++;
            } else if (upperCaseVowels.contains(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public boolean isCapitalized(String s) {
        if (s == null || s.length() == 0) {
            return false;
        } else return (upperCaseVowels.contains(s.charAt(0)));
    }


}





