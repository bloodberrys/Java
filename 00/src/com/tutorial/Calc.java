package com.tutorial;
// nama package saya adalah com.tutorial atau jika tanpa package tinggal hapus saja

// import untuk scanner dari utility java
import java.util.Scanner;



// pembuatan class Tambah
class Tambah{
    double a;
    double b;
    double hasilTambah;

    // Constructor digunakan untuk melakukan proses yang akan selalu berjalan ketika class dijadikan object dan dirun.
    Tambah(double a, double b){

        // disini saya mengambil passing parameter a dan b
        this.a = a;
        this.b = b;
        this.hasilTambah = this.a + this.b;

        // this.a merupakan pengambilan property a dari class Tambah, lalu nilainya akan diassign dari input parameter user.
        // lalu imput-input tersebut akan di assign di property hasilTambah
    }


    // ini adalah method output pertambahan dari hasil yang sudah diassign di atas
    void display(){
        System.out.println("Hasil pertambahan dari " + this.a + " + " + this.b + " = " + this.hasilTambah);
    }
}

// semua class memiliki method dengan pola yang sama

class Kurang{
    double a;
    double b;
    double hasilKurang;
    // constructor

    Kurang(double a, double b){
        this.a = a;
        this.b = b;
        this.hasilKurang = this.a - this.b;
    }

    void display(){
        System.out.println("Hasil pengurangan dari " + this.a + " - " + this.b + " = " + this.hasilKurang);
    }
}

class Kali{
    double a;
    double b;
    double hasilKali;
    // constructor

    Kali(double a, double b){
        this.a = a;
        this.b = b;
        this.hasilKali = this.a * this.b;
    }

    void display(){
        System.out.println("Hasil perkalian dari " + this.a + " * " + this.b + " = " + this.hasilKali);
    }
}

class Bagi{
    double a;
    double b;
    double hasilBagi;
    // constructor

    Bagi(double a, double b){
        this.a = a;
        this.b = b;
        this.hasilBagi = this.a / this.b;
    }

    void display(){
        System.out.println("Hasil pembagian dari " + this.a + " / " + this.b + " = " + this.hasilBagi);
    }
}

public class Calc{
    public static void main(String[] args) {

        // membuat peoperty baru

        double a;
        double b;

        // membuat scanner dengan nama input
        Scanner input = new Scanner(System.in);


        System.out.println("---Calculator v.0.0.1 by Alfian Firmansyah---\n");
        System.out.println("Masukkan angka pertama: ");

        // menginput dengan tipe data double
        a = input.nextDouble();
        System.out.println("Masukkan angka kedua: ");

        // menginput property b
        b = input.nextDouble();

        System.out.println("\n");

        // pembuatan object tambah, kurang, kali, bagi
        Tambah add1 = new Tambah(a, b);

        // memanggil method display yang terdapat pada class Tambah pada object add1
        add1.display();
        System.out.println("\n");

        // akan dilakukan pembuatan object lain dan pemanggilan method yang memiliki pola yang sama dengan di atas
        Kurang kurang1 = new Kurang(a , b);
        kurang1.display();
        System.out.println("\n");
        Kali kali1 = new Kali(a , b);
        kali1.display();
        System.out.println("\n");
        Bagi bagi1 = new Bagi(a , b);
        bagi1.display();
    }
}