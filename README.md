# Minpro-1-PBO-ManajemenLaundry

### Nama: Marza Hanaya Melodya Goga
### NIM : 2409116103

## Sistem Manajemen Laundry
Program Sistem Manajemen Laundry ini dibuat untuk memudahkan pengguna dalam mengelola data transaksi laundry secara sederhana. Pengguna dapat menambahkan transaksi baru, melihat daftar transaksi, mengubah informasi transaksi, menghapus transaksi, serta mencari transaksi berdasarkan kata kunci. Program ditulis menggunakan bahasa pemrograman Java dengan konsep pemrograman berorientasi objek. Struktur kode dibagi menjadi tiga package, yaitu laundry.main sebagai menu utama, laundry.model yang berisi class ModelLaundry sebagai superclass dan LaundryKiloan sebagai subclass, serta laundry.service yang menyimpan logika CRUD dan pencarian. Program ini juga menerapkan enkapsulasi dengan penggunaan atribut private dan getter-setter, inheritance pada class turunan LaundryKiloan dari superclass ModelLaundry.

## Output Program
<img width="462" height="192" alt="Screenshot 2026-09-10 040950" src="https://github.com/user-attachments/assets/8f0d4df9-d4cd-4bd2-8739-f5fbdf776403" />

Menampilkan navigasi pilihan menu 1 hingga 5 serta pilihan 0 untuk keluar dari program.

<img width="772" height="355" alt="Screenshot 2026-09-10 041340" src="https://github.com/user-attachments/assets/c304db46-efeb-4876-b6d9-6fb65e9839a5" />

Menginput data transaksi baru dengan ID 003 atas nama Sasa, lalu sistem memberikan konfirmasi bahwa data berhasil disimpan.

<img width="940" height="410" alt="Screenshot 2026-09-10 041359" src="https://github.com/user-attachments/assets/07695b09-74ca-4827-aa7f-f35cba28ecf3" />

Menampilkan seluruh data transaksi yang tersimpan (ID 001–005) lengkap dengan kalkulasi total harga otomatis (Rp7.000/kg).

<img width="707" height="361" alt="Screenshot 2026-09-10 041526" src="https://github.com/user-attachments/assets/f0de8c2e-7a06-4806-9c1b-f8a70367c129" />

Memperbarui data pada ID 001, di mana nama pelanggan diubah menjadi Pris dan jenis parfum diubah menjadi Lavender.

<img width="810" height="540" alt="Screenshot 2026-09-10 041621" src="https://github.com/user-attachments/assets/6ba0ccc3-d607-4e6f-9e90-c27c31bd1789" />

Menghapus transaksi dengan ID 004. Saat dicek kembali menggunakan Menu 2, data ID 004 terbukti sudah terhapus dan perubahan pada ID 001 sudah terbarui.

<img width="743" height="242" alt="Screenshot 2026-09-10 041654" src="https://github.com/user-attachments/assets/7934d158-4048-482a-963c-bd5a34408447" />
Memasukkan kata kunci pencarian Sasa dan sistem berhasil menampilkan data transaksi milik Sasa (ID 003) secara spesifik.

<img width="570" height="208" alt="Screenshot 2026-09-10 041710" src="https://github.com/user-attachments/assets/8119cb90-c0b1-4c52-9d7c-38063a3d7254" />
Menampilkan pesan penutup dan menghentikan perulangan program.
