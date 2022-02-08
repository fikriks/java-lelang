
# Sistem Lelang

Aplikasi Sistem Lelang berbasis desktop, dibuat dengan Bahasa Pemrograman Java dan Netbeans sebagai IDE.

Ditujukan untuk memenuhi Uji Kompetensi Keahlian Rekayasa Perangkat Lunak (RPL) Tahun 2022.

# Persyaratan
	NetBeans IDE 8.0.2 (Gatau kalo versi selain ini bisa apa engga)
	Java JDK Versi 8 (Gatau kalo versi selain ini bisa apa engga)
	XAMPP atau yang lainnya (yang penting ada MySQL/phpMyAdmin)

# Plugin
JCalendar, untuk tutorial meng-installnya ada [disini](https://www.intika34.com/2017/04/cara-menambahkan-jcalendar-pada-netbeans.html)

Jasper Report, untuk tutorial meng-installnya ada [disini](https://gilacoding.com/read/cara-membuat-dan-contoh-sederhana-laporan-dengan-ireport-java-netbeans)


# Konfigurasi

 1. Ubah nama database, username dan password mysql pada file Koneksi.java, sesuai dengan database yang telah  dibuat

	    private static final String DATABASE_NAME = "DB";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "";

2. Import lelang.sql ke database
3. Add JAR/Folder pada bagian Libraries, lalu pilih semua file yang ada di folder lib
4. Run program menggunakan Netbeans IDE

# Login
	- Hak Akses Administrator
		Username: admin
		Password: batagorenak
	- Hak Akses Petugas
		Username: petugas
		Password: batagorenak
	- Hak Akses Masyarakat/User
		Username: fikri
		Password: batagorenak