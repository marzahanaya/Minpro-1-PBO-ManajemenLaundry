/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry.model;

/**
 *
 * @author asus GK
 */
public class LaundryKiloan extends ModelLaundry {
    private String jenisParfum;

    // Constructor
    public LaundryKiloan(String idTransaksi, String namaPelanggan, double berat, String jenisParfum) {
        super(idTransaksi, namaPelanggan, berat);
        this.jenisParfum = jenisParfum;
    }

    public String getJenisParfum() {
        return jenisParfum;
    }

    public void setJenisParfum(String jenisParfum) {
        this.jenisParfum = jenisParfum;
    }

    @Override
    public String toString() {
        return super.toString() + " | Parfum: " + jenisParfum;
    }
}
