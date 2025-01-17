import java.util.ArrayList;

public class zestaw_nr6 {
    ///zad 1
    public static class Produkt {
        String nazwa;
        double cena;
        int iloscNaMagazynie;

        public Produkt(String name, double price, int quantity) {
            nazwa = name;
            cena = price;
            iloscNaMagazynie = quantity;
        }

        public void wyswietlInformacje() {
            System.out.println(String.format("Nazwa: %s Cena: %.2f Ilość: %d", nazwa, cena, iloscNaMagazynie));
        }

        public void dodajDoMagazynu(int quantity) {
            iloscNaMagazynie += quantity;
        }

        public void usunZMagazynu(int quantity) {
            if (iloscNaMagazynie >= quantity) {
                iloscNaMagazynie -= quantity;
            }
        }
    }

    ///zad 2
    public static class KoszykZakupowy {
        ArrayList<Produkt> listaProdukt;

        public KoszykZakupowy(ArrayList<Produkt> list) {
            listaProdukt = list;
        }

        public void dodajProdukt(Produkt goods, int quantity) {
            if (goods.iloscNaMagazynie >= quantity) {
                listaProdukt.add(new Produkt(goods.nazwa, goods.cena, quantity));
                goods.iloscNaMagazynie -= quantity;
            }

        }

        public void wyswietlZawartoscKoszyka() {
            System.out.println("Zawartość koszyka:");
            for (int i = 0; i < listaProdukt.size(); i++) {
                System.out.print(String.format("Nazwa: %s Cena: %.2f Ilość: %d\n", listaProdukt.get(i).nazwa,
                        listaProdukt.get(i).cena, listaProdukt.get(i).iloscNaMagazynie));
            }
        }

        public double obliczCalkowitaWartosc() {
            double total = 0;
            for (int i = 0; i < listaProdukt.size(); i++) {
                total += listaProdukt.get(i).cena * listaProdukt.get(i).iloscNaMagazynie;
            }

            return total;
        }

    }

    ///zad 3
    public static class Zamowienie {
        KoszykZakupowy koszyk;
        String statusZamowienia;
        String platnosc;

        public Zamowienie(KoszykZakupowy cart, String status, String payment) {
            koszyk = cart;
            statusZamowienia = status;
            platnosc = payment;
        }

        public void ustawStatusZamowienia(String status) {
            statusZamowienia = status;
        }

        public void wyswietlZamowienia() {
            koszyk.wyswietlZawartoscKoszyka();
            System.out.println(String.format("Status: %s", statusZamowienia));
        }

        public void finalizujZamowienie() {
            if (platnosc == "Opłacone") {
                statusZamowienia = "Gotowe do wysyłki"
            }
        }

        public void zwrocProdukt(String name, int quantity) {
            ArrayList<Produkt> temp = koszyk.listaProdukt;

            if (temp.contains(name)) {
                for(int i=0; i<temp.size(); i++) {
                    if (temp.get(i).nazwa == name) {
                        if (quantity <= temp.get(i).iloscNaMagazynie) {
                            temp.get(i).iloscNaMagazynie - quantity;
                        }
                        else {
                            temp.get(i).iloscNaMagazynie = 0;
                        }
                    }
                }
            }

        }
    }

    ///zad 4
    public static class Klient {
        String imie;
        String nazwisko;
        ArrayList<Zamowienie> listaZamowien;

        public Klient(String name, String surname, ArrayList<Zamowienie> list) {
            imie = name;
            nazwisko = surname;
            listaZamowien = list;
        }

        public void dodajZamowienie(Zamowienie goods) {
            listaZamowien.add(goods);
        }

        public void wyswietlHistorieZamowien() {
            System.out.println(String.format("Historia zamówień klienta: %s %s\n", imie, nazwisko));
            for(int i = 0; i < listaZamowien.size(); i++) {
                listaZamowien.get(i).wyswietlZamowienia();
                System.out.println("");
            }
        }

        public double obliczLacznyKosztZamowien() {
            double total = 0;

            for (int i = 0; i < listaZamowien.size(); i++) {
                total += listaZamowien.get(i).koszyk.obliczCalkowitaWartosc();
            }

            return total;
        }
    }

    ///zad 5
    public static class Sklep {
        ArrayList<Produkt> produkty;

        public Sklep(ArrayList<Produkt> list) {
            produkty = list;
        }

        public void dodajProdukt(Produkt goods) {
            produkty.add(goods);
        }

        public void wyswietlOferty() {
            System.out.println("Oferty sklepu:");
            for(int i = 0; i < produkty.size(); i++) {
                System.out.println(String.format("%s Cena: %.2f Ilość: %d", produkty.get(i).nazwa,
                        produkty.get(i).cena, produkty.get(i).iloscNaMagazynie));
            }
        }
    }

