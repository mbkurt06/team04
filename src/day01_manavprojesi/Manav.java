package day01_manavprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
    static List<String> sepetUrunIsmi=new ArrayList<>();//sepetteki urunlerin ismini tutan liste
    static List<Double> sepetUrunFiyati= new ArrayList<>();// sepetteki urunlerin fiyati
    static List<Double> sepetUrunKg= new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

       


    }

    public static void sepeteUrunMiktariEkle(Double miktar) {
        sepetUrunKg.add(miktar);

    }

    public static void sepeteUrunFiyatiEkle(Double price) {
        sepetUrunFiyati.add(price);
    }

    public static void sepeteUrunAdiEkle(String urunAdi) {
        sepetUrunIsmi.add(urunAdi);
    }




}
