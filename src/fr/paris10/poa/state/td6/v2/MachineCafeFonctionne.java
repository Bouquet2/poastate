package fr.paris10.poa.state.td6.v2;

import javax.crypto.Mac;

/**
 * Created by valentin on 14/11/16.
 */
public class MachineCafeFonctionne implements MachineCafeState {
    private int c;

    public MachineCafeFonctionne(int c) {
        this.c = c;
    }

    @Override
    public void askCoffe(MachineCafe master) {
        System.out.println("Le café est servit");
        c = c - MachineCafe.prix;
        if(this.c <= 10)
            master.setState(new MachineCafeAttente(c));
    }

    @Override
    public void askTea(MachineCafe master) {
        System.out.println("Le thé est servit");
        c = c - MachineCafe.prix;
        if(this.c <= 10) {
            master.setState(new MachineCafeAttente(c));
        }
    }

    @Override
    public void give(int n, MachineCafe master) throws Exception {
        throw new MachineCafeException("Vous ne pouvez pas ajouter d'argent, la machine est déjà pleine");
    }

    @Override
    public int getRefund(MachineCafe master) {
        int reste = c;
        System.out.println("La machine vous rend " + c);
        c = 0;
        master.setState(new MachineCafeAttente(0));
        return reste;
    }
}
