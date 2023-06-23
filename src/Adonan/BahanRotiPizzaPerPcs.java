package Adonan;

import BahanRoti.Pizza;
import BahanRoti.RotiTawar;

public class BahanRotiPizzaPerPcs extends Pizza implements TotalBeratBahan {
    int beratTotalAdonanPizza = 1950;
    int kebutuhanPizzaPerPCS = 190;
    @Override
    public double tepungTerigu() {
        int total = beratTotalAdonanPizza/kebutuhanPizzaPerPCS;
        return 1000/total;
    }

    @Override
    public double gulaPasir() {
        int total = beratTotalAdonanPizza/kebutuhanPizzaPerPCS;
        return 100/total;
    }

    @Override
    public double butter() {
        int total = beratTotalAdonanPizza/kebutuhanPizzaPerPCS;
        return 100/total;
    }

    @Override
    public double ragi() {
        int total = beratTotalAdonanPizza/kebutuhanPizzaPerPCS;
        return 20/total;
    }

    @Override
    public double susuBubuk() {
        int total = beratTotalAdonanPizza/kebutuhanPizzaPerPCS;
        return 200/total;
    }

    @Override
    public double susuCair() {
        int total = beratTotalAdonanPizza/kebutuhanPizzaPerPCS;
        return 180/total;
    }

    @Override
    public double telur() {
        int total = beratTotalAdonanPizza/kebutuhanPizzaPerPCS;
        return 50/total;
    }

    @Override
    public double esBatu() {
        int total = beratTotalAdonanPizza/kebutuhanPizzaPerPCS;
        return 300/total;
    }

    @Override
    public double getTotalBerat() {
        int TotalBeratPizza = (int)(tepungTerigu()+gulaPasir()+butter()+ragi()+susuBubuk()+susuCair() + esBatu() + telur());
        return beratTotalAdonanPizza;
    }
}
