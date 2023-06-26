package Adonan;

import BahanRoti.ToppingFilling;

public abstract class TopFilTambahan extends ToppingFilling {
    @Override
    public double keju() {
        return 250;
    }

    @Override
    public double coklat() {
        return 500;
    }

    @Override
    public double krimVanilla() {
        return 500;
    }

    @Override
    public double redBean() {
        return 500;
    }

    @Override
    public double sosis() {
        return 1000;
    }

    @Override
    public double smokeBeef() {
        return 1000;
    }

    @Override
    public double bawangBombay() {
        return 500;
    }
}
