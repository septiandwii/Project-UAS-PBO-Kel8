package Adonan;

import Harga.HargaRotiManisPerPcs;
import Harga.HargaRotiPizzaPerPcs;
import Harga.HargaRotiTawarPerPcs;

public class Main {
    public static void main(String[] args) {
//        Sisa sisaBahan = new Sisa();
//        BahanRotiManisPerPcs manisPerPcs = new BahanRotiManisPerPcs();
//        sisaBahan.cekBahan(manisPerPcs.tepungTerigu(), manisPerPcs.gulaPasir(), manisPerPcs.butter(), manisPerPcs.ragi(), manisPerPcs.susuBubuk(), manisPerPcs.susuCair(), manisPerPcs.telur(), manisPerPcs.esBatu());
//        System.out.println(sisaBahan.tepungTerigu);

        System.out.println("Pizza");
        HargaRotiPizzaPerPcs p1 = new HargaRotiPizzaPerPcs();
        System.out.println(p1.modal);
        System.out.println(p1.profit);
        System.out.println(p1.hargaJual);

        System.out.println("Manis");
        HargaRotiManisPerPcs p2 = new HargaRotiManisPerPcs();
        System.out.println(p2.modal);
        System.out.println(p2.profit);
        System.out.println(p2.hargaJual);

        System.out.println("Tawar");
        HargaRotiTawarPerPcs p3 = new HargaRotiTawarPerPcs();
        System.out.println(p3.modal);
        System.out.println(p3.profit);
        System.out.println(p3.hargaJual);
    }

}
