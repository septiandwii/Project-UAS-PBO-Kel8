package Adonan;
import Harga.HargaBahan;

public class KelolaBahan extends HargaBahan{
    BahanTambahan bahanTambahan = new BahanTambahan();
    public double modal = 0;
    double tepungTerigu = 0;
    double gulaPasir = 0;
    double butter = 0;
    double ragi = 0;
    double susuBubuk = 0;
    double susuCair = 0;
    double telur = 0;
    double esBatu = 0;
    public void cekBahan(double tepungTerigu, double gulaPasir, double butter, double ragi, double susuBubuk, double susuCair, double telur, double esBatu) {
        this.cekTepungTerigu(tepungTerigu);
        this.cekGulaPasir(gulaPasir);
        this.cekButter(butter);
        this.cekRagi(ragi);
        this.cekSusuBubuk(susuBubuk);
        this.cekSusuCair(susuCair);
        this.cekTelur(telur);
        this.cekEsBatu(esBatu);
    }

    private void cekTepungTerigu(double tepungTerigu) {
        double sisaTepungTeriguButuh = tepungTerigu;

        while (this.tepungTerigu < sisaTepungTeriguButuh) {
            this.tepungTerigu += this.bahanTambahan.tepungTerigu();
            this.modal += this.hargaTepungTerigu;
            this.tepungTerigu -= tepungTerigu;
            sisaTepungTeriguButuh -= tepungTerigu;
        }
        this.tepungTerigu -= tepungTerigu;
    }

    private void cekGulaPasir(double gulaPasir) {
        double sisaTepungGulaPasirButuh = gulaPasir;

        while (this.gulaPasir < sisaTepungGulaPasirButuh) {
            this.gulaPasir += this.bahanTambahan.gulaPasir();
            this.modal += this.hargaGulaPasir;
            this.gulaPasir -= gulaPasir;
            sisaTepungGulaPasirButuh -= gulaPasir;
        }
        this.gulaPasir -= gulaPasir;
    }

    private void cekButter(double butter) {
        double sisaButter = butter;

        while (this.butter < sisaButter) {
            this.butter += this.bahanTambahan.butter();
            this.modal += this.hargaButter;
            this.butter -= butter;
            sisaButter -= butter;
        }
        this.butter -= butter;
    }

    private void cekRagi(double ragi) {
        double sisaRagi = ragi;

        while (this.ragi < sisaRagi) {
            this.ragi += this.bahanTambahan.ragi();
            this.modal += this.hargaRagi;
            this.ragi -= ragi;
            sisaRagi -= ragi;
        }
        this.ragi -= ragi;
    }

    private void cekSusuBubuk(double susuBubuk) {
        double sisaSusuBubuk = susuBubuk;

        while (this.susuBubuk < sisaSusuBubuk) {
            this.susuBubuk += this.bahanTambahan.susuBubuk();
            this.modal += this.hargaSusuBubuk;
            this.susuBubuk -= susuBubuk;
            sisaSusuBubuk -= susuBubuk;
        }
        this.susuBubuk -= susuBubuk;
    }

    private void cekSusuCair(double susuCair) {
        double sisaSusuCair = susuCair;

        while (this.susuCair < sisaSusuCair) {
            this.susuCair += this.bahanTambahan.susuCair();
            this.modal += this.hargaSusuCair;
            this.susuCair -= susuCair;
            sisaSusuCair -= susuCair;
        }
        this.susuCair -= susuCair;
    }

    private void cekTelur(double telur) {
        double sisaTelur = telur;

        while (this.telur < sisaTelur) {
            this.telur += this.bahanTambahan.telur();
            this.modal += this.hargaTelur;
            this.telur -= telur;
            sisaTelur -= telur;
        }
        this.telur -= telur;
    }

    private void cekEsBatu(double esBatu) {
        double sisaEsBatu = esBatu;

        while (this.esBatu < sisaEsBatu) {
            this.esBatu += this.bahanTambahan.esBatu();
            this.modal += this.hargaEsBatu;
            this.esBatu -= esBatu;
            sisaEsBatu -= esBatu;
        }
        this.esBatu -= esBatu;
    }
}
