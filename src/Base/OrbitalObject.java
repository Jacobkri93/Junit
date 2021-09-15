package Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public abstract class OrbitalObject {

    private String color;
    private int numberInSystem;
    private boolean habitable;
    private boolean isAMoon;
    private String location;
    private long distanceFromSun;


    HashSet<Character> lowerCaseVowels = new HashSet<>();
    HashSet<Character> upperCaseVowels = new HashSet<>();

    public OrbitalObject() {
        lowerCaseVowels.add('a');
        lowerCaseVowels.add('e');
        lowerCaseVowels.add('i');
        lowerCaseVowels.add('o');
        lowerCaseVowels.add('u');
        lowerCaseVowels.add('y');

        upperCaseVowels.add('A');
        upperCaseVowels.add('E');
        upperCaseVowels.add('I');
        upperCaseVowels.add('O');
        upperCaseVowels.add('U');
        upperCaseVowels.add('Y');
    }


    public OrbitalObject(String color, int numberInSystem, boolean habitable, boolean isAMoon, String location, long distanceFromSun) {

        this.color = color;
        this.numberInSystem = numberInSystem;
        this.habitable = habitable;
        this.isAMoon = isAMoon;
        this.location = location;
        this.distanceFromSun = distanceFromSun;

    }

    public static OrbitalObject getInstance() {return OrbitalObject}


    public static ArrayList CreatePlanet(Planet planet) {
        ArrayList<Object> planetList = new ArrayList<>();
        planetList.add(planet);
        return planetList;
    }


    public static ArrayList CreateMoon(Moon... moons) {
        ArrayList<Object> MoonList = new ArrayList<>(moons.length);
        MoonList.addAll(Arrays.asList(moons));
        return MoonList;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberInSystem() {
        return numberInSystem;
    }

    public void setNumberInSystem(int numberInSystem) {
        this.numberInSystem = numberInSystem;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    public boolean isAMoon() {
        return isAMoon;
    }

    public void setAMoon(boolean AMoon) {
        isAMoon = AMoon;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(long distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public String CirculateTheSun() {
        return "circulating the sun..";
    }

    public String Rotate() {
        return "rotating..";
    }

    public static int getPerimeter(int height, int width) {

        return 2 * (height + width);
    }

    @Override
    public String toString() {
        return "Planetinfo: {" +

                ", The color of the planet is:'" + color + '\'' +
                ", Planet number from the sun: " + numberInSystem +
                ", Is it habitable?: " + habitable +
                ", Is it a moon?: " + isAMoon +
                ", The planet is located in the: " + location + '\'' +
                ", Distance from sun in mill km: " + distanceFromSun +
                '}';
    }
}





