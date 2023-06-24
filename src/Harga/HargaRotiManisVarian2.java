package Harga;

public class HargaRotiManisVarian2 {
    int modal;
    int hargaJual;
    int profit;
    HargaRotiManisPerPcs rotiManisPerPcs = new HargaRotiManisPerPcs();
    HargaTopFill topFill= new HargaTopFill();

    public HargaRotiManisVarian2() {
        modal = (int) (rotiManisPerPcs.modal + (topFill.hargaSelaiRedBeanPerGram * 10) + (topFill.hargaKrimVanillaPerGram * 5));
        profit = (int) (modal * 0.4);
        hargaJual = modal +profit;
    }
}
