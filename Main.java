import java.time.LocalDate;
import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
        String imie = "Bartek";
        String nazwisko = "Prawdzik";
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Dlugosc imienia wynosi: "+imie.length());
        System.out.println("Dlugosc nazwiska wynosi: "+nazwisko.length());
        String str1 = "Ala";
        String str2 = "ma";
        String str3 = "kota";
        String str4 = str1+" "+str2+" "+str3;
        System.out.println(str4);
        System.out.println("                    * ");
        System.out.println("                    * * ");
        System.out.println("                    * * * ");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("                    * * *");
        System.out.println("                    * * ");
        System.out.println("                    * ");
        for(int i=1; i<=6; i++)
        {
            for(int j=6; j>i; j--)
            {
                System.out.printf(" ");
            }

            for(int j=1; j<=i; j++)
            {
                System.out.printf("* ");
            }
            System.out.println("");
        }
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.printf(" ");
            }

            for(int j=5; j>=i; j--)
            {
                System.out.printf("* ");
            }
            System.out.println("");
        }
        System.out.println(str4.replace("a", "e"));
        System.out.println(str4.toUpperCase());
        System.out.println(str4.toLowerCase());
        char znak1 = 'A';
        char znak2 = '!';
        char znak3 = '@';
        char znak4 = '>';
        char znak5 = '~';
        char znak6 = '\n';
        char znak7 = '\b';
        int zn1= znak1;
        System.out.println("kod ASCII A: "+zn1);
        int zn2= znak2;
        System.out.println("kod ASCII !: "+zn2);
        int zn3= znak3;
        System.out.println("kod ASCII @: "+zn3);
        int zn4= znak4;
        System.out.println("kod ASCII >: "+zn4);
        int zn5= znak5;
        System.out.println("kod ASCII ~: "+zn5);
        int zn6= znak6;
        System.out.println("kod ASCII \\n: "+zn6);
        int zn7= znak7;
        System.out.println("kod ASCII \\b: "+zn7);

        System.out.println("małe litery: 97-122");
        System.out.println("duże litery: 65-90");
        System.out.println("cyfry litery: 48-59");


        String wyraz1 = "miś";
        String wyraz2 = "zwierzem";
        String wyraz3 = "wygląd";
        String Firststr = "Grzesiek nie wiedział dlaczego "+wyraz1+" jest tak drapieżnym "+wyraz2+" mimo, że jego "+wyraz3+" na to nie wskazuje";
        System.out.println(Firststr);

        String wyraz4 = "Wiedźmin";
        String wyraz5 = "Andrzeja Sapkowskiego";
        String Secondstr = wyraz4+" to najlepsza książka napisana przez "+wyraz5;
        System.out.println(Secondstr);

        String wyraz = "wodrze ";
        System.out.println(wyraz.repeat(5));

        System.out.println();
        System.out.println("Dzisiaj jest "+LocalDate.now().getDayOfMonth()+"-"+LocalDate.now().getMonthValue()+"-"+LocalDate.now().getYear()+"  godzina "+LocalTime.now());


        char numerek = 54;
        System.out.println(numerek);
        numerek =103;
        System.out.println(numerek);
        numerek =241;
        System.out.println(numerek);
        numerek =67;
        System.out.println(numerek);
        numerek =9999;
        System.out.println(numerek);

        numerek=(char)imie.length();
        System.out.println(numerek);
        numerek=(char) 175180;
        System.out.println(numerek);


    }
}
