package fr.paris10.poa.state.td6.v1;

/**
 * Created by valentin on 14/11/16.
 */
public interface MachineCafeState {
    MachineCafeState askCoffe() throws Exception;
    MachineCafeState askTea() throws Exception;
    MachineCafeState give(int n) throws Exception;
}
