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
        int pilihan;
        double a;
        double b;

        // membuat scanner dengan nama input
        Scanner input = new Scanner(System.in);


        System.out.println("---Calculator v.0.0.1 by Alfian Firmansyah---\n");

        System.out.println("-------");
        System.out.println("------------");
        System.out.println("Pilih Operasi:\n");
        System.out.println("1. Penjumlahan\n");
        System.out.println("2. Pengurangan\n");
        System.out.println("3. Perkalian\n");
        System.out.println("4. Pembagian\n");
        System.out.println("Pilihan Kamu: "); pilihan = input.nextInt();

        System.out.println("Masukkan angka pertama: ");

        // menginput dengan tipe data double
        a = input.nextDouble();
        System.out.println("Masukkan angka kedua: ");

        // menginput property b
        b = input.nextDouble();

        System.out.println("\n");

        // pembuatan object tambah, kurang, kali, bagi
        Tambah add1 = new Tambah(a, b);
        Kurang kurang1 = new Kurang(a , b);
        Kali kali1 = new Kali(a , b);
        Bagi bagi1 = new Bagi(a , b);

        // memanggil method display yang terdapat pada class Tambah pada object-object yang sudah dibuat dengan menggunakan if statement

        if (pilihan == 1){
            add1.display();
        }else if(pilihan == 2){// akan dilakukan pemanggilan method display yang memiliki pola yang sama dengan di atas
            kurang1.display();
        }else if(pilihan == 3){
            kali1.display();
        }else if(pilihan == 4){
            bagi1.display();
        }
    }
}