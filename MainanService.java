/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.Mainan;
import java.util.ArrayList;

/**
 *
 * @author Acer-GK
 */


public class MainanService {
    private ArrayList<Mainan> koleksi = new ArrayList<>();

    public void tambahMainan(Mainan mainan) {
        koleksi.add(mainan);
        System.out.println("Mainan berhasil ditambahkan!");
    }

    public void tampilkanMainan() {
        if (koleksi.isEmpty()) {
            System.out.println("Belum ada mainan dalam koleksi.");
            return;
        }
        for (int i = 0; i < koleksi.size(); i++) {
            Mainan m = koleksi.get(i);
            System.out.println((i + 1) + ". Nama: " + m.getNama() +
                               " | Bahan: " + m.getBahan() +
                               " | Tgl Produksi: " + m.getTanggalProduksi() +
                               " | Kondisi: " + m.getKondisi() +
                               " | Harga: Rp" + m.getHarga());
        }
    }

    public void ubahMainan(int index, Mainan mainanBaru) {
        if (index >= 0 && index < koleksi.size()) {
            koleksi.set(index, mainanBaru);
            System.out.println("Data mainan berhasil diubah!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    public void hapusMainan(int index) {
        if (index >= 0 && index < koleksi.size()) {
            koleksi.remove(index);
            System.out.println("Mainan berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    public int getJumlahMainan() {
        return koleksi.size();
    }

    public Mainan getMainan(int index) {
        if (index >= 0 && index < koleksi.size()) {
            return koleksi.get(index);
        }
        return null;
    }
}
