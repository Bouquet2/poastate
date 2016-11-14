package fr.paris10.poa.state.td6.v2;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafe {
    private MachineCafeState state;
    static int prix = 10;

    public MachineCafe() {
        this.state = new MachineCafeAttente(0);
    }

    public void askCoffe() throws MachineCafeException {
        state.askCoffe(this);
    }

    public void askTea() throws MachineCafeException {
        state.askTea(this);
    }

    public MachineCafeState getState() {
        return state;
    }

    public void give(int n) throws Exception{
        state.give(n, this);
    }

    public int getRefund() {
        return state.getRefund(this);
    }

    public void setState(MachineCafeState state) {
        this.state = state;
    }
}
