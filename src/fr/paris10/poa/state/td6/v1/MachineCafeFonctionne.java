package fr.paris10.poa.state.td6.v1;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafeFonctionne implements MachineCafeState {
    private int c;

    MachineCafeFonctionne(int c) {
        this.c = c;
    }

    @Override
    public MachineCafeState askCoffe() {
        System.out.println("Sert du café");
        return new MachineCafeAttente(0);
    }

    @Override
    public MachineCafeState askTea() {
        System.out.println("Sert du thé");
        return new MachineCafeAttente(0);
    }

    @Override
    public MachineCafeState give(int n) throws Exception {
        throw new MachineCafeException("Vous ne pouvez pas ajouter d'argent, la machine est pleine");
    }
}
