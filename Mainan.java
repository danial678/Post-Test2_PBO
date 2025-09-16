/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author Acer-GK
 */

public class Mainan {
    private String nama;
    private String bahan;
    private String tanggalProduksi;
    private String kondisi;
    private double harga;


    public Mainan(String nama, String bahan, String tanggalProduksi, String kondisi, double harga) {
        this.nama = nama;
        this.bahan = bahan;
        this.tanggalProduksi = tanggalProduksi;
        this.kondisi = kondisi;
        this.harga = harga;
    }


    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getBahan() { return bahan; }
    public void setBahan(String bahan) { this.bahan = bahan; }

    public String getTanggalProduksi() { return tanggalProduksi; }
    public void setTanggalProduksi(String tanggalProduksi) { this.tanggalProduksi = tanggalProduksi; }

    public String getKondisi() { return kondisi; }
    public void setKondisi(String kondisi) { this.kondisi = kondisi; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
}

