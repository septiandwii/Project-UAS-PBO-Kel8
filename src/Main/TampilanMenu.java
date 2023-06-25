package Main;
import java.util.Scanner;
public class TampilanMenu {
    Scanner input;

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
            System.out.println();
            System.out.println(" 4. Keluar ");
            System.out.print("Mau pilih yang mana ? ");
            milihMenu = this.input.nextInt();
            if (milihMenu == 1) {
                System.out.println();
                RotiManis1.Legit();
            }

            if (milihMenu == 2) {
                System.out.println();
                RotiTawar2.Biasa();
            }

            if (milihMenu == 3) {
                System.out.println();
                Pizza3.Sosis();
            }
        } while(milihMenu != 4);

        System.out.println("Makasih cuy dah bermain , sehat selalu ya !");
    }
}