import java.util.Scanner;

/**
 * Latihan35
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Program Tunjangan
 */

public class PBO10k10119176Latihan35 {
    public static void main(String[] args) {
        // TODO code application logic here
        double gajiPokok;
        String status;
        
        Scanner scanner = new Scanner(System.in);
        
        tunjangan myTunjangan = new tunjangan();
        
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa Gaji Pokok Anda Sebulan? : Rp. ");  
        gajiPokok = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum) ? : ");
        status = scanner.next();
        System.out.println("");
        
        myTunjangan.hitungTunjangan(gajiPokok, status);
        System.out.println("(Developed by : Muhammad Fauzan FB)");
    }
}
