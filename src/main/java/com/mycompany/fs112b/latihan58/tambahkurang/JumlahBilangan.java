/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fs112b.latihan58.tambahkurang;

/**
 *
 * @author 
 * NAMA     : Muhamad Bagas Permana
 * KELAS    : FS112B-PBO
 * NIK      : 2022431570
 * Deskripsi Program	: Program ini berisi program untuk menampilkan
 * hasil penjumlahan
 * 
 */
public class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int z = getX() + getY();
        System.out.println("Hasil perjumlahan = " + z);
    }
}