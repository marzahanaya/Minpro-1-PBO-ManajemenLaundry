package laundry.service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import laundry.model.LaundryKiloan;
import laundry.model.ModelLaundry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author asus GK
 */
public class LaundryService {

    private final ArrayList<ModelLaundry> daftarTransaksi = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    // CREATE
    public void tambahTransaksi() {
        System.out.print("Masukkan ID Transaksi: ");
        String id = scanner.nextLine().trim();

        if (id.isEmpty()) {
            System.out.println("ID Transaksi tidak boleh kosong.");
            return;
        }

        for (ModelLaundry item : daftarTransaksi) {
            if (item.getIdTransaksi().equalsIgnoreCase(id)) {
                System.out.println("ID Transaksi sudah terdaftar.");
                return;
            }
        }

        System.out.print("Masukkan Nama Pelanggan: ");
        String nama = scanner.nextLine().trim();
        if (nama.isEmpty()) {
            System.out.println("Nama pelanggan tidak boleh kosong.");
            return;
        }

        System.out.print("Masukkan Berat Laundry (kg): ");
        String beratInput = scanner.nextLine().trim();
        double berat;

        try {
            berat = Double.parseDouble(beratInput);
            if (berat <= 0) {
                System.out.println("Berat laundry harus lebih dari 0.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input berat harus berupa angka.");
            return;
        }

        System.out.print("Masukkan Jenis Parfum (misal: Lavender/Ocean/Vanilla): ");
        String parfum = scanner.nextLine().trim();
        if (parfum.isEmpty()) {
            parfum = "Standard";
        }

        daftarTransaksi.add(new LaundryKiloan(id, nama, berat, parfum));
        System.out.println("Transaksi laundry berhasil ditambahkan.");
    }

    // READ
    public void tampilkanTransaksi() {
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada data transaksi laundry.");
            return;
        }
        System.out.println("\n=== DAFTAR TRANSAKSI LAUNDRY ===");

        for (ModelLaundry item : daftarTransaksi) {
            System.out.println(item);
        }
    }

    // UPDATE
    public void ubahTransaksi() {
        System.out.print("Masukkan ID Transaksi yang ingin diubah: ");
        String id = scanner.nextLine().trim();

        for (ModelLaundry item : daftarTransaksi) {
            if (item.getIdTransaksi().equalsIgnoreCase(id)) {
                System.out.print("Nama Pelanggan baru (kosongkan jika tidak diubah): ");
                String namaBaru = scanner.nextLine().trim();
                if (!namaBaru.isEmpty()) {
                    item.setNamaPelanggan(namaBaru);
                }

                System.out.print("Berat baru dalam kg (kosongkan jika tidak diubah): ");
                String beratBaruInput = scanner.nextLine().trim();
                if (!beratBaruInput.isEmpty()) {
                    try {
                        double beratBaru = Double.parseDouble(beratBaruInput);
                        if (beratBaru > 0) {
                            item.setBerat(beratBaru);
                        } else {
                            System.out.println("Berat tidak valid, perubahan berat dibatalkan.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input berat bukan angka, perubahan berat dibatalkan.");
                    }
                }

                if (item instanceof LaundryKiloan) {
                    System.out.print("Jenis Parfum baru (kosongkan jika tidak diubah): ");
                    String parfumBaru = scanner.nextLine().trim();
                    if (!parfumBaru.isEmpty()) {
                        ((LaundryKiloan) item).setJenisParfum(parfumBaru);
                    }
                }

                System.out.println("Data transaksi berhasil diperbarui.");
                return;
            }
        }
        System.out.println("ID Transaksi tidak ditemukan.");
    }

    // DELETE
    public void hapusTransaksi() {
        System.out.print("Masukkan ID Transaksi yang ingin dihapus: ");
        String id = scanner.nextLine().trim();

        Iterator<ModelLaundry> iterator = daftarTransaksi.iterator();
        while (iterator.hasNext()) {
            ModelLaundry item = iterator.next();
            if (item.getIdTransaksi().equalsIgnoreCase(id)) {
                iterator.remove();
                System.out.println("Transaksi berhasil dihapus.");
                return;
            }
        }
        System.out.println("ID Transaksi tidak ditemukan.");
    }

    // SEARCH
    public void cariTransaksi() {
        System.out.print("Masukkan kata kunci pencarian (ID/Nama): ");
        String keyword = scanner.nextLine().trim().toLowerCase();

        boolean ditemukan = false;
        for (ModelLaundry item : daftarTransaksi) {
            if (item.getIdTransaksi().toLowerCase().contains(keyword) ||
                item.getNamaPelanggan().toLowerCase().contains(keyword)) {
                System.out.println(item);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data transaksi tidak ditemukan.");
        }
    }
}
