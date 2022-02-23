# Sistem Lelang

Ditujukan untuk memenuhi Uji Kompetensi Keahlian Rekayasa Perangkat Lunak (RPL) Tahun 2022.

> Projek ini merupakan _project open source_, Anda dapat download/fork/clone pada projek ini.
> Aplikasi Sistem Lelang berbasis desktop, dibuat dengan Bahasa Pemrograman Java dan Netbeans sebagai IDE.

## 🤔 Latar Belakang dan Tujuan

Ditujukan untuk memenuhi program Uji Kompetensi Keahlian Rekayasa Perangkat Lunak (RPL) dan sebagai metode pembelajaran untuk memperdalam pengembangan _software_ berbasis desktop serta berguna bagi masyarakat yang ingin membangun sebuah sistem lelang barang.

# Persyaratan

    NetBeans IDE 8.0.2 (Gatau kalo versi selain ini bisa apa engga)
    Java JDK Versi 8 (Gatau kalo versi selain ini bisa apa engga)
    XAMPP atau yang lainnya (yang penting ada MySQL/phpMyAdmin)

# Plugin

JCalendar, untuk tutorial meng-installnya ada [disini](https://www.intika34.com/2017/04/cara-menambahkan-jcalendar-pada-netbeans.html)

Jasper Report, untuk tutorial meng-installnya ada [disini](https://gilacoding.com/read/cara-membuat-dan-contoh-sederhana-laporan-dengan-ireport-java-netbeans)

# Konfigurasi

1.  Ubah nama database, username dan password mysql pada file Koneksi.java, sesuai dengan database yang telah dibuat

        private static final String DATABASE_NAME = "DB";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "";

2.  Import lelang.sql ke database
3.  Add JAR/Folder pada bagian Libraries, lalu pilih semua file yang ada di folder lib
4.  Run program menggunakan Netbeans IDE

# Akun

    - Hak Akses Administrator
    	Username: admin
    	Password: batagorenak
    - Hak Akses Petugas
    	Username: petugas
    	Password: batagorenak
    - Hak Akses Masyarakat/User
    	Username: fikri
    	Password: batagorenak

## 📆 Tanggal

    Tanggal Mulai Pengembangan : Jumat, 04 Februari 2022.

    v1.0 : Rabu, 08 Februari 2022

## 🤝 Kontribusi

_**[Pull Request](https://github.com/fikriks/java-lelang/pulls)**_ dan _**[Issue](https://github.com/fikriks/java-lelang/issues)**_ di persilahkan.

Anda dapat berkontribusi untuk membangun projek ini agar lebih baik lagi karena projek ini masih banyak kekurangannya, jangan ragu untuk memeriksa halaman masalah jika Anda ingin berkontribusi atau memberi saran berupa penambahan fitur atau pun menemukan suatu masalah atau _bug_.

## 📝 Lisensi

Aplikasi ini berlisensi **[MIT](https://github.com/fikriks/java-lelang/blob/main/LICENSE)**, yang berarti Anda bebas untuk menggunakan, menyebarkan/mendistribusikan, memodifikasi, dan untuk tujuan komersial.

---

Java Lelang is open-sourced software licensed under the MIT license.
