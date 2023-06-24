package Harga;

public class HargaRotiManisVarian3 {
    int modal;
    int hargaJual;
    int profit;
    HargaRotiManisPerPcs rotiManisPerPcs = new HargaRotiManisPerPcs();
    HargaTopFill topFill= new HargaTopFill();

    public HargaRotiManisVarian3() {
        modal = (int) (rotiManisPerPcs.modal + (topFill.hargaKejuPerGram * 10) + (topFill.hargaSosisPerGram * 10));
        profit = (int) (modal * 0.4);
        hargaJual = modal +profit;
    }
}
