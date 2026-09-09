/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.ModelLaundry to edit this template
 */
package laundry.model;

/**
 *
 * @author asus GK
 */
public class ModelLaundry {
    // Encapsulation & Access Modifier (Private Properties)
    private String idTransaksi;
    private String namaPelanggan;
    private double berat;

    // Constructor
    public ModelLaundry(String idTransaksi, String namaPelanggan, double berat) {
        this.idTransaksi = idTransaksi;
        this.namaPelanggan = namaPelanggan;
        this.berat = berat;
    }

    // Getter dan Setter
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    // Method hitung total harga (Rp 7.000/kg)
    public double hitungTotalHarga() {
        return berat * 7000;
    }

    @Override
    public String toString() {
        return "ID: " + idTransaksi +
               " | Pelanggan: " + namaPelanggan +
               " | Berat: " + berat + " kg" +
               " | Total: Rp " + (long) hitungTotalHarga();
    }
}
