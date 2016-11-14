package fr.paris10.poa.state.td6.v2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafeTest {
    MachineCafe machine;
    @BeforeMethod
    public void setUp() throws Exception {
        machine = new MachineCafe();
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void machineCafeTest() throws Exception {
    }

    @Test(expectedExceptions = MachineCafeException.class)
    public void askCoffeFailed() throws Exception {
        machine.askCoffe();
    }

}