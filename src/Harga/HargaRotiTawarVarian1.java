package Harga;

public class HargaRotiTawarVarian1 {
    public int modal;
    public int hargaJual;
    public int profit;
    HargaRotiTawarPerPcs rotiTawarPerPcs = new HargaRotiTawarPerPcs();
    HargaTopFill topFill= new HargaTopFill();

    public HargaRotiTawarVarian1() {
        modal = (int) (rotiTawarPerPcs.modal + (topFill.hargaCoklatPerGram * 80));
        profit = (int) (modal * 0.4);
        hargaJual = modal +profit;
    }
}
