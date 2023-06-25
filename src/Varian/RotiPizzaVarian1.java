package Varian;

import Adonan.BahanRotiPizzaPerPcs;
import Adonan.KelolaBahan;
import Adonan.KelolaTopFill;

public class RotiPizzaVarian1 {
    public BahanRotiPizzaPerPcs bahan = new BahanRotiPizzaPerPcs();
    public double keju = 30;
    public double sosis = 50;
    public double smokedBeef = 50;
    public double bawangBombay = 50;

    private int modalPerPcs(int kebutuhan){
        KelolaBahan kbPizza = new KelolaBahan();
        KelolaTopFill ktfPizza = new KelolaTopFill();
        kbPizza.cekBahan(bahan.tepungTerigu()*kebutuhan, bahan.gulaPasir()*kebutuhan, bahan.butter()*kebutuhan, bahan.ragi()*kebutuhan, bahan.susuBubuk()*kebutuhan, bahan.susuCair()*kebutuhan, bahan.telur()*kebutuhan, bahan.esBatu()*kebutuhan);
        ktfPizza.cekTopping(keju*kebutuhan, 0,0,0,sosis*kebutuhan,smokedBeef*kebutuhan, bawangBombay*kebutuhan);
        double modalPizzaVarian1 = kbPizza.modal + ktfPizza.modal;
        int  modalPerPcs = (int)(modalPizzaVarian1 / kebutuhan);
        return modalPerPcs;
    }

    private int profitPerPcs(int kebutuhan){
        double modalPerPcs = modalPerPcs(kebutuhan);
        int profitPerPcs = (int)(modalPerPcs * 0.4);
        return profitPerPcs;
    }

    public  int hargaPerPcs(int kebutuhan){
        double modalPerPcs = modalPerPcs(kebutuhan);
        double profitPerPcs = profitPerPcs(kebutuhan);
        int hargaPerPcs = (int) (modalPerPcs + profitPerPcs);
        return hargaPerPcs;
    }
}
