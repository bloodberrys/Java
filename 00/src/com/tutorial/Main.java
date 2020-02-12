package com.tutorial;

//membuat class sebagai template (tanpa constructor)

class Mahasiswa {
  String nama;
  String NIM;
  String jurusan;
  double IPK;
  int umur;
}

class Polos {
  String dataString;
  int dataInteger;
}

public class Main {

  public static void main(String[] args) {
    // System.out.println("hello world");

    //instansiasi dan membuat object

    Mahasiswa mahasiswa1 = new Mahasiswa();

    //membuat
    mahasiswa1.nama = "Alfian Firmansyah";
    mahasiswa1.NIM = "1706985874";
    mahasiswa1.jurusan = "Teknik Komputer";
    mahasiswa1.IPK = 3.43;
    mahasiswa1.umur = 21;

    System.out.println(mahasiswa1.nama);
    System.out.println(mahasiswa1.NIM);
    System.out.println(mahasiswa1.jurusan);
    System.out.println(mahasiswa1.IPK);
    System.out.println(mahasiswa1.umur);

    Mahasiswa mahasiswa2 = new Mahasiswa();
    mahasiswa2.nama = "Otong";
    mahasiswa2.NIM = "17069124874";
    mahasiswa2.jurusan = "Teknik Komputer";
    mahasiswa2.IPK = 3.50;
    mahasiswa2.umur = 20;

    System.out.println(mahasiswa2.nama);
    System.out.println(mahasiswa2.NIM);
    System.out.println(mahasiswa2.jurusan);
    System.out.println(mahasiswa2.IPK);
    System.out.println(mahasiswa2.umur);
  }
}
