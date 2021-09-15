package Base;

public class Moon extends OrbitalObject {



    public Moon(String color, int numberInSystem, boolean habitable, boolean isAMoon, String location, long distanceFromSun) {
        super(color, numberInSystem, habitable, isAMoon, location, distanceFromSun);
    }

    private int isMoonOfPlanetNum;
    private int moonNum;
    private int additional_moons_orbiting_planet;



    public Moon(int isMoonOfPlanetNum, int moonNum, int additional_moons_orbiting_planet){
        this.isMoonOfPlanetNum = isMoonOfPlanetNum;
        this.moonNum = moonNum;
        this.additional_moons_orbiting_planet = additional_moons_orbiting_planet;
    }

}
