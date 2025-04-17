/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rinatriagustianis2304041.praktikumuts_soal4;

/**
 *
 * @author user
 */
public class PraktikumUTS_Soal4 {

    public static void main(String[] args) {
        LimasSegiEmpat objLimasSE1 = new LimasSegiEmpat();
        System.out.print("Limas segi empat dengan luas alas: " +objLimasSE1.getLuasAlas());
        System.out.print(", luas selubung limas: " +objLimasSE1.getLuasSelubungLimas());
        System.out.println(" dan tinggi: " +objLimasSE1.getTinggi());
        System.out.printf("Luasnya: %.2f", objLimasSE1.getLuas());
        System.out.printf(", sedangkan volumenya: %.2f", objLimasSE1.getVolume());
        
        LimasSegiEmpat objLimasSE2 = new LimasSegiEmpat(30, 40, 50);
        System.out.print("\n\nLimas segi empat dengan luas alas: " +objLimasSE2.getLuasAlas());
        System.out.print(", luas selubung limas: " +objLimasSE2.getLuasSelubungLimas());
        System.out.println(" dan tinggi: " +objLimasSE2.getTinggi());
        System.out.printf("Luasnya: %.2f", objLimasSE2.getLuas());
        System.out.printf(", sedangkan volumenya: %.2f", objLimasSE2.getVolume());
        
        LimasSegiEmpat objLimasSE3 = new LimasSegiEmpat();
        objLimasSE3.setLuasAlas(25);
        objLimasSE3.setLuasSelubungLimas(35);
        objLimasSE3.setTinggi(45);
        System.out.print("\n\nLimas segi empat dengan luas alas: " +objLimasSE3.getLuasAlas());
        System.out.print(", luas selubung limas: " +objLimasSE3.getLuasSelubungLimas());
        System.out.println(" dan tinggi: " +objLimasSE3.getTinggi());
        System.out.printf("Luasnya: %.2f", objLimasSE3.getLuas());
        System.out.printf(", sedangkan volumenya: %.2f", objLimasSE3.getVolume());
    }
}
