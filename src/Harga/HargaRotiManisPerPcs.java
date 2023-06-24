package Harga;

import Adonan.BahanRotiManisPerPcs;

public class HargaRotiManisPerPcs extends HargaBahan {
    public double harga = 0;
    BahanRotiManisPerPcs bahan = new BahanRotiManisPerPcs();

    public HargaRotiManisPerPcs(){
        harga = (bahan.tepungTerigu() * this.hargaTepungTeriguPerGram) + (bahan.gulaPasir() * this.hargaGulaPasirPerGram) + (bahan.butter() * this.hargaButterPerGram) + (bahan.ragi() * this.hargaRagiPerGram) + (bahan.susuBubuk() * this.hargaSusuBubukPerGram) + (bahan.susuCair() * this.hargaSusuCairPerGram) + (bahan.telur() * this.hargaTelurPerGram) + (bahan.esBatu() * this.hargaEsBatuPerGram);
    }
}
