package Adonan;

import Harga.HargaBahan;

public class Sisa extends HargaBahan {
    BahanTambahan bahanTambahan = new BahanTambahan();

    double modal = 0;
    double tepungTerigu = 0;
    double gulaPasir = 0;
    double butter = 0;
    double ragi = 0;
    double susuBubuk = 0;
    double susuCair = 0;
    double telur = 0;
    double esBatu = 0;
    public void cekBahan(double tepungTerigu, double gulaPasir, double butter, double ragi, double susuBubuk, double susuCair, double telur, double esBatu){
        cekTepungTerigu(tepungTerigu);
        cekGulaPasir(gulaPasir);
        cekButter(butter);
        cekRagi(ragi);
        cekSusuBubuk(susuBubuk);
        cekSusuCair(susuCair);
        cekTelur(telur);
        cekEsBatu(esBatu);
        System.out.println("MODAL:"+this.modal);
    }

    private void cekTepungTerigu(double tepungTerigu){
        if(this.tepungTerigu < tepungTerigu){
            this.tepungTerigu += bahanTambahan.tepungTerigu();
            this.modal += this.hargaTepungTerigu;
            tepungTerigu -= this.tepungTerigu;
            this.tepungTerigu -= tepungTerigu;
            cekTepungTerigu(tepungTerigu);
        } else {
            this.tepungTerigu -= tepungTerigu;
        }
    }

    private void cekGulaPasir(double gulaPasir){
        if(this.gulaPasir < gulaPasir) {
            this.gulaPasir += bahanTambahan.gulaPasir();
            this.modal += this.hargaGulaPasir;
            gulaPasir -= this.gulaPasir;
            cekGulaPasir(gulaPasir);

        } else {
            this.gulaPasir -= gulaPasir;
        }
    }

    private void cekButter(double butter){
        if(this.butter < butter) {
            this.butter += bahanTambahan.butter();
            this.modal += this.hargaButter;
            butter -= this.butter;
            cekButter(butter);
        } else {
            this.butter -= butter;
        }
    }
    private void cekRagi(double ragi){

        if(this.ragi < ragi) {
            this.ragi += bahanTambahan.ragi();
            this.modal += this.hargaRagi;
            ragi -= this.ragi;
            cekRagi(ragi);
        } else {
            this.ragi -= ragi;
        }
    }

    private void cekSusuBubuk(double susuBubuk){
        if(this.susuBubuk < susuBubuk) {
            this.susuBubuk += bahanTambahan.susuBubuk();
            this.modal += this.hargaSusuBubuk;
            susuBubuk -= this.susuBubuk;
            cekSusuBubuk(susuBubuk);

        } else {
            this.susuBubuk -= susuBubuk;
        }
    }

    private void cekSusuCair(double susuCair){
        if(this.susuCair < susuCair) {
            this.susuCair += bahanTambahan.susuCair();
            this.modal += this.hargaSusuCair;
            susuCair -= this.susuCair;
            cekSusuCair(susuCair);

        } else {
            this.susuCair -= susuCair;
        }
    }

    private void cekTelur(double telur){
        if(this.telur < telur) {
            this.telur += bahanTambahan.telur();
            this.modal += this.hargaTelur;
            telur -= this.telur;
            cekTelur(telur);

        } else {
            this.telur -= telur;
        }
    }

    private void cekEsBatu(double esBatu){
        if(this.esBatu < esBatu) {
            this.esBatu += bahanTambahan.esBatu();
            this.modal += this.hargaEsBatu;
            esBatu -= this.esBatu;
            cekEsBatu(esBatu);

        } else {
            this.esBatu -= esBatu;
        }
    }
}
