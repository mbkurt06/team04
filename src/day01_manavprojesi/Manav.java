package day01_manavprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
    static List<String> manavUrunleriIsimList = new ArrayList<>();
    static List<Double> manavUrunleriFiyatList = new ArrayList<>();

    static List<Double> sepetUrunFiyati = new ArrayList<>();// sepetteki urunlerin fiyati
    static List<Double> sepetUrunKg = new ArrayList<>();
    static List<String> sepetUrunIsmi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    //Leyla Hanim
    public static List<String> manavUrunler() { //Manav urunleri icin liste
        List<String> manavName = new ArrayList<>();
        manavName.add("Domates");
        manavName.add("Patates");
        manavName.add("Biber");
        manavName.add("Soğan");
        manavName.add("Havuç");
        manavName.add("Elma ");
        manavName.add("Muz");
        manavName.add("Çilek");
        manavName.add("Kavun");
        manavName.add("Limon");

        return manavName;
    }

    //Leyla Hanim
    public static List<Double> manavFiyat() {  // Manav fiyatlari icin liste
        List<Double> manavFiy = new ArrayList<>();
        manavFiy.add(2.10);
        manavFiy.add(3.20);
        manavFiy.add(1.50);
        manavFiy.add(2.30);
        manavFiy.add(3.10);
        manavFiy.add(1.20);
        manavFiy.add(1.90);
        manavFiy.add(6.10);
        manavFiy.add(4.30);
        manavFiy.add(0.50);

        return manavFiy;
    }

    //Leyla Hanim
    public static List<String> sarkuteriUrunler() {   //sarkuteri icin liste
        List<String> sarkuteriName = new ArrayList<>();
        sarkuteriName.add("Pastirma");
        sarkuteriName.add("Sucuk");
        sarkuteriName.add("Selam");
        sarkuteriName.add("Sosis");
        sarkuteriName.add("Kavurma");
        sarkuteriName.add("Duman");
        sarkuteriName.add("Jambon");

        return sarkuteriUrunler();
    }

    //Leyla Hanim
    public static List<Double> sarkuteriFiyatlar() { // sarkuteri fiyatlari bulunan liste
        List<Double> sarkFiy = new ArrayList<>();
        sarkFiy.add(8.40);
        sarkFiy.add(4.80);
        sarkFiy.add(7.90);
        sarkFiy.add(4.00);
        sarkFiy.add(12.40);
        sarkFiy.add(5.90);
        sarkFiy.add(4.45);

        return sarkuteriFiyatlar();
    }

    //Leyla Hanim
    public static List<String> sutUrunler() {   //sut urunleri icin liste
        List<String> sutUrunleriName = new ArrayList<>();
        sutUrunleriName.add("Sut");
        sutUrunleriName.add("Beyaz Peynir");
        sutUrunleriName.add("Suzme");
        sutUrunleriName.add("Yogurt");
        sutUrunleriName.add("Kefir");
        sutUrunleriName.add("Burma Peynir");
        sutUrunleriName.add("Ayran");

        return sutUrunler();
    }

    //Leyla Hanim
    public static List<Double> sutFiyatlar() { //sut urunlerinin fiyati icin liste
        List<Double> sutF = new ArrayList<>();
        sutF.add(13.00);
        sutF.add(17.00);
        sutF.add(12.00);
        sutF.add(10.00);
        sutF.add(8.00);
        sutF.add(8.90);
        sutF.add(7.00);

        return sarkuteriFiyatlar();
    }

    //Leyla Hanim
    public static void printManav() {

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
    }

    //Leyla Hanim
    public static void printSarkuteri() {
        System.out.println(" No  Ürün    Fiyat\n" +
                " == ======= =======\n" +
                " 00 Pastirma  2.10 TL\n" +
                " 01 Sucuk     3.20 TL\n" +
                " 02 Selam     1.50 TL\n" +
                " 03 Sosis     2.30 TL\n" +
                " 04 Kavurma   3.10 TL\n" +
                " 05 Duman     1.20 TL\n" +
                " 06 Jambon    1.90 TL\n");


    }
