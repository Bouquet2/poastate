package fr.paris10.poa.state.td6.v2;

/**
 * Created by valentin on 14/11/16.
 */
public interface MachineCafeState {
    void askCoffe(MachineCafe master) throws MachineCafeException;
    void askTea(MachineCafe master) throws MachineCafeException;
    void give(int n, MachineCafe master) throws Exception;
    int getRefund(MachineCafe master);
}
