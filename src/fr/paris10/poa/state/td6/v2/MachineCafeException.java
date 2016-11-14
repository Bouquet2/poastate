package fr.paris10.poa.state.td6.v2;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafeException extends Exception {
    public MachineCafeException(String msg) {
        super(new StringBuilder("Machine a café exception : ").append(msg).toString());
    }
}
