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
    public void cekBahan(double tepungTerigu){
        if(this.tepungTerigu < tepungTerigu){
            System.out.println("Tepung terigu sebelum kulakan"+this.tepungTerigu);
            this.tepungTerigu += bahanTambahan.tepungTerigu();
            System.out.println("Tepung terigu setelah kulakan"+this.tepungTerigu);
            tepungTerigu -= this.tepungTerigu;
            System.out.println("tepung terigu dibutuhkan: "+tepungTerigu);
            cekBahan(tepungTerigu);

        } else {
            this.tepungTerigu -= tepungTerigu;
            System.out.println("Tepung terigu setelah dikurangi butuh: "+this.tepungTerigu);
        }

    }
}
