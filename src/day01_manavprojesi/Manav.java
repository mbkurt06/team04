package day01_manavprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
    static List<String> manavUrunleriIsimList = new ArrayList<>();
    static List<Double> manavUrunleriFiyatList = new ArrayList<>();
    static List<String> sarkuteriUrunleriIsimList = new ArrayList<>();
    static List<Double> sarkuteriUrunleriFiyatList = new ArrayList<>();
    static List<String> sutUrunleriIsimList = new ArrayList<>();
    static List<Double> sutUrunleriFiyatList = new ArrayList<>();

    static List<Double> sepetUrunFiyati = new ArrayList<>();// sepetteki urunlerin fiyati
    static List<Double> sepetUrunKg = new ArrayList<>();
    static List<String> sepetUrunIsmi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    //Leyla
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

    //Leyla
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

    //Leyla
    public static List<String> sarkuteriUrunler() {   //sarkuteri icin liste
        List<String> sarkuteriName = new ArrayList<>();
        sarkuteriName.add("Pastirma");
        sarkuteriName.add("Sucuk");
        sarkuteriName.add("Selam");
        sarkuteriName.add("Sosis");
        sarkuteriName.add("Kavurma");
        sarkuteriName.add("Duman");
        sarkuteriName.add("Jambon");

        return sarkuteriName;
    }

    //Leyla
    public static List<Double> sarkuteriFiyatlar() { // sarkuteri fiyatlari bulunan liste
        List<Double> sarkFiy = new ArrayList<>();
        sarkFiy.add(8.40);
        sarkFiy.add(4.80);
        sarkFiy.add(7.90);
        sarkFiy.add(4.00);
        sarkFiy.add(12.40);
        sarkFiy.add(5.90);
        sarkFiy.add(4.45);

        return sarkFiy;
    }

    //Leyla
    public static List<String> sutUrunler() {   //sut urunleri icin liste
        List<String> sutUrunleriName = new ArrayList<>();
        sutUrunleriName.add("Sut");
        sutUrunleriName.add("Beyaz Peynir");
        sutUrunleriName.add("Suzme");
        sutUrunleriName.add("Yogurt");
        sutUrunleriName.add("Kefir");
        sutUrunleriName.add("Burma Peynir");
        sutUrunleriName.add("Ayran");

        return sutUrunleriName;
    }

    //Leyla
    public static List<Double> sutFiyatlar() { //sut urunlerinin fiyati icin liste
        List<Double> sutF = new ArrayList<>();
        sutF.add(13.00);
        sutF.add(17.00);
        sutF.add(12.00);
        sutF.add(10.00);
        sutF.add(8.00);
        sutF.add(8.90);
        sutF.add(7.00);

        return sutF;
    }

    //Leyla
    public static void printProduct(List<String> productName, List<Double> productPrice) {

        System.out.println(" No  Ürün    Fiyat\n" +
                " == ======= =======\n");
        for (int i = 0; i < productName.size(); i++) {
            System.out.printf("%-2d  %-15s     %-5.2f\n", i, productName.get(i), productPrice.get(i));
        }
    }

    //Adem
    public static void sepeteUrunMiktariEkle(Double miktar) {
        sepetUrunKg.add(miktar);

    }

    //Adem Bey
    public static void sepeteUrunMiktariEkle(int index, Double miktar) {
        sepetUrunKg.set(index, miktar);

    }

    //Adem
    public static void sepeteUrunFiyatiEkle(Double price) {
        sepetUrunFiyati.add(price);
    }

    //Adem
    public static void sepeteUrunAdiEkle(String urunAdi) {
        sepetUrunIsmi.add(urunAdi);
    }

    //muhammet
    public static void getFatura() {
        Double price = 0.0;
        Double summPrice = 0.0;
        System.out.println("Id     Urun Adi         Fiyat   Miktar   Toplam");
        for (int i = 0; i < sepetUrunIsmi.size(); i++) {
            price = sepetUrunFiyati.get(i) * sepetUrunKg.get(i);
            System.out.printf("%-5d  %-15s  %-5.2f€  %-5.2fKg  %-5.2f€\n", i, sepetUrunIsmi.get(i), sepetUrunFiyati.get(i), sepetUrunKg.get(i), price);
            summPrice += sepetUrunFiyati.get(i) * sepetUrunKg.get(i);
        }
        System.out.printf("Toplam fiyat: %-5.2f €", summPrice);
    }

    //muhammet
    public static void printList(List<String> productName, List<Double> productPrice) {
        int urunSecim;
        int index;
        Double urunMiktariKg;
        int cikis = 0;

        while (cikis != 20) {
            printProduct(productName, productPrice);
            System.out.println("Bir ust menuye gecmek icin 20 a basiniz");
            urunSecim = scan.nextInt();

            if (urunSecim >= 0 && urunSecim < productName.size()) {
                index = contains(sepetUrunIsmi, productName.get(urunSecim));
                System.out.println(productName.get(urunSecim) + " kac kg olsun");
                urunMiktariKg = scan.nextDouble();

                if (index == -1) {
                    if (urunMiktariKg > 0) {
                        sepeteUrunAdiEkle(productName.get(urunSecim));
                        sepeteUrunFiyatiEkle(productPrice.get(urunSecim));
                        sepeteUrunMiktariEkle(urunMiktariKg);
                    } else {
                        System.out.println("Urun sepete eklenmedi. Miktar 0 dan buyuk olmalidir");

                    }
                } else {
                    if (urunMiktariKg > 0) {
                        sepeteUrunMiktariEkle(index, sepetUrunKg.get(index) + urunMiktariKg);
                    } else {
                        System.out.println("Urun sepete eklenmedi. Miktar 0 dan buyuk olmalidir");
                    }
                }
            }
            if (urunSecim == 20) {
                cikis = 20;
            }
        }
    }


    //muhammet
    public static void sepettenUrunCikar() {
        boolean urunCikarmayaDevamEdilsinMi = true;
        int index;
        String urunAdi;
        int durum;
        boolean sepettenCikis = true;
        while (urunCikarmayaDevamEdilsinMi) {
            sepettenCikis = true;
            if (sepetUrunIsmi.size() > 0) {
                getFatura();
                System.out.println("Lutfen cikarmak istediginiz urunun id sini giriniz");
                index = scan.nextInt();
                if (index >= 0 && index < sepetUrunIsmi.size()) {
                    urunAdi = sepetUrunIsmi.get(index);
                    sepetUrunIsmi.remove(sepetUrunIsmi.get(index));
                    sepetUrunFiyati.remove(sepetUrunFiyati.get(index));
                    sepetUrunKg.remove(sepetUrunKg.get(index));
                    System.out.println("Sepetten " + urunAdi + " cikarildi");
                    if (sepetUrunIsmi.size() > 0) {
                        while (sepettenCikis) {
                            System.out.println("Sepetten urun cikarmaya devam etmek icin 1 e bu menuden cikmak icin 2 ye basiniz");
                            durum = scan.nextInt();
                            if (durum == 1) {
                                sepettenCikis = false;
                            } else if (durum == 2) {
                                urunCikarmayaDevamEdilsinMi = false;
                                sepettenCikis = false;
                            } else {
                                System.out.println("Hatali secim yapildi");
                            }
                        }
                    }
                } else {
                    System.out.println("Hatali index girisi");
                }

            } else {
                System.out.println("Sepette urun bulunmamaktadir");
                urunCikarmayaDevamEdilsinMi = false;
            }
        }
    }

    //muhammet
    public static void runMarket() {
        manavUrunleriIsimList = manavUrunler();
        manavUrunleriFiyatList = manavFiyat();
        sarkuteriUrunleriIsimList = sarkuteriUrunler();
        sarkuteriUrunleriFiyatList = sarkuteriFiyatlar();
        sutUrunleriIsimList = sutUrunler();
        sutUrunleriFiyatList = sutFiyatlar();
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
                    "   1 - Manav\n   2 - Sarkuteri\n   3 - Sut urunleri\n   4 - Sepetten Urun Cikar\n   5 - Sepetimde Ne Var\n   6 - Kasa-Cikis\n Seciminiz: ");

            secim = scan.nextInt();
            if (secim == 1) // Kullanici ilk basta hangi urun paketine gidecekse burdan secim yapar
            {
                printList(manavUrunleriIsimList, manavUrunleriFiyatList);

            } else if (secim == 2) {
                printList(sarkuteriUrunleriIsimList, sarkuteriUrunleriFiyatList);
            } else if (secim == 3) {
                printList(sutUrunleriIsimList, sutUrunleriFiyatList);

            } else if (secim == 4) {
                sepettenUrunCikar();
            } else if (secim == 5) {
                getFatura();
            } else if (secim == 6) {
                //getFatura();
                alisVeriseDevamMi = false;
            } else
                System.out.println("Yanlis secim yaptiniz");
        }

        getFatura();

    }

    //muhammet
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
