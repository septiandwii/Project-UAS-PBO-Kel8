package Main;
import Adonan.KelolaBahan;
import Adonan.KelolaTopFill;
import Varian.*;

import java.util.Scanner;
public class TampilanMenu {

    int jmlRotiManisV1 = 0;
    int jmlRotiManisV2 = 0;
    int jmlRotiManisV3 = 0;
    int jmlRotiTawarV1 = 0;
    int jmlRotiTawarV2 = 0;
    int jmlPizzaV1 = 0;
    Scanner input;

    RotiManisVarian1 manisV1 = new RotiManisVarian1();
    RotiManisVarian2 manisV2 = new RotiManisVarian2();
    RotiManisVarian3 manisV3 = new RotiManisVarian3();
    RotiTawarVarian1 tawarV1 = new RotiTawarVarian1();
    RotiTawarVarian2 tawarV2 = new RotiTawarVarian2();
    RotiPizzaVarian1 pizzaV1 = new RotiPizzaVarian1();


    public TampilanMenu() {
        this.input = new Scanner(System.in);
    }

    void Display() {
        System.out.println("*****************************");
        System.out.println("      SELAMAT DATANG      ");
        System.out.println("            DI            ");
        System.out.println(" TOKO ROTI BERKAH BAROKAH ");
        System.out.println("****************************");

    }

    void Display2() {
        int milihMenu;
        do {
            System.out.println(" List Menu      :");
            System.out.println(" 1. Roti Manis");
            System.out.println(" 2. Roti Tawar");
            System.out.println(" 3. Pizza");
            System.out.println(" 4. Keranjang");
            System.out.println(" 5. Keluar ");
            System.out.print("Masukkan pilihan: ");
            milihMenu = this.input.nextInt();
            if (milihMenu == 1) {
                System.out.println();
                Scanner input = new Scanner(System.in);
                System.out.println("List Varian Roti Manis :");
                System.out.println("- Varian 1 : Topping Coklat");
                System.out.println("             Isi Keju & Coklat");
                System.out.println();
                System.out.println("- Varian 2 : Topping Krim Vanilla");
                System.out.println("             Isi Red Bean");
                System.out.println();
                System.out.println("- Varian 3 : Isi Keju Sosis");
                System.out.println("             - tanpa topping");
                System.out.print("Pilih list varian : ");
                int pilihan = input.nextInt();
                if(pilihan == 1){
                    System.out.print("Masukan jumlah : ");
                    int jumlah = input.nextInt();
                    jmlRotiManisV1 = jmlRotiManisV1 + jumlah;
                    System.out.println(jmlRotiManisV1);
                } else if(pilihan == 2){
                    System.out.print("Masukan jumlah : ");
                    int jumlah = input.nextInt();
                    this.jmlRotiManisV2 += jumlah;
                } else if(pilihan == 3){
                    System.out.print("Masukan jumlah : ");
                    int jumlah = input.nextInt();
                    this.jmlRotiManisV3 += jumlah;
                }
            }

            if (milihMenu == 2) {
                System.out.println();
                Scanner input = new Scanner(System.in);

                System.out.println("List Varian Roti Tawar:");
                System.out.println("- Varian 1 : Isian Coklat");
                System.out.println();
                System.out.println("- Varian 2 : Isian Keju");
                System.out.print("Pilih list varian :");
                int pilihan = input.nextInt();
                if(pilihan == 1){
                    System.out.print("Masukan jumlah : ");
                    int jumlah = input.nextInt();
                    this.jmlRotiTawarV1 += jumlah;
                } else if(pilihan == 2){
                    System.out.print("Masukan jumlah : ");
                    int jumlah = input.nextInt();
                    this.jmlRotiTawarV2 += jumlah;
                }
            }

            if (milihMenu == 3) {
                System.out.println();
                Scanner input = new Scanner(System.in);
                System.out.println("List Varian Pizza : ");
                System.out.println("- Varian 1 : topping Sosis,Bawang Bombay,Keju");
                System.out.print("Pilih list varian : ");
                int pilihan = input.nextInt();
                if(pilihan == 1) {
                    System.out.print("Masukan jumlah : ");
                    int jumlah = input.nextInt();
                    this.jmlPizzaV1 += jumlah;
                }
            }

            if (milihMenu == 4){
                System.out.println("===== DETAIL PESANAN =====");
                System.out.println("1. Roti Manis Varian 1 : ");
                System.out.println("    - Jumlah : "+this.jmlRotiManisV1);
                System.out.println("    - Harga per pcs : Rp "+manisV1.hargaPerPcs(jmlRotiManisV1));
                System.out.println("    - Harga total : Rp "+manisV1.hargaPerPcs(jmlRotiManisV1)*jmlRotiManisV1);
                System.out.println("2. Roti Manis Varian 2 : ");
                System.out.println("    - Jumlah : "+this.jmlRotiManisV2);
                System.out.println("    - Harga per pcs : Rp "+manisV2.hargaPerPcs(jmlRotiManisV2));
                System.out.println("    - Harga total : Rp "+manisV2.hargaPerPcs(jmlRotiManisV2)*jmlRotiManisV2);
                System.out.println("3. Roti Manis Varian 3 : ");
                System.out.println("    - Jumlah : "+this.jmlRotiManisV3);
                System.out.println("    - Harga per pcs : Rp "+manisV3.hargaPerPcs(jmlRotiManisV3));
                System.out.println("    - Harga total : Rp "+manisV3.hargaPerPcs(jmlRotiManisV3)*jmlRotiManisV3);
                System.out.println("4. Roti Tawar Varian 1 : ");
                System.out.println("    - Jumlah : "+this.jmlRotiTawarV1);
                System.out.println("    - Harga per pcs : Rp "+tawarV1.hargaPerPcs(jmlRotiTawarV1));
                System.out.println("    - Harga total : Rp "+tawarV1.hargaPerPcs(jmlRotiTawarV1)*jmlRotiTawarV1);
                System.out.println("5. Roti Tawar Varian 2 : ");
                System.out.println("    - Jumlah : "+this.jmlRotiTawarV2);
                System.out.println("    - Harga per pcs : Rp "+tawarV2.hargaPerPcs(jmlRotiTawarV2));
                System.out.println("    - Harga total : Rp "+tawarV2.hargaPerPcs(jmlRotiTawarV2)*jmlRotiTawarV2);
                System.out.println("6. Pizza Varian 1 : ");
                System.out.println("    - Jumlah : "+this.jmlPizzaV1);
                System.out.println("    - Harga per pcs : Rp "+pizzaV1.hargaPerPcs(jmlPizzaV1));
                System.out.println("    - Harga total : Rp "+pizzaV1.hargaPerPcs(jmlPizzaV1)*jmlPizzaV1);
            }
        } while(milihMenu != 5);

        System.out.println("Makasih telah berbelanja , sehat selalu ya !");
    }
}