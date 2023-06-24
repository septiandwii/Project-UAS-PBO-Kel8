package Adonan;

import BahanRoti.RotiManis;
import Harga.HargaRotiManisPerPcs;
import Harga.HargaRotiManisVarian1;
import Harga.HargaRotiPizzaPerPcs;
import Harga.HargaRotiTawarPerPcs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BahanRotiManisPerPcs manis = new BahanRotiManisPerPcs();
        Sisa sisa = new Sisa();
        double butuh = 100.0;
        sisa.cekBahan(manis.tepungTerigu()*butuh, manis.gulaPasir()*butuh, manis.butter() * butuh, manis.ragi()*butuh, manis.susuBubuk()*butuh, manis.susuCair()*butuh, manis.telur()*butuh, manis.esBatu()*butuh);
        System.out.println(sisa.modal);
    }
}
