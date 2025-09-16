/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import model.Mainan;
import service.MainanService;
import java.util.Scanner;

/**
 *
 * @author Acer-GK
 */

public class MainApp {
    public static void main(String[] args) {
        MainanService service = new MainanService();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("======================================");
            System.out.println("        MANAJEMEN KOLEKSI MAINAN");
            System.out.println("======================================");
            System.out.println("1. Tambah Mainan");
            System.out.println("2. Lihat Koleksi Mainan");
            System.out.println("3. Ubah Mainan");
            System.out.println("4. Hapus Mainan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Bahan: ");
                    String bahan = input.nextLine();
                    System.out.print("Tanggal Produksi: ");
                    String tanggal = input.nextLine();
                    System.out.print("Kondisi: ");
                    String kondisi = input.nextLine();
                    System.out.print("Harga: ");
                    double harga = input.nextDouble();
                    input.nextLine();

                    service.tambahMainan(new Mainan(nama, bahan, tanggal, kondisi, harga));
                }
                case 2 -> service.tampilkanMainan();

                case 3 -> {
                    service.tampilkanMainan();
                    if (service.getJumlahMainan() > 0) {
                        System.out.print("Masukkan nomor mainan yang ingin diubah: ");
                        int index = input.nextInt() - 1;
                        input.nextLine();

                        System.out.print("Nama Baru: ");
                        String nama = input.nextLine();
                        System.out.print("Bahan Baru: ");
                        String bahan = input.nextLine();
                        System.out.print("Tanggal Produksi Baru: ");
                        String tanggal = input.nextLine();
                        System.out.print("Kondisi Baru: ");
                        String kondisi = input.nextLine();
                        System.out.print("Harga Baru: ");
                        double harga = input.nextDouble();
                        input.nextLine();

                        service.ubahMainan(index, new Mainan(nama, bahan, tanggal, kondisi, harga));
                    }
                }
                case 4 -> {
                    service.tampilkanMainan();
                    if (service.getJumlahMainan() > 0) {
                        System.out.print("Masukkan nomor mainan yang ingin dihapus: ");
                        int index = input.nextInt() - 1;
                        input.nextLine();
                        service.hapusMainan(index);
                    }
                }
                case 5 -> System.out.println("Terima kasih telah menggunakan program ini!");
                default -> System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan != 5);

        input.close();
    }
}

