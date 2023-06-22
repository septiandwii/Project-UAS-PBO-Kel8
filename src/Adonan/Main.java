package Adonan;

public class Main {
    public static void main(String[] args) {
        Sisa sisaBahanRotiManis = new Sisa();
        BahanRotiManisPerPcs bahanRotiManisPerPcs = new BahanRotiManisPerPcs();
        sisaBahanRotiManis.cekBahan(bahanRotiManisPerPcs.tepungTerigu()*500);
        System.out.println(sisaBahanRotiManis.tepungTerigu);

        System.out.println("\n");

        sisaBahanRotiManis.cekBahan2(bahanRotiManisPerPcs.gulaPasir()*10000);
        System.out.println(sisaBahanRotiManis.gulaPasir);

        sisaBahanRotiManis.cekBahan3(bahanRotiManisPerPcs.butter()*10000);
        System.out.println(sisaBahanRotiManis.butter);

        sisaBahanRotiManis.cekBahan4(bahanRotiManisPerPcs.ragi()*10000);
        System.out.println(sisaBahanRotiManis.ragi);

        sisaBahanRotiManis.cekBahan5(bahanRotiManisPerPcs.susuBubuk()*10000);
        System.out.println(sisaBahanRotiManis.susuBubuk);

        sisaBahanRotiManis.cekBahan6(bahanRotiManisPerPcs.susuCair()*10000);
        System.out.println(sisaBahanRotiManis.susuCair);

        sisaBahanRotiManis.cekBahan7(bahanRotiManisPerPcs.telur()*10000);
        System.out.println(sisaBahanRotiManis.tepungTerigu);

        sisaBahanRotiManis.cekBahan8(bahanRotiManisPerPcs.esBatu()*10000);
        System.out.println(sisaBahanRotiManis.esBatu);
    }

}
