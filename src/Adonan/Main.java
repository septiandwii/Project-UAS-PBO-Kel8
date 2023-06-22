package Adonan;

public class Main {
    public static void main(String[] args) {
        Sisa sisaBahanRotiManis = new Sisa();
        BahanRotiManisPerPcs bahanRotiManisPerPcs = new BahanRotiManisPerPcs();
        sisaBahanRotiManis.cekBahan(bahanRotiManisPerPcs.tepungTerigu()*500);
    }
}
