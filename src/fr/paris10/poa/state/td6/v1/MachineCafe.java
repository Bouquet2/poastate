package fr.paris10.poa.state.td6.v1;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafe {
    private MachineCafeState state;

    public MachineCafe() {
        this.state = new MachineCafeAttente(0);
    }

    public boolean askCoffe() {
        return state.askCoffe(this);
    }

    public boolean askTea() {
        return state.askTea(this);
    }

    public MachineCafeState getState() {
        return state;
    }

    public void give(int n) {
        state.give(n, this);
    }

    public void setState(MachineCafeState state) {
        this.state = state;
    }
}
