package Harga;

import Adonan.BahanRotiManisPerPcs;
import Adonan.BahanRotiPizzaPerPcs;

public class HargaRotiManisPerPcs extends HargaBahan {
    public double harga = 0;
    public int modal = 0;
    public int hargaJual;

    public int profit;
    BahanRotiManisPerPcs bahan = new BahanRotiManisPerPcs();

    public HargaRotiManisPerPcs() {
        modal = (int) ((bahan.tepungTerigu() * this.hargaTepungTeriguPerGram) + (bahan.gulaPasir() * this.hargaGulaPasirPerGram) + (bahan.butter() * this.hargaButterPerGram) + (bahan.ragi() * this.hargaRagiPerGram) + (bahan.susuBubuk() * this.hargaSusuBubukPerGram) + (bahan.susuCair() * this.hargaSusuCairPerGram) + (bahan.telur() * this.hargaTelurPerGram) + (bahan.esBatu() * this.hargaEsBatuPerGram));
        profit = (int) ((int) modal * 0.4);
        hargaJual = modal + profit;
    }
}
