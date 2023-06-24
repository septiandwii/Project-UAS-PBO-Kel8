package Harga;

import Adonan.BahanRotiTawarPerPcs;

public class HargaRotiTawarPerPcs extends HargaBahan {
    public double harga = 0;
    public int modal = 0;
    public int hargaJual;

    public int profit;
    BahanRotiTawarPerPcs bahan = new BahanRotiTawarPerPcs();

    public HargaRotiTawarPerPcs() {
        modal = (int) ((bahan.tepungTerigu() * this.hargaTepungTeriguPerGram) + (bahan.gulaPasir() * this.hargaGulaPasirPerGram) + (bahan.butter() * this.hargaButterPerGram) + (bahan.ragi() * this.hargaRagiPerGram) + (bahan.susuBubuk() * this.hargaSusuBubukPerGram) + (bahan.susuCair() * this.hargaSusuCairPerGram) + (bahan.telur() * this.hargaTelurPerGram) + (bahan.esBatu() * this.hargaEsBatuPerGram));
        profit = (int) ((int) modal * 0.4);
        hargaJual = modal + profit;
    }
}
