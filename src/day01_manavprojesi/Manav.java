package day01_manavprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
    static List<Integer> sepetUrunNo=new ArrayList<>();//sepetteki urunlerin ismini tutan liste
    static List<Double> sepetUrunFiyati= new ArrayList<>();// sepetteki urunlerin fiyati
    static List<Double> sepetUrunKg= new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("adem branch");

        System.out.println(" No  Ürün    Fiyat\n" +
                " == ======= =======\n" +
                " 00 Domates 2.10 TL\n" +
                " 01 Patates 3.20 TL\n" +
                " 02 Biber   1.50 TL\n" +
                " 03 Soğan   2.30 TL\n" +
                " 04 Havuç   3.10 TL\n" +
                " 05 Elma    1.20 TL\n" +
                " 06 Muz     1.90 TL\n" +
                " 07 Çilek   6.10 TL\n" +
                " 08 Kavun   4.30 TL\n" +
                " 09 Üzüm    2.70 TL\n" +
                " 10 Limon   0.50 TL\n");
        System.out.println("urunlerimiz");
        //Adem Bey

        sepeteEklenenUrunler(sepetUrunNo);
        sepetUrunFiyatilari(sepetUrunFiyati);
        sepetUrunlerKg(sepetUrunKg);


        /*
        sepetUrunler  list(string), sepetKg(double), sepetFiyat(double)
       tum islemleri methodlara yaptır.
       method--> public static void sepeteEkle(int ürünNo, double sepetKg){}
       alısverise devam mı ödeme mi?
       (1- method olarak yapılacak, listeler class seviyesinde, methodlara parametrer
       olarak seçilen ürünün cins kilosu gibi bilgiler verilecek
         */



    }

    public static void sepetUrunlerKg(List<Double> sepetUrunKg) {
        sepetUrunKg.add(1.5);

    }

    public static void sepetUrunFiyatilari(List<Double> sepetUrunFiyati) {
        sepetUrunFiyati.add(2.1);
    }

    public static void sepeteEklenenUrunler(List<Integer> sepetUrunNo) {
        sepetUrunNo.add(00);
    }




}