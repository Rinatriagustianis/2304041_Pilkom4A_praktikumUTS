/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rinatriagustianis2304041.praktikumuts_soal4;

/**
 *
 * @author user
 */
public class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;
    
    public LimasSegiEmpat() {
        luasAlas = 1;
        luasSelubungLimas = 1;
        tinggi = 1;
    }
    
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }
    
    public double getLuasAlas() {
        return this.luasAlas;
    }
    
    public double getLuasSelubungLimas() {
        return this.luasSelubungLimas;
    }
    
    public double getTinggi() {
        return this.tinggi;
    }
    
    public double getLuas() {
        return this.luasAlas + this.luasSelubungLimas;
    }
    
    public double getVolume() {
        return (1.0 / 3) * this.luasAlas * this.tinggi;
    }
    
    public void setLuasAlas(double luasAlasBaru) {
        luasAlas = luasAlasBaru;
    }
    
    public void setLuasSelubungLimas(double luasSelubungLimasBaru) {
        luasSelubungLimas = luasSelubungLimasBaru;
    }
    
    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }
}
