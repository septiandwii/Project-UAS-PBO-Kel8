package Harga;

import Adonan.BahanRotiPizzaPerPcs;

public class HargaRotiPizzaPerPcs extends HargaBahan {
    public int modal = 0;
    public int hargaJual;

    public int profit;
    BahanRotiPizzaPerPcs bahan = new BahanRotiPizzaPerPcs();

    public HargaRotiPizzaPerPcs(){
        modal = (int) ((bahan.tepungTerigu() * this.hargaTepungTeriguPerGram) + (bahan.gulaPasir() * this.hargaGulaPasirPerGram) + (bahan.butter() * this.hargaButterPerGram) + (bahan.ragi() * this.hargaRagiPerGram) + (bahan.susuBubuk() * this.hargaSusuBubukPerGram) + (bahan.susuCair() * this.hargaSusuCairPerGram) + (bahan.telur() * this.hargaTelurPerGram) + (bahan.esBatu() * this.hargaEsBatuPerGram));
        profit = (int) ((int) modal * 0.4);
        hargaJual = modal + profit;
    }
}
