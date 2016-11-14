package fr.paris10.poa.state.td6.v1;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafeAttente implements MachineCafeState {
    private int c;

    public MachineCafeAttente(int c) {
        this.c = c;
    }

    @Override
    public boolean askCoffe(MachineCafe master) {
        return false;
    }

    @Override
    public  boolean askTea(MachineCafe master) {
        return false;
    }

    @Override
    public void give(int n, MachineCafe master) {
        c = c + n;
        if(this.c >= 10) {
            master.setState(new MachineCafeFonctionne(this.c));
        }
    }
}
