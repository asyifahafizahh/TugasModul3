import java.util.Scanner;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();
        /**
         * untuk menampilkan output menghitung volume balok
         */

        double volume = panjang * lebar * tinggi;
        /**
         * rumus untuk menghitung volume balok
         */

        System.out.println("Volume balok tersebut adalah: " + volume);
        /**
         * output untuk menampilkan hasil menghitung volume balok
         */
    }
}