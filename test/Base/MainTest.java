package Base;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {




    @Test
    @BeforeEach
    public void TestOrbitalObjectsCreation() {
        Planet mercury = new Planet( "BlueGray", 1, false, false, "Solsystem", 68);
        Planet venus = new Planet( "Yellow", 2, false, false, "Solsystem", 108);
        Planet earth = new Planet( "Blue", 3, true, false, "Solsystem", 150);
        Planet mars = new Planet( "Red", 4, false, false, "Solsystem", 246);
        Planet jupiter = new Planet("Yellow", 5, false, false, "Solsystem", 750);
        Planet saturn = new Planet( "Yellow", 6, false, false, "Solsystem", 1487);
        Planet uranus = new Planet( "LightBlue", 7, false, false, "Solsystem", 2857);
        Planet neptune = new Planet( "DarkBlue", 8, false, false, "Solsystem", 4476);

        Moon moon1 = new Moon(3,1,0);

        Moon moon2 = new Moon(4,1,1);

        Moon moon3 = new Moon(5,1,78);

        Moon moon4 = new Moon(6,1,81);

        Moon moon5 = new Moon(7,1,26);

        Moon moon6 = new Moon(8,1,13);


        assertNotEquals(mercury, Planet.getInstance(venus));


    }





//    @Test
//    public void TestPlanetVowelCount() {
//        String mercury = "Mercury";
//        String venus = "Venus";
//        String earth = "Earth";
//        String mars = "Mars";
//        String noWhere = null;
//
//        Planet planet = new Planet();
//
//        assertEquals(3, planet.vowelCount(mercury));
//        assertEquals(2, planet.vowelCount(venus));
//        assertEquals(2, planet.vowelCount(earth));
//        assertEquals(1, planet.vowelCount(mars));
//        assertEquals(0, planet.vowelCount(noWhere));
//
//
//    }

//    @Test
//    public void TestCreateObject() {
//        ArrayList<OrbitalObject> planets = new ArrayList<>();
//        Planet planet5 = new Planet();
//
//        planet5.setName("Jupiter");
//        planet5.setColor("Yellow");
//        planet5.setNumberInSystem(5);
//        planet5.setAMoon(false);
//        planet5.setLocation("Solsystem");
//        planet5.setHabitable(false);
//
//        //The distance is in million kilometers
//        planet5.setDistanceFromSun(779);
//        planet5.CirculateTheSun();
//        planet5.Rotate();
//
//        planets.add(planet5);
//        //Object (planet5) added to Arraylist called planets
//
//
//        assertTrue(planets.contains(planet5));
//        assertEquals(3, planet5.vowelCount(planet5.getName()));
//        assertEquals(3, planet5.vowelCount(planet5.getColor()));
//
//        //Same but simplified on 2. line
//        assertNotEquals(6, planet5.getNumberInSystem());
//        assertFalse(planet5.getNumberInSystem() == 6);
//
//        assertFalse(planet5.isAMoon());
//        assertFalse(planet5.isHabitable());
//
//        //Same but simplified on 2. line
//        assertTrue("Solsystem" == planet5.getLocation());
//        assertSame("Solsystem", planet5.getLocation());
//
//        assertFalse(planets.isEmpty());
//        assertNotEquals(999, planet5.vowelCount(planet5.getColor()));
//
//        assertEquals(779, planet5.getDistanceFromSun());
//
//    }


    @Test
    public void practice() {


        int x = 2;
        int y = 2;
        int z = 3;


        assertEquals(x == y, true);
        assertTrue(x == y);

        assertFalse(y == z);
    }

    @Test
    public void practice2() {


        int x = 2;
        int y = 2;
        int z = 3;

        boolean a = (x == y);
        boolean b = (y == z);


        //True - so will pass
        assertTrue(a);

        //False - so will pass
        assertFalse(b);

        //True - so will pass
        assertNotEquals(a, b);


    }

//    @Test
//    public void RegressionTest(){
//
//
//
//        int height = 400;
//        int width = 600;
//        int expected = 2000; //2 * 600+400 = 20
//        int actual = OrbitalObject.getPerimeter(height,width);
//
//        //Correct method to be 2 * (height + width) , instead of just (height + width)
//
//        assertNotEquals(expected,actual);
//
//
//    }

}