# Praktikum Rekayasa Perangkat Lunak (RPL) - Java NetBeans

Repositori ini berisi kumpulan modul tugas, latihan, dan proyek praktikum Rekayasa Perangkat Lunak (RPL) yang dikembangkan menggunakan **Java (Swing GUI)** dan **Apache NetBeans IDE** dengan sistem build **Ant**.

---

## 📋 Daftar Proyek

| No | Folder Proyek | Deskripsi | Database / Keterangan |
|---|---|---|---|
| 1 | **[AplikasiKubus](./AplikasiKubus)** | Aplikasi Swing GUI untuk perhitungan kubus (panjang sisi, volume, dan luas permukaan). | Tanpa database |
| 2 | **[Database Kelas F](./Database%20Kelas%20F)** | Aplikasi GUI manajemen data mahasiswa yang terintegrasi dengan MySQL. | Database: `universitas_kelas_F` |
| 3 | **[GalleryProject-2](./GalleryProject-2)** | Aplikasi galeri foto dinamis dengan layout kustom (`WrapLayout`), kartu gambar (`ImageCard`), tambah, dan hapus foto. | Dilengkapi preview screenshot |
| 4 | **[Kalkulator](./Kalkulator)** | Aplikasi kalkulator standar berbasis Java Swing GUI untuk operasi aritmatika dasar. | Tanpa database |
| 5 | **[LaporanPeminjamanKaset](./LaporanPeminjamanKaset)** | Aplikasi manajemen dan pelaporan transaksi peminjaman kaset berbasis GUI dan MySQL. | Database: `peminjaman_kaset` |
| 6 | **[LatihanDB](./LatihanDB)** | Aplikasi GUI sistem perpustakaan untuk pengelolaan data buku/anggota. | Database: `perpustakaan` |
| 7 | **[Praktikum-7](./Praktikum-7)** | Modul praktikum integrasi komponen antarmuka Java Swing. | Terhubung ke modul kalkulator |
| 8 | **[Praktikum-8](./Praktikum-8)** | Aplikasi manajemen kontak (CRUD) berbasis GUI Swing, terintegrasi MySQL dan dilengkapi Unit Test. | Database: `db_contact_app` |

---

## 🛠️ Prasyarat Lingkungan (Prerequisites)

Untuk menjalankan atau memodifikasi proyek di repositori ini, pastikan Anda telah menginstal:
1. **Java Development Kit (JDK)**: JDK 17 atau lebih baru (disarankan JDK 21/24 sesuai konfigurasi proyek).
2. **Apache NetBeans IDE**: Versi 18+ (disarankan NetBeans versi terbaru).
3. **MySQL Server / MariaDB**: (misalnya via XAMPP atau MySQL Server lokal) untuk proyek yang membutuhkan basis data.
4. **MySQL Connector/J**: Driver JDBC MySQL (telah disertakan dalam konfigurasi pustaka NetBeans / dist lib).

---

## 🚀 Cara Menjalankan Proyek

### Menggunakan Apache NetBeans IDE
1. Buka **Apache NetBeans IDE**.
2. Pilih menu **File > Open Project...**
3. Masuk ke direktori repositori ini dan pilih satu atau lebih folder proyek (misalnya `Praktikum-8` atau `GalleryProject-2`).
4. Pastikan layanan MySQL sudah berjalan (jika membuka proyek berbasis database).
5. Klik kanan pada nama proyek di panel *Projects*, lalu pilih **Run** (atau tekan `F6`).

### Konfigurasi Basis Data (Untuk Proyek Database)
Pastikan MySQL aktif di `localhost:3306` (default user: `root`, password: *(kosong)*):
- **Database Kelas F**: Buat basis data bernama `universitas_kelas_F`
- **LaporanPeminjamanKaset**: Buat basis data bernama `peminjaman_kaset`
- **LatihanDB**: Buat basis data bernama `perpustakaan`
- **Praktikum-8**: Buat basis data bernama `db_contact_app`

---

## 🧹 Struktur Git & Kebersihan Repositori

Repositori ini telah dikonfigurasi dengan file `.gitignore` standar Java NetBeans untuk mengabaikan artefak kompilasi dan konfigurasi lokal pengguna:
- `**/build/` & `**/dist/` (Direktori hasil kompilasi dan file `.jar`/`.class`)
- `**/nbproject/private/` (Pengaturan lokal pengguna seperti path JDK mesin pengguna dan layout tab)
- File sementara OS (`.DS_Store`, `Thumbs.db`)

> 💡 **Catatan untuk membersihkan file cache NetBeans yang sebelumnya pernah ter-track:**
> ```bash
> git rm -r --cached **/build/ **/dist/ **/nbproject/private/
> git commit -m "chore: remove build artifacts and private IDE config from git tracking"
> ```
