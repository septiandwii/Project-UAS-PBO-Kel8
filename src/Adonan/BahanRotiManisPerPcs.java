package Adonan;

import BahanRoti.RotiManis;
import BahanRoti.RotiTawar;

public class BahanRotiManisPerPcs extends RotiManis {
    @Override
    public double tepungTerigu() {
        int total = 2350/50;
        return 1000/total;
    }

    @Override
    public double gulaPasir() {
        int total = 2350/50;
        return 150/total;
    }

    @Override
    public double butter() {
        int total = 2350/50;
        return 150/total;
    }

    @Override
    public double ragi() {
        int total = 2350/50;
        return 20/total;
    }

    @Override
    public double susuBubuk() {
        int total = 2350/50;
        return 300/total;
    }

    @Override
    public double susuCair() {
        int total = 2350/50;
        return 250/total;
    }

    @Override
    public double telur() {
        int total = 2350/50;
        return 80/total;
    }

    @Override
    public double esBatu() {
        int total = 2350/50;
        return 400/total;
    }
}
