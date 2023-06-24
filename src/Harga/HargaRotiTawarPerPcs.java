package Harga;

import Adonan.BahanRotiTawarPerPcs;

public class HargaRotiTawarPerPcs extends HargaBahan {
    public double harga = 0;
    BahanRotiTawarPerPcs bahan = new BahanRotiTawarPerPcs();

    public HargaRotiTawarPerPcs(){
        harga = (bahan.tepungTerigu() * this.hargaTepungTeriguPerGram) + (bahan.gulaPasir() * this.hargaGulaPasirPerGram) + (bahan.butter() * this.hargaButterPerGram) + (bahan.ragi() * this.hargaRagiPerGram) + (bahan.susuBubuk() * this.hargaSusuBubukPerGram) + (bahan.susuCair() * this.hargaSusuCairPerGram) + (bahan.telur() * this.hargaTelurPerGram) + (bahan.esBatu() * this.hargaEsBatuPerGram);
    }
}
