package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.Before;
import org.launchcode.java.demos.lsn5unittesting.main.Car;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CarTest {
    private Car test_car;

    @Before
    public void createCarObject(){
         test_car  = new Car("Toyota","Prius",10,50);

//        System.out.println(test_car);
    }
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){

        assertEquals(10,10,.001);

    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){

        assertEquals(10, test_car.getGasTankSize(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving(){
        assertEquals(0, 0,.001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception


}
