package Adonan;

import BahanRoti.RotiTawar;

public class BahanRotiTawarPerPcs extends RotiTawar implements TotalBeratBahan{

    int beratTotalAdonanTawar = 2065;
    int kebutuhanPerPCSTawar = 400;
    @Override
    public double tepungTerigu() {
        int total = beratTotalAdonanTawar/kebutuhanPerPCSTawar;
        return 1000/total;
    }

    @Override
    public double gulaPasir() {
        int total = beratTotalAdonanTawar/kebutuhanPerPCSTawar;
        return 125/total;
    }

    @Override
    public double butter() {
        int total = beratTotalAdonanTawar/kebutuhanPerPCSTawar;
        return 100/total;
    }

    @Override
    public double ragi() {
        int total = beratTotalAdonanTawar/kebutuhanPerPCSTawar;
        return 20/total;
    }

    @Override
    public double susuBubuk() {
        int total = beratTotalAdonanTawar/kebutuhanPerPCSTawar;
        return 250/total;
    }

    @Override
    public double susuCair() {
        int total = beratTotalAdonanTawar/kebutuhanPerPCSTawar;
        return 200/total;
    }

    @Override
    public double telur() {
        int total = beratTotalAdonanTawar/kebutuhanPerPCSTawar;
        return 70/total;
    }

    @Override
    public double esBatu() {
        int total = beratTotalAdonanTawar/kebutuhanPerPCSTawar;
        return 300/total;
    }

    @Override
    public int getTotalBerat() {
        int totalBerat = (int) (tepungTerigu()+gulaPasir()+butter()+ragi()+susuBubuk()+susuCair() + esBatu() + telur()  );
        return totalBerat;
    }
}
