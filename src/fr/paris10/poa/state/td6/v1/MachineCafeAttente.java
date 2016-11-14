package fr.paris10.poa.state.td6.v1;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafeAttente implements MachineCafeState {
    private int c;

    MachineCafeAttente(int c) {
        this.c = c;
    }

    @Override
    public MachineCafeState askCoffe() throws Exception {
        throw new MachineCafeException("Impossible de servir du café");
    }

    @Override
    public MachineCafeState askTea() throws Exception {
        throw new MachineCafeException("Impossible de servir du tea");
    }

    @Override
    public MachineCafeState give(int n) throws Exception {
        if( n < 0 ) {
            throw new MachineCafeException("Vous ne pouvez pas donner une valeur négative");
        }
        System.out.println("Vous avez donné "+ n);
        c = c + n;
        System.out.print("Argent disponible dans la machine = " + c);
        if(this.c >= MachineCafe.prix) {
            return new MachineCafeFonctionne(this.c);
        } else {
            return this;
        }
    }
}
