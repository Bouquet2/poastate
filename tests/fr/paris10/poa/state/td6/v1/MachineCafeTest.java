package fr.paris10.poa.state.td6.v1;

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
        this.machine = new MachineCafe();
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test(expectedExceptions = MachineCafeException.class)
    public void askCoffeFailed() throws Exception {
        machine.askCoffe();
    }

    @Test(expectedExceptions = MachineCafeException.class)
    public void askTeaFailed() throws Exception {
        machine.askTea();
    }

    @Test(expectedExceptions = MachineCafeException.class)
    public void giveFailed() throws Exception{
        machine.give(15);
        machine.give(10);
    }

    @Test
    public void giveAndAskCoffe() throws Exception {
        //TODO Vérifier qu'aucune exception n'est levé
        machine.give(15);
        machine.askCoffe();
    }

    @Test(expectedExceptions = MachineCafeException.class)
    public void giveFailedWhileWorking() throws Exception {
        machine.give(15);
        machine.give(10);
    }
}