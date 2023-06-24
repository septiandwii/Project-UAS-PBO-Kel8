package Harga;

public class HargaRotiManisVarian1 {
    public int modal;
    public int hargaJual;
    public int profit;
    HargaRotiManisPerPcs rotiManisPerPcs = new HargaRotiManisPerPcs();
    HargaTopFill topFill= new HargaTopFill();

    public HargaRotiManisVarian1() {
        modal = (int) ((rotiManisPerPcs.modal) + (topFill.hargaKejuPerGram *5) + (topFill.hargaCoklatPerGram*10));
        profit = (int) (modal * 0.4);
        hargaJual = modal +profit;
    }
}