/*    public static void urunEkleManav(String isim,Double fiyat){
        manavUrunleriIsimList.add(isim);
        manavUrunleriFiyatList.add(fiyat);
    }*/

    //Leyla Hanim
    public static void printSutUrun() {
        System.out.println(" No  Ürün    Fiyat\n" +
                " == ======= =======\n" +
                " 00 Sut           2.10 TL\n" +
                " 01 Beyaz Peynir  3.20 TL\n" +
                " 02 Süzme         1.50 TL\n" +
                " 03 Yogurt        2.30 TL\n" +
                " 04 Kefir         3.10 TL\n" +
                " 05 Burma peynir  1.20 TL\n" +
                " 06 Ayran         1.90 TL\n");
    }

    //Adem Bey
    public static void sepeteUrunMiktariEkle(Double miktar) {
        sepetUrunKg.add(miktar);

    }

    public static void sepeteUrunMiktariEkle(int index, Double miktar) {
        sepetUrunKg.set(index, miktar);

    }

    //Adem Bey
    public static void sepeteUrunFiyatiEkle(Double price) {
        sepetUrunFiyati.add(price);
    }

    //Adem Bey
    public static void sepeteUrunAdiEkle(String urunAdi) {
        sepetUrunIsmi.add(urunAdi);
    }


    public static void getFatura(List<String> sepetUrunIsmi, List<Double> sepetUrunFiyati, List<Double> sepetUrunKg) {

    }

    public static void runMarket() {
        manavUrunleriIsimList = manavUrunler();
        manavUrunleriFiyatList = manavFiyat();
        boolean alisVeriseDevamMi = true;
        int secim = 0;
        int urunSecim = 0;
        int cikis;

        while (alisVeriseDevamMi) {
            secim = 0;
            cikis = 1;
            int index = -1;
            Double urunMiktariKg = 0.0;

            System.out.println("     ==Gida Marketimize Hoş Geldiniz!==");
            System.out.println("Asagidaki sayilar ile istediginiz urunlere gidin \n" +
                    "   1 - Manav\n   2 - Sharkuteri\n   3 - Sut urunleri\n   4 - Kasa\n   5 - Cikis \nSeciminiz: ");

            secim = scan.nextInt();
            if (secim == 1) // Kullanici ilk basta hangi urun paketine gidecekse burdan secim yapar
            {
                while (cikis != 20) {
                    printManav();
                    System.out.println("Bir ust menuye gecmek icin 20 a basiniz");
                    urunSecim = scan.nextInt();

                    if (urunSecim >= 0 && urunSecim < manavUrunleriIsimList.size()) {
                        index = contains(sepetUrunIsmi, manavUrunleriIsimList.get(urunSecim));
                        System.out.println(manavUrunleriIsimList.get(urunSecim) + " kac kg olsun");
                        urunMiktariKg = scan.nextDouble();
                        if (index == -1) {
                            sepeteUrunAdiEkle(manavUrunleriIsimList.get(urunSecim));

                            sepeteUrunMiktariEkle(urunMiktariKg);
                            sepeteUrunFiyatiEkle(manavUrunleriFiyatList.get(urunSecim));
                        } else {
                            sepeteUrunMiktariEkle(index, sepetUrunKg.get(index) + urunMiktariKg);
                        }
                    }

                    if (urunSecim == 20) {
                        cikis = 20;
                    }
                }

            } else if (secim == 2) {
                printSarkuteri();
            } else if (secim == 3) {
                printSutUrun();
            } else if (secim == 4) {
                //getFatura();
            } else if (secim == 5) {
                alisVeriseDevamMi = false;
            } else
                System.out.println("Yanlis secim yaptiniz");
        }
        String str = "              ";
        for (int i = 0; i < sepetUrunIsmi.size(); i++) {

            System.out.println(sepetUrunIsmi.get(i) + str.substring(0, str.length() - sepetUrunIsmi.get(i).length())
                    + "   " + sepetUrunFiyati.get(i) + "  x  " + sepetUrunKg.get(i) + "=" + (sepetUrunFiyati.get(i) * sepetUrunKg.get(i)));

        }


    }

    public static int contains(List<String> list, String product) {
        int index = -1;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(0).equals(product)) {
                index = i;
                break;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        runMarket();
    }

}
