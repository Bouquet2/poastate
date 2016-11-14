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

    @Test
    public void machineCafeTest() throws Exception {
        machine.give(5);
        assertEquals(machine.askCoffe(), false);
        assertEquals(machine.askTea(), false);
        machine.give(30);
        assertEquals(machine.askTea(), true);
        assertEquals(machine.askCoffe(), false);
        machine.give(9);
        assertEquals(machine.askCoffe(), false);
    }

}