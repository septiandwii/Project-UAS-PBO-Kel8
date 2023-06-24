package Harga;

public class HargaRotiPizzaVarian1 {
    public int modal;
    public int hargaJual;
    public int profit;
    HargaRotiPizzaPerPcs rotiPizzaPerPcs = new HargaRotiPizzaPerPcs();
    HargaTopFill topFill= new HargaTopFill();

    public HargaRotiPizzaVarian1() {
        modal = (int) (rotiPizzaPerPcs.modal + (topFill.hargaKejuPerGram * 30) + (topFill.hargaSosisPerGram * 50) + (topFill.hargaSmokedBeefPerGram * 50) + (topFill.hargaBawangBombayPerGram * 30));
        profit = (int) (modal * 0.4);
        hargaJual = modal +profit;
    }
}
