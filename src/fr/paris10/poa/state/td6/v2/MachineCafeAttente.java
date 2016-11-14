package fr.paris10.poa.state.td6.v2;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafeAttente implements MachineCafeState {
    private int c;

    public MachineCafeAttente(int c) {
        this.c = c;
    }

    @Override
    public void askCoffe(MachineCafe master) throws MachineCafeException {
        throw new MachineCafeException("Impossible de servir du thé");
    }

    @Override
    public void askTea(MachineCafe master) throws MachineCafeException {
        throw new MachineCafeException("Impossible de servir du café");
    }

    @Override
    public void give(int n, MachineCafe master) throws Exception {
        if( n < 0 ) {
            throw new MachineCafeException("Vous ne pouvez pas donner une valeure négative");
        }
        System.out.println("Vous avez donné "+ n);
        c = c + n;
        System.out.print("Argent disponible dans la machine = " + c);
        if(c >= MachineCafe.prix) {
            master.setState(new MachineCafeFonctionne(c));
        }
    }

    @Override
    public int getRefund(MachineCafe master) {
        int reste = c;
        c = 0;
        return reste;
    }
}
