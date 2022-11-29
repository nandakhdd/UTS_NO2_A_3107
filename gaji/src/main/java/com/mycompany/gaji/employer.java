/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gaji;

/**
 *
 * @author Wa Ode Nanda K.D (2110310)
 */
public abstract class employer {

    String nama;
    String jabatan_3107;
    double gajibersih_3107;
    double gajikotor_3107;
    double gajipokok_3107;
    double uangmakan_3107;

    public employer() {
        gajipokok_3107 = 1500000.0;
    }

    public void setNama(String name) {
        this.nama = name;
    }

    public String getNama() {
        System.out.println("Nama Karyawan : " + nama);
        return nama;
    }

    public String jabatan_3107() {
        System.out.println("Posisi Jabatan : " + jabatan_3107);
        return jabatan_3107;
    }

    public abstract double perhitungangaji();

}
