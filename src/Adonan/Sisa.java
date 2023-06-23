package Adonan;

public class Sisa {
    BahanTambahan bahanTambahan = new BahanTambahan();
    double tepungTerigu = 0;
    double gulaPasir = 0;
    double butter = 0;
    double ragi = 0;
    double susuBubuk = 0;
    double susuCair = 0;
    double telur = 0;
    double esBatu = 0;

    //    public void cekBahan(double tepungTerigu){
//        if(this.tepungTerigu < tepungTerigu){
//            System.out.println("Tepung terigu sebelum kulakan"+this.tepungTerigu);
//            this.tepungTerigu += dbahanTambahan.tepungTerigu();
//            System.out.println("Tepung terigu setelah kulakan"+this.tepungTerigu);
//            tepungTerigu -= this.tepungTerigu;
//            System.out.println("tepung terigu dibutuhkan: "+tepungTerigu);
//            cekBahan(tepungTerigu);
//
//        } else {
//            this.tepungTerigu -= tepungTerigu;
//            System.out.println("Tepung terigu setelah dikurangi butuh: "+this.tepungTerigu);
//        }
//
//    }
//    public void cekBahan2(double gulaPasir){
//        if(this.gulaPasir < gulaPasir) {
//            System.out.println("gula pasir sebelum kulakan " + this.gulaPasir);
//            this.gulaPasir += bahanTambahan.gulaPasir();
//            System.out.println("gula pasir setelah kulakan" + this.gulaPasir);
//            gulaPasir -= this.gulaPasir;
//            System.out.println("gula pasir dibutuhkan" + gulaPasir);
//            cekBahan2(gulaPasir);
//
//        } else {
//            this.gulaPasir -= gulaPasir;
//            System.out.println("Gula Pasir setelah dikurangi butuh" + this.gulaPasir);
//        }
//    }
//
//    public void cekBahan3(double butter){
//        if(this.butter < butter) {
//            System.out.println("butter sebelum kulakan " + this.butter);
//            this.butter += bahanTambahan.butter();
//            System.out.println("butter setelah kulakan" + this.butter);
//            butter -= this.butter;
//            System.out.println("butterr dibutuhkan" + butter);
//            cekBahan2(butter);
//
//        } else {
//            this.butter -= butter;
//            System.out.println("butter setelah dikurangi butuh" + this.butter);
//        }
//    }
//    public void cekBahan4(double ragi){
//        if(this.ragi < ragi) {
//            System.out.println("ragi sebelum kulakan " + this.ragi);
//            this.ragi += bahanTambahan.ragi();
//            System.out.println("ragi setelah kulakan" + this.ragi);
//            ragi -= this.ragi;
//            System.out.println("ragi dibutuhkan" + ragi);
//            cekBahan2(ragi);
//
//        } else {
//            this.ragi -= ragi;
//            System.out.println("ragi setelah dikurangi butuh" + this.ragi);
//        }
//    }
//    public void cekBahan5(double susuBubuk){
//        if(this.susuBubuk < susuBubuk) {
//            System.out.println("Susu Bubuk sebelum kulakan " + this.susuBubuk);
//            this.susuBubuk += bahanTambahan.susuBubuk();
//            System.out.println("Susu Bubuk setelah kulakan" + this.susuBubuk);
//            System.out.println();
//            susuBubuk -= this.susuBubuk;
//            System.out.println("Susu Bubuk dibutuhkan" + susuBubuk);
//            cekBahan2(susuBubuk);
//
//        } else {
//            this.susuBubuk -= susuBubuk;
//            System.out.println("Susu Bubuk setelah dikurangi butuh" + this.susuBubuk);
//        }
//    }
//    public void cekBahan6(double susuCair){
//        if(this.susuCair < susuCair) {
//            System.out.println("Susu Cair sebelum kulakan " + this.susuCair);
//            this.susuCair += bahanTambahan.susuCair();
//            System.out.println("Susu Cair setelah kulakan" + this.susuCair);
//            System.out.println();
//            susuCair -= this.susuCair;
//            System.out.println("Susu Cair dibutuhkann" + susuCair);
//            cekBahan2(susuCair);
//
//        } else {
//            this.susuCair -= susuCair;
//            System.out.println("Susu Cair setelah dikurangi butuh" + this.susuCair);
//        }
//    }
//    public void cekBahan7(double telur){
//        if(this.telur < telur) {
//            System.out.println("telur sebelum kulakan " + this.telur);
//            this.telur += bahanTambahan.telur();
//            System.out.println("telur setelah kulakan" + this.telur);
//            System.out.println();
//            telur -= this.telur;
//            System.out.println("telur dibutuhkan" + telur);
//            cekBahan2(telur);
//
//        } else {
//            this.telur -= telur;
//            System.out.println("telur setelah dikurangi butuh" + this.telur);
//        }
//    }
//    public void cekBahan8(double esBatu){
//        if(this.esBatu < esBatu) {
//            System.out.println("Es Batu sebelum kulakan " + this.esBatu);
//            this.esBatu += bahanTambahan.esBatu();
//            System.out.println("Es Batu setelah kulakaan" + this.esBatu);
//            System.out.println();
//            esBatu -= this.esBatu;
//            System.out.println("Es Batu diibutuhkan" + esBatu);
//            cekBahan2(esBatu);
//
//        } else {
//            this.esBatu -= esBatu;
//            System.out.println("Es Batu setelah dikurangi butuh" + this.esBatu);
//        }
//    }
    public void cekBahan(double tepungTerigu) {
        if (this.tepungTerigu < tepungTerigu) {
            System.out.println("Tepung terigu sebelum kulakan" + this.tepungTerigu);
            this.tepungTerigu += bahanTambahan.tepungTerigu();
            System.out.println("Tepung terigu setelah kulakan" + this.tepungTerigu);
            tepungTerigu -= this.tepungTerigu;
            System.out.println("tepung terigu dibutuhkan: " + tepungTerigu);
            cekBahan(tepungTerigu);

        } else {
            this.tepungTerigu -= tepungTerigu;
            System.out.println("Tepung terigu setelah dikurangi butuh: " + this.tepungTerigu);
        }
    }
}