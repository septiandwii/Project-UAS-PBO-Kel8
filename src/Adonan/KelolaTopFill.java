//package Adonan;
//
//import BahanRoti.ToppingFilling;
//import Harga.HargaTopFill;
//
//public abstract class KelolaTopFill extends HargaTopFill {
//
//    public double keju = 0;
//    public double coklat = 0;
//    public double krimVanilla = 0;
//    public double redBean = 0;
//    public double sosis = 0;
//    public double smokeBeef = 0;
//    public double bawangBombay = 0;
//
//    public void cekTopping(double keju, double coklat, double krimVanilla, double redBean, double sosis, double smokeBeef, double bawangBombay){
//        this.cekKeju(keju);
//        this.cekCoklat(coklat);
//        this.cekKrimVanilla(krimVanilla);
//        this.cekRedBean(redBean);
//        this.cekSosis(sosis);
//        this.cekSmokeBeef(smokeBeef);
//        this.cekBawangBombay(bawangBombay);
//    }
//    private void cekKeju(double keju) {
//        double sisaKeju = keju;
//
//        while (this.keju < sisaKeju) {
//            this.keju += this.bahanTambahan.tepungTerigu();
//            this.modal += this.hargaTepungTerigu;
//            this.tepungTerigu -= tepungTerigu;
//            sisaTepungTeriguButuh -= tepungTerigu;
//        }
//        this.tepungTerigu -= tepungTerigu;
//    }
//}
