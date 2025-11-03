
//Total biaya pengiriman bedasarkan berat paket, jarak tempuh, volume barang
import java.util.Scanner;

public class soalmudah1 {
    public static void main(String[] args) {
        //inputan
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();
        //rumus menghitung biaya
        double volume, beratpaket;
        volume = panjang*lebar*tinggi;
        beratpaket = volume;

        double biayajarak;
        if (jarak <= 10) {
            biayajarak = 4250;
        } else {
            biayajarak = 6000;
        }

        double biaya = beratpaket * biayajarak;

        double biayaextra = 0;
        if (volume > 100) {
            biayaextra = 50000;
        }

        //total biaya
        double totalbiaya = biaya+ biayaextra;

        System.out.println("\nRincian Biaya Pengiriman");
        System.out.println("Volume Paket : " + volume + " cm^3");
        System.out.println("Biaya Jarak : "+biayajarak);
        System.out.println("Biaya tambahan volume : Rp " + biayaextra);
        System.out.println("Total biaya kirim : Rp " + totalbiaya);
    }
}
