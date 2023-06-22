package Adonan;

import BahanRoti.RotiManis;
import BahanRoti.RotiTawar;

public class BahanRotiManisPerPcs extends RotiManis implements TotalBeratBahan {
    int beratTotalAdonanManis = 2350;
    int kebutuhanPerPCSManis = 50;
    @Override
    public double tepungTerigu() {
        int total = beratTotalAdonanManis/kebutuhanPerPCSManis;
        return 1000/total;
    }

    @Override
    public double gulaPasir() {
        int total = beratTotalAdonanManis/kebutuhanPerPCSManis;
        return 150/total;
    }

    @Override
    public double butter() {
        int total = beratTotalAdonanManis/kebutuhanPerPCSManis;
        return 150/total;
    }

    @Override
    public double ragi() {
        int total = beratTotalAdonanManis/kebutuhanPerPCSManis;
        return 20/total;
    }

    @Override
    public double susuBubuk() {
        int total = beratTotalAdonanManis/kebutuhanPerPCSManis;
        return 300/total;
    }

    @Override
    public double susuCair() {
        int total = beratTotalAdonanManis/kebutuhanPerPCSManis;
        return 250/total;
    }

    @Override
    public double telur() {
        int total = beratTotalAdonanManis/kebutuhanPerPCSManis;
        return 80/total;
    }

    @Override
    public double esBatu() {
        int total = beratTotalAdonanManis/kebutuhanPerPCSManis;
        return 400/total;
    }

    @Override
    public int getTotalBerat() {
        int totalBeratManis = (int)(tepungTerigu()+gulaPasir()+butter()+ragi()+susuBubuk()+susuCair() + esBatu() + telur());
        return totalBeratManis;
    }
}
