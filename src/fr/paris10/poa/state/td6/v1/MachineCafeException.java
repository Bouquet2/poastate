package fr.paris10.poa.state.td6.v1;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafeException extends Exception{
    private String msg;
    public MachineCafeException(String msg) {
        super(new StringBuilder("Machine a café exception").append(msg).toString());
    }
}
