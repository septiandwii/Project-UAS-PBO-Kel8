package Adonan;

public class Main {
    public static void main(String[] args) {
        Sisa sisaBahanRotiManis = new Sisa();
        BahanRotiManisPerPcs bahanRotiManisPerPcs = new BahanRotiManisPerPcs();
        sisaBahanRotiManis.cekBahan(200, 0, 0, 0, 0, 0, 0, 0);
        System.out.println(sisaBahanRotiManis.tepungTerigu);
    }

}
