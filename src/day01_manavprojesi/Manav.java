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

    
    public static void sepetUrunlerKg(List<Double> sepetUrunKg) {
        sepetUrunKg.add(1.5);

    }

    public static void sepetUrunFiyatilari(List<Double> sepetUrunFiyati) {
        sepetUrunFiyati.add(2.1);
    }

    public static void sepeteEklenenUrunler(List<String> sepetUrunIsmi) {
        sepetUrunIsmi.add("Domates");
    }




}
