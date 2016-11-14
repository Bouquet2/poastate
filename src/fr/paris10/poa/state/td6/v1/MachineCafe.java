package fr.paris10.poa.state.td6.v1;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafe {
    private MachineCafeState state;
    static int prix = 10;

    public MachineCafe() {
        this.state = new MachineCafeAttente(0);
    }

    public void askCoffe() throws Exception {
        this.state = state.askCoffe();
    }

    public void askTea() throws Exception {
        this.state = state.askTea();
    }

    public MachineCafeState getState() {
        return state;
    }

    public void give(int n) throws Exception {
        this.state = state.give(n);
    }

    public void setState(MachineCafeState state) {
        this.state = state;
    }


}
