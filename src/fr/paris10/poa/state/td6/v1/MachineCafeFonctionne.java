package fr.paris10.poa.state.td6.v1;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafeFonctionne implements MachineCafeState {
    int c;

    public MachineCafeFonctionne(int c) {
        this.c = c;
    }

    @Override
    public boolean askCoffe(MachineCafe master) {
        master.setState(new MachineCafeAttente(0));
        return true;
    }

    @Override
    public boolean askTea(MachineCafe master) {
        master.setState(new MachineCafeAttente(0));
        return true;
    }

    @Override
    public void give(int n, MachineCafe master) {
        this.c = c + n;
        if(this.c <= 10) {
            master.setState(new MachineCafeFonctionne(c));
        }
    }
}
