package Harga;

public class HargaRotiTawarVarian2 {
    int modal;
    int hargaJual;
    int profit;
    HargaRotiTawarPerPcs rotiTawarPerPcs = new HargaRotiTawarPerPcs();
    HargaTopFill topFill= new HargaTopFill();

    public HargaRotiTawarVarian2() {
        modal = (int) (rotiTawarPerPcs.modal + (topFill.hargaKejuPerGram * 80));
        profit = (int) (modal * 0.4);
        hargaJual = modal +profit;
    }
}
