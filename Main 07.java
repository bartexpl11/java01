class Produkt{
    public String nazwa;
    public int cena;
    public int iloscNaMagazynie;

    public Produkt(int iloscNaMagazynie ,int cena, String nazwa){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
    public void wyswietl(){
        System.out.println("NAZWA PRODUKTU: " +this.nazwa +
                "\nCENA: "+this.cena+
                "\nILOSC NA MAGAZYNIE: "+this.iloscNaMagazynie+
                "\n");
    }
    public int dodajDoMagazynu(int ilosc){
        this.iloscNaMagazynie = this.iloscNaMagazynie + ilosc;
        return this.iloscNaMagazynie;
    }
    public int usunZMagazynu(int ilosc){
        if(iloscNaMagazynie-ilosc<0){
            throw new IllegalArgumentException("Na magazynie jest nie wystarczajaca liczba produktow!");
        }
        else {
            this.iloscNaMagazynie = this.iloscNaMagazynie - ilosc;
            return this.iloscNaMagazynie;
        }
    }
}

class KoszykZakupowy{
    public Produkt [] produkty;
    int index;
    public int [] iloscc;

    public KoszykZakupowy(){
        iloscc = new int [100];
        index = 0;
        produkty = new Produkt[100];
    }

    public void dodajProdukt(Produkt produkt, int ilosc){
        if(ilosc<=produkt.iloscNaMagazynie){
            produkty[index] = produkt;
            iloscc[index]=ilosc;
            index++;
            produkt.usunZMagazynu(ilosc);
        }

    }

    public void wyswietlZawartoscKoszyk(){
        for(int i=0; i<index; i++){
            System.out.println(i+". "+produkty[i].nazwa+"  "+produkty[i].cena+"zl  sztuk:"+iloscc[i]);
        }
    }

    public void obliczCalkowitaWartosc(){
        int suma=0;
        for(int i=0; i<index; i++){
            suma=suma+(produkty[i].cena*iloscc[i]);
        }
        System.out.println("Calkowita wartosc koszyka to: "+suma+"zl");
    }

}

class Zamowienie{
    public KoszykZakupowy [] zawartosc;
    public String statusZamowienia;

    public Zamowienie(){
        zawartosc = new KoszykZakupowy[100];
        statusZamowienia = "Tworzenie";
    }

    public void ustawStatusZamowienia(String status){
        this.statusZamowienia = status;
    }

    public void wyswietlZamowienie(KoszykZakupowy KoszykZakupowy){
        KoszykZakupowy.wyswietlZawartoscKoszyk();
        System.out.println("Status: "+this.statusZamowienia);
    }

}

class Klient{

}

class Sklep{

}
class Platnosc{

}

class Magazyn{
    String produkty;
    int ilosc;

    public Magazyn(String produkty, int ilosc){
        this.produkty = produkty;
        this.ilosc = ilosc;
    }
    public void wyswietlMagazyn(){
        System.out.println("nazwa:"+ this.produkty + ", ilosc:" + this.ilosc);
    }

}

class Adres{
    String ulica;
    int numerDomu;
    int numerMieszkania;
    String miasto;
    String kodPocztowy;

    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy){
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public Adres(String ulica, int numerDomu,int numerMieszkania, String miasto, String kodPocztowy){
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public void pokaz(){
        if(this.numerMieszkania==0){
            System.out.println(this.kodPocztowy+" "+this.miasto+"\n"+this.ulica+" "+this.numerDomu);
        }
        else{
            System.out.println(this.kodPocztowy+" "+this.miasto+"\n"+this.ulica+" "+this.numerDomu+" "+this.numerMieszkania);
        }
    }
    public void przed(){

    }

}

public class Main {
    public static void main(String[] args) {
    Produkt cola = new Produkt(10,2,"cola");
    Produkt fanta = new Produkt(3,4,"fanta");
    Produkt sprite = new Produkt(5,7,"sprite");

    KoszykZakupowy k1 = new KoszykZakupowy();
    k1.dodajProdukt(cola,6);
    k1.dodajProdukt(fanta,3);
    k1.dodajProdukt(sprite,1);
    k1.wyswietlZawartoscKoszyk();
    k1.obliczCalkowitaWartosc();

    Zamowienie z1 = new Zamowienie();

    z1.ustawStatusZamowienia("Zamowiony");


//    Magazyn m1 = new Magazyn("ryz", 5);
//    Magazyn m2 = new Magazyn("woda", 3);
//    Magazyn m3 = new Magazyn("maka", 1);
//    m2.wyswietlMagazyn();
//
//    Adres a1 = new Adres("Wojska Polskiego", 2,20,"Olsztyn","19-222");
//    Adres a2 = new Adres("Wojska Polskiego", 2,"Olsztyn","19-222");
//    a1.pokaz();
//    a2.pokaz();

    }
}