package Adonan;

import Harga.HargaRotiManisPerPcs;

public class Main {
    public static void main(String[] args) {
//        BahanRotiManisPerPcs manis = new BahanRotiManisPerPcs();
//        KelolaBahan kelolaBahan = new KelolaBahan();
//        double butuh = 50;
//        kelolaBahan.cekBahan(manis.tepungTerigu()*butuh, manis.gulaPasir()*butuh, manis.butter() * butuh, manis.ragi()*butuh, manis.susuBubuk()*butuh, manis.susuCair()*butuh, manis.telur()*butuh, manis.esBatu()*butuh);
//        kelolaBahan.cekBahan(0, 0,0,0,0,0,0,0);
//        System.out.println(kelolaBahan.modal);
        HargaRotiManisPerPcs hargaRotiManisPerPcs = new HargaRotiManisPerPcs();
        System.out.println(hargaRotiManisPerPcs.modal);
        System.out.println(hargaRotiManisPerPcs.profit);
        System.out.println(hargaRotiManisPerPcs.hargaJual);
    }
}
