package Harga;

import Adonan.BahanRotiPizzaPerPcs;

public class HargaRotiPizzaPerPcs extends HargaBahan {
    public double harga = 0;
    BahanRotiPizzaPerPcs bahan = new BahanRotiPizzaPerPcs();

    public HargaRotiPizzaPerPcs(){
        harga = (bahan.tepungTerigu() * this.hargaTepungTeriguPerGram) + (bahan.gulaPasir() * this.hargaGulaPasirPerGram) + (bahan.butter() * this.hargaButterPerGram) + (bahan.ragi() * this.hargaRagiPerGram) + (bahan.susuBubuk() * this.hargaSusuBubukPerGram) + (bahan.susuCair() * this.hargaSusuCairPerGram) + (bahan.telur() * this.hargaTelurPerGram) + (bahan.esBatu() * this.hargaEsBatuPerGram);
    }
}
