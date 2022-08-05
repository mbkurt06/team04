package day01_manavprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
    static List<Integer> sepetUrunNo=new ArrayList<>();//sepetteki urunlerin ismini tutan liste
    static List<Double> sepetUrunFiyati= new ArrayList<>();// sepetteki urunlerin fiyati
    static List<Double> sepetUrunKg= new ArrayList<>();


        /*
        sepetUrunler  list(string), sepetKg(double), sepetFiyat(double)
       tum islemleri methodlara yaptır.
       method--> public static void sepeteEkle(int ürünNo, double sepetKg){}
       alısverise devam mı ödeme mi?
       (1- method olarak yapılacak, listeler class seviyesinde, methodlara parametrer
       olarak seçilen ürünün cins kilosu gibi bilgiler verilecek
         */


    public static void sepeteUrunMiktariEkle(Double miktar) {
        sepetUrunKg.add(miktar);

    }

    public static void sepeteUrunFiyatiEkle(Double price) {
        sepetUrunFiyati.add(price);
    }


    public static void sepeteEklenenUrunler(List<Integer> sepetUrunNo) {
        sepetUrunNo.add(00);
    }
    public static void sepeteUrunAdiEkle(String urunAdi) {


    }




}
