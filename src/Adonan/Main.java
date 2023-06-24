package Adonan;

import Harga.HargaRotiManisPerPcs;

public class Main {
    private static KelolaBahan kelolaBahan;

    public static void main(String[] args) {
//        BahanRotiManisPerPcs manis = new BahanRotiManisPerPcs();
//        KelolaBahan kelolaBahan = new KelolaBahan();
//        double butuh = 50;
//        kelolaBahan.cekBahan(manis.tepungTerigu()*butuh, manis.gulaPasir()*butuh, manis.butter() * butuh, manis.ragi()*butuh, manis.susuBubuk()*butuh, manis.susuCair()*butuh, manis.telur()*butuh, manis.esBatu()*butuh);
//        kelolaBahan.cekBahan(, 0,0,0,0,0,0,0);
//        System.out.println(kelolaBahan.modal);
//        HargaRotiManisPerPcs hargaRotiManisPerPcs = new HargaRotiManisPerPcs();
//        System.out.println(hargaRotiManisPerPcs.modal);
//        System.out.println(hargaRotiManisPerPcs.profit);
//        System.out.println(hargaRotiManisPerPcs.hargaJual);

        BahanRotiManisPerPcs p1 = new BahanRotiManisPerPcs();
        KelolaBahan kelolaBahan = new KelolaBahan();
        int jumlahRoti = 50;
        kelolaBahan.cekBahan(p1.tepungTerigu() * jumlahRoti, p1.gulaPasir() * jumlahRoti, p1.butter() * jumlahRoti, p1.ragi() * jumlahRoti, p1.susuBubuk() * jumlahRoti, p1.susuCair() * jumlahRoti, p1.telur() * jumlahRoti, p1.esBatu() * jumlahRoti);
        System.out.println("Modal Pembuatan Roti Manis Sebanyak 50pcs :" + kelolaBahan.modal);
    }
}
