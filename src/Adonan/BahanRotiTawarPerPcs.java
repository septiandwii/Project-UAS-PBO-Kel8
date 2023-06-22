package Adonan;

import BahanRoti.RotiTawar;

public class BahanRotiTawarPerPcs extends RotiTawar {
    @Override
    public double tepungTerigu() {
        int total = 2065/50;
        return 1000/total;
    }

    @Override
    public double gulaPasir() {
        int total = 2065/50;
        return 125/total;
    }

    @Override
    public double butter() {
        int total = 2065/50;
        return 100/total;
    }

    @Override
    public double ragi() {
        int total = 2065/50;
        return 20/total;
    }

    @Override
    public double susuBubuk() {
        int total = 2065/50;
        return 250/total;
    }

    @Override
    public double susuCair() {
        int total = 2065/50;
        return 200/total;
    }

    @Override
    public double telur() {
        int total = 2065/50;
        return 70/total;
    }

    @Override
    public double esBatu() {
        int total = 2065/50;
        return 300/total;
    }
}
