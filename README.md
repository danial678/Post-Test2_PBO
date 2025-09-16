# Post-Test2_PBO

Nama  : Danial Hirzan Akbary
NIM   : 2409116098
KELAS : Sistem Informasi.c

# Menejemen Koleksi Mainan

## Deskripsi Singkat

Program ini adalah aplikasi berbasis Java untuk mengelola koleksi mainan. menggunakan konsep Pemrograman Berorientasi Objek (PBO) dengan pemisahan class berdasarkan fungsinya.
Fitur utama program meliputi CRUD (Create, Read, Update, Delete) data mainan, yang memungkinkan pengguna menambah, melihat, mengubah, dan menghapus data koleksi mainan.

### Class Yang Digunakan

Program ini menggunakan 3 class utama:

- Mainan (package model) → Menyimpan struktur data koleksi mainan.

- MainanService (package service) → Berisi logika CRUD seperti tambah, ubah, hapus, dan tampilkan data.

- MainApp (package main) → Menyediakan menu utama dan mengatur interaksi dengan pengguna.

### Properties (Atribut)

Class Mainan memiliki 5 properties yakni:

- nama, nama mainan.

- bahan, bahan pembuatan mainan.

- tanggalProduksi, tanggal produksi mainan.

- kondisi, kondisi mainan (Baru/Bekas).

- harga, harga mainan.

### Constructor

Constructor terdapat di class Mainan, digunakan untuk menginisialisasi data ketika objek mainan dibuat:

<img width="1265" height="196" alt="image" src="https://github.com/user-attachments/assets/7c863cd0-6b96-4697-80ad-5845ef06b562" />

### Penerapan Access Modifier

- Private, digunakan pada atribut (nama, bahan, tanggalProduksi, kondisi, harga) agar tidak bisa diakses langsung dari luar class.

- Public, digunakan pada getter dan setter agar atribut bisa diakses atau diubah dengan cara yang aman.

- Public, juga digunakan pada method di MainanService dan MainApp agar dapat dipanggil dari package lain.

### Package

Program dibagi menjadi 3 package sesuai fungsinya:

- model, berisi class Mainan untuk menyimpan atribut & constructor.

- service,  berisi class MainanService untuk logika CRUD.

- main, berisi class MainApp untuk menu dan jalannya program.

## Alur Program
### Tampilan awal program
Alur program ini dimulai dari menu utama yang akan ditampilkan kepada pengguna ketika program dijalankan. Menu ini berfungsi sebagai antarmuka awal di mana pengguna dapat memilih aksi yang ingin dilakukan. Program menggunakan perulangan agar menu terus ditampilkan sampai pengguna memilih untuk keluar.

<img width="523" height="230" alt="image" src="https://github.com/user-attachments/assets/88b26de4-9807-44df-9219-3d2024ed7c86" />

Program menggunakan perulangan do-while, sehingga menu ini akan selalu ditampilkan kembali setelah pengguna selesai melakukan sebuah aksi, sampai pengguna memilih opsi 5 (Keluar).

### (1) Tambah Mainan
Ketika pengguna memilih menu Tambah Mainan, program akan meminta input dari pengguna berupa nama mainan, bahan mainan, tanggal produksi, kondisi, dan harga. Data yang dimasukkan kemudian akan disimpan ke dalam ArrayList.

<img width="663" height="189" alt="image" src="https://github.com/user-attachments/assets/cdbbcf37-b058-4abd-988f-cba845404db4" />


Hal ini memungkinkan pengguna menambah lebih dari satu data secara berulang, karena menu akan kembali ditampilkan setelah proses penambahan selesai.

### (2) Lihat Koleksi

Menu ini digunakan untuk menampilkan seluruh data mainan yang sudah tersimpan. Program akan menampilkan data dalam bentuk daftar dengan format yang rapi, sehingga pengguna bisa melihat semua atribut mainan secara detail.

<img width="1282" height="57" alt="image" src="https://github.com/user-attachments/assets/c40a532a-319c-4ead-8edf-966407a50256" />

Jika belum ada data sama sekali, program akan memberikan informasi yang jelas:

<img width="535" height="57" alt="image" src="https://github.com/user-attachments/assets/d68fd72e-ea19-4aab-bbd2-43a8b9b58f87" />


### (3) Ubah Mainan 
Menu ini memungkinkan pengguna memperbarui data yang sudah ada. Pertama-tama, program akan menampilkan daftar mainan, lalu meminta nomor mainan yang ingin diubah.

<img width="1249" height="234" alt="image" src="https://github.com/user-attachments/assets/0c04e520-d408-4520-8897-ae0995a829ab" />

### (4) Hapus Mainan
Fitur ini digunakan untuk menghapus data mainan dari daftar. Program akan menampilkan daftar mainan, lalu meminta nomor mainan yang ingin dihapus.

<img width="1188" height="110" alt="image" src="https://github.com/user-attachments/assets/9f3b4a6e-a3e3-436e-8114-898cc85c5c16" />

Jika daftar kosong, maka program akan memberitahukan pengguna bahwa tidak ada data yang bisa dihapus.

<img width="386" height="53" alt="image" src="https://github.com/user-attachments/assets/c017bf7b-e6f6-4b63-bace-c2419af6ad3c" />

### (5) Keluar Program
Jika pengguna memilih menu Keluar, program akan berhenti. Ini adalah tanda bahwa seluruh interaksi selesai dilakukan.

<img width="567" height="64" alt="image" src="https://github.com/user-attachments/assets/82129505-bb8d-4dc1-b225-924b7ec82fbe" />

## Kesimpulan
Dengan alur seperti ini, program mampu menyediakan CRUD (Create, Read, Update, Delete) secara lengkap, dengan pengalaman interaktif bagi pengguna. Perulangan menu membuat pengguna bebas melakukan aksi berkali-kali tanpa perlu menjalankan ulang program. Selain itu, adanya validasi nomor input memastikan data yang diubah atau dihapus tetap konsisten dan terhindar dari kesalahan.
