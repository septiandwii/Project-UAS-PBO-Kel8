package Adonan;

import BahanRoti.ToppingFilling;
import Harga.HargaTopFill;

public class KelolaTopFill extends HargaTopFill {
    TopFilTambahan tambahan = new TopFilTambahan() {
        @Override
        public double Redbean() {
            return 0;
        }
    };
    public double modal = 0;
    public double keju = 0;
    public double coklat = 0;
    public double krimVanilla = 0;
    public double redBean = 0;
    public double sosis = 0;
    public double smokeBeef = 0;
    public double bawangBombay = 0;

    public void cekTopping(double keju, double coklat, double krimVanilla, double redBean, double sosis, double smokeBeef, double bawangBombay){
        this.cekKeju(keju);
        this.cekCoklat(coklat);
        this.cekKrimVanilla(krimVanilla);
        this.cekRedBean(redBean);
        this.cekSosis(sosis);
        this.cekSmokeBeef(smokeBeef);
        this.cekBawangBombay(bawangBombay);
    }
    private void cekKeju(double keju) {
        double sisaKeju = keju;

        while (this.keju < sisaKeju) {
            this.keju += this.tambahan.keju();
            this.modal += this.hargaKeju;
            this.keju -= keju;
            sisaKeju -= keju;
        }
        this.keju -= keju;
    }
    private void cekCoklat(double coklat) {
        double sisaCoklat = coklat;

        while (this.coklat < sisaCoklat) {
            this.coklat += this.tambahan.coklat();
            this.modal += this.hargaCoklat;
            this.coklat -= coklat;
            sisaCoklat -= coklat;
        }
        this.coklat -= coklat;
    }
    private void cekKrimVanilla(double krimVanilla) {
        double sisaKrimVanilla = krimVanilla;

        while (this.krimVanilla < sisaKrimVanilla) {
            this.krimVanilla += this.tambahan.krimVanilla();
            this.modal += this.hargaKrimVanilla;
            this.krimVanilla -= krimVanilla;
            sisaKrimVanilla -= krimVanilla;
        }
        this.krimVanilla -= krimVanilla;
    }
    private void cekRedBean(double redBean) {
        double sisaRedBean= redBean;

        while (this.redBean < sisaRedBean) {
            this.redBean += this.tambahan.redBean();
            this.modal += this.hargaSelaiRedBean;
            this.redBean -= redBean;
            sisaRedBean -= redBean;
        }
        this.redBean -= redBean;
    }
    private void cekSosis(double sosis) {
        double sisaSosis = sosis;

        while (this.sosis < sisaSosis) {
            this.sosis += this.tambahan.sosis();
            this.modal += this.hargaSosis;
            this.sosis -= sosis;
            sisaSosis -= sosis;
        }
        this.sosis -= sosis;
    }
    private void cekSmokeBeef(double smokeBeef) {
        double sisaSmokeBeef = smokeBeef;

        while (this.smokeBeef < sisaSmokeBeef) {
            this.smokeBeef += this.tambahan.smokeBeef();
            this.modal += this.hargaSmokekedBeef;
            this.smokeBeef -= smokeBeef;
            sisaSmokeBeef -= smokeBeef;
        }
        this.smokeBeef -= smokeBeef;
    }
    private void cekBawangBombay(double bawangBombay) {
        double sisaBawangBombay = bawangBombay;

        while (this.bawangBombay < sisaBawangBombay) {
            this.bawangBombay += this.tambahan.bawangBombay();
            this.modal += this.hargaBawangBombay;
            this.bawangBombay -= bawangBombay;
            sisaBawangBombay -= bawangBombay;
        }
        this.bawangBombay -= bawangBombay;
    }
}
