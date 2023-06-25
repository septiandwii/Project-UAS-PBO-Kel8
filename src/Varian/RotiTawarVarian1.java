package Varian;

import Adonan.BahanRotiTawarPerPcs;
import Adonan.KelolaBahan;
import Adonan.KelolaTopFill;

public class RotiTawarVarian1 {
    public BahanRotiTawarPerPcs bahan = new BahanRotiTawarPerPcs();
    public double coklat = 80;

    private int modalPerPcs(int kebutuhan){
        KelolaBahan kbTawar = new KelolaBahan();
        KelolaTopFill ktfTawar = new KelolaTopFill();
        kbTawar.cekBahan(bahan.tepungTerigu()*kebutuhan, bahan.gulaPasir()*kebutuhan, bahan.butter()*kebutuhan, bahan.ragi()*kebutuhan, bahan.susuBubuk()*kebutuhan, bahan.susuCair()*kebutuhan, bahan.telur()*kebutuhan, bahan.esBatu()*kebutuhan);
        ktfTawar.cekTopping(0, coklat*kebutuhan,0,0,0,0,0 );
        double modalTawarVarian1 = kbTawar.modal + ktfTawar.modal;
        int  modalPerPcs = (int)(modalTawarVarian1 / kebutuhan);
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
        int hargaPerPcs =(int) (modalPerPcs + profitPerPcs);
        return hargaPerPcs;
    }
}
