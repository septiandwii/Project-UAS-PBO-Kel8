package Varian;

import Adonan.BahanRotiManisPerPcs;
import Adonan.KelolaBahan;
import Adonan.KelolaTopFill;

public class RotiManisVarian1 {
    public BahanRotiManisPerPcs bahan = new BahanRotiManisPerPcs();
    public double keju = 5;
    public double coklat = 10;

    private int modalPerPcs(int kebutuhan){
        KelolaBahan kbManis = new KelolaBahan();
        KelolaTopFill ktfManis = new KelolaTopFill();
        kbManis.cekBahan(bahan.tepungTerigu()*kebutuhan, bahan.gulaPasir()*kebutuhan, bahan.butter()*kebutuhan, bahan.ragi()*kebutuhan, bahan.susuBubuk()*kebutuhan, bahan.susuCair()*kebutuhan, bahan.telur()*kebutuhan, bahan.esBatu()*kebutuhan);
        ktfManis.cekTopping(keju*kebutuhan, coklat*kebutuhan,0,0,0,0,0 );
        double modalManisVarian1 = kbManis.modal + ktfManis.modal;
        int  modalPerPcs = (int)(modalManisVarian1 / kebutuhan);
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
        int hargaPerPcs =(int)(modalPerPcs + profitPerPcs);
        return hargaPerPcs;
    }
}
