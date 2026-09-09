/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package laundry.main;

import laundry.service.LaundryService;
import java.util.Scanner;

/**
 *
 * @author asus GK
 */
public class ManajementLaundry {
    public static void main(String[] args) {
        LaundryService service = new LaundryService();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN LAUNDRY ===");
            System.out.println("1. Tambah Transaksi");
            System.out.println("2. Lihat Semua Transaksi");
            System.out.println("3. Ubah Transaksi");
            System.out.println("4. Hapus Transaksi");
            System.out.println("5. Cari Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            String input = scanner.nextLine().trim();
            try {
                pilihan = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                pilihan = -1;
            }

            switch (pilihan) {
                case 1 -> service.tambahTransaksi();
                case 2 -> service.tampilkanTransaksi();
                case 3 -> service.ubahTransaksi();
                case 4 -> service.hapusTransaksi();
                case 5 -> service.cariTransaksi();
                case 0 -> System.out.println("Terima kasih telah menggunakan Sistem Manajemen Laundry.");
                default -> System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}
