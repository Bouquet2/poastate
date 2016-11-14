package fr.paris10.poa.state.td6.v1;

/**
 * Created by valentin on 14/11/16.
 */
public interface MachineCafeState {
    boolean askCoffe(MachineCafe master);
    boolean askTea(MachineCafe master);
    void give(int n, MachineCafe master);
}