    ///zad 6
    public static class Platnosc {
        double kwota;
        String statusPlatnosci = "Do zapłaty";

        public Platnosc(double price, String status) {
            kwota = price;
            statusPlatnosci = status;
        }

        public void zaplac() {
            statusPlatnosci = "Opłacone";
            kwota = 0;
        }
    }

    public static void main(String[] args) {
        ///zad 1
        System.out.println("Zadanie 1:");
        Produkt pomidor_magazyn = new Produkt("Pomidor", 3.5, 10);
        pomidor_magazyn.wyswietlInformacje();
        System.out.println("");

        pomidor_magazyn.dodajDoMagazynu(20);
        pomidor_magazyn.wyswietlInformacje();
        System.out.println("");

        pomidor_magazyn.usunZMagazynu(24);
        pomidor_magazyn.wyswietlInformacje();
        System.out.println("");

        pomidor_magazyn.usunZMagazynu(100);
        pomidor_magazyn.wyswietlInformacje();
        System.out.println("");

        ///zad 2
        System.out.println("Zadanie 2:");
        Produkt jablko_magazyn = new Produkt("Jablko", 3.5, 10);
        Produkt cebula_magazyn = new Produkt("Cebula", 2.5, 15);

        Produkt pomidor = new Produkt(pomidor_magazyn.nazwa, pomidor_magazyn.cena, 3);
        Produkt cebula = new Produkt(cebula_magazyn.nazwa, cebula_magazyn.cena, 4);

        ArrayList<Produkt> listaProdukt1 = new ArrayList<Produkt>();
        listaProdukt1.add(pomidor);
        listaProdukt1.add(cebula);

        KoszykZakupowy koszyk1 = new KoszykZakupowy(listaProdukt1);

        koszyk1.wyswietlZawartoscKoszyka();
        System.out.println("");

        System.out.println("Ilość jabłek na magazynie:");
        jablko_magazyn.wyswietlInformacje();
        System.out.println("");

        System.out.println("Dodanie jabłek do koszyka");
        koszyk1.dodajProdukt(jablko_magazyn, 9);

        jablko_magazyn.wyswietlInformacje();
        System.out.println("");
        koszyk1.wyswietlZawartoscKoszyka();
        System.out.println("");

        System.out.println(String.format("Cena końcowa: %.2f", koszyk1.obliczCalkowitaWartosc()));
        System.out.println("");

        ///zad 3
        System.out.println("Zadanie 3:");

        Zamowienie zam1 = new Zamowienie(koszyk1, "Oczekiwanie na płatność");

        zam1.wyswietlZamowienia();
        System.out.println("");

        zam1.ustawStatusZamowienia("Gotowe do wysyłki");

        zam1.wyswietlZamowienia();
        System.out.println("");

        ///zad 4
        System.out.println("Zadanie 4:");

        Produkt piwo = new Produkt("Piwo", 5, 50);
        Produkt papierosy = new Produkt("Papierosy", 12, 3000);

        ArrayList<Produkt> listaProdukt2 = new ArrayList<Produkt>();
        listaProdukt2.add(piwo);

        ArrayList<Produkt> listaProdukt3 = new ArrayList<Produkt>();
        listaProdukt3.add(papierosy);

        KoszykZakupowy koszyk2 = new KoszykZakupowy(listaProdukt2);

        KoszykZakupowy koszyk3 = new KoszykZakupowy(listaProdukt3);

        Zamowienie zam2 = new Zamowienie(koszyk2, "Gotowe do wysyłki");

        Zamowienie zam3 = new Zamowienie(koszyk3, "Oczekiwanie na płatność");

        ArrayList<Zamowienie> historia_mykel = new ArrayList<Zamowienie>();
        historia_mykel.add(zam1);
        historia_mykel.add(zam2);

        Klient mykel = new Klient("Mykel", "Mykelski", historia_mykel);

        mykel.dodajZamowienie(zam3);

        mykel.wyswietlHistorieZamowien();

        System.out.println(String.format("Łączna cena za zakupy: %.2f", mykel.obliczLacznyKosztZamowien()));
        System.out.println("");

        ///zad 5
        System.out.println("Zadanie 5:");

        ArrayList<Produkt> biedr_prod = new ArrayList<Produkt>();
        biedr_prod.add(piwo);
        biedr_prod.add(papierosy);
        biedr_prod.add(pomidor_magazyn);
        biedr_prod.add(cebula_magazyn);

        Sklep biedronka = new Sklep(biedr_prod);

        biedronka.dodajProdukt(jablko_magazyn);
        biedronka.wyswietlOferty();

        ///zad 6
        
    }
}