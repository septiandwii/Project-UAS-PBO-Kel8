package Adonan;

import BahanRoti.RotiTawar;

public class BahanRotiPizzaPerPcs extends RotiTawar {
    @Override
    public double tepungTerigu() {
        int total = 1950/190;
        return 1000/total;
    }

    @Override
    public double gulaPasir() {
        int total = 1950/190;
        return 100/total;
    }

    @Override
    public double butter() {
        int total = 1950/190;
        return 100/total;
    }

    @Override
    public double ragi() {
        int total = 1950/190;
        return 20/total;
    }

    @Override
    public double susuBubuk() {
        int total = 1950/190;
        return 200/total;
    }

    @Override
    public double susuCair() {
        int total = 1950/190;
        return 180/total;
    }

    @Override
    public double telur() {
        int total = 1950/190;
        return 50/total;
    }

    @Override
    public double esBatu() {
        int total = 1950/190;
        return 300/total;
    }
}
