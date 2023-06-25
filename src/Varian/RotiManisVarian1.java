package Varian;

import Adonan.BahanRotiManisPerPcs;
import Adonan.KelolaBahan;
import Adonan.KelolaTopFill;

public class RotiManisVarian1 {
    public BahanRotiManisPerPcs bahan = new BahanRotiManisPerPcs();
    public double keju = 5;
    public double coklat = 10;

    private double modalPerPcs(int kebutuhan){
        KelolaBahan kbManis = new KelolaBahan();
        KelolaTopFill ktfManis = new KelolaTopFill();
        kbManis.cekBahan(bahan.tepungTerigu()*kebutuhan, bahan.gulaPasir()*kebutuhan, bahan.butter()*kebutuhan, bahan.ragi()*kebutuhan, bahan.susuBubuk()*kebutuhan, bahan.susuCair()*kebutuhan, bahan.telur()*kebutuhan, bahan.esBatu()*kebutuhan);
        ktfManis.cekTopping(keju, coklat,0,0,0,0,0 );
        double modalManisVarian1 = kbManis.modal + ktfManis.modal;
        double  modalPerPcs = modalManisVarian1 / kebutuhan;
        return modalPerPcs;
    }

    private double profitPerPcs(int kebutuhan){
        double modalPerPcs = modalPerPcs(kebutuhan);
        double profitPerPcs = modalPerPcs * 0.4;
        return profitPerPcs;
    }

    public  double hargaPerPcs(int kebutuhan){
        double modalPerPcs = modalPerPcs(kebutuhan);
        double profitPerPcs = profitPerPcs(kebutuhan);
        double hargaPerPcs = modalPerPcs + profitPerPcs;
        return hargaPerPcs;
    }
}
