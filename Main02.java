import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Object wynik=23.0+76;
        System.out.println(wynik.getClass());
        wynik=41*2.0+3;
        System.out.println(wynik.getClass());
        wynik=5-33;
        System.out.println(wynik.getClass());
        wynik=109%3;
        System.out.println(wynik.getClass());
        wynik=50/2;
        System.out.println(wynik.getClass());
        wynik=4|2;
        System.out.println(wynik.getClass());
        wynik=3^5;
        System.out.println(wynik.getClass());
        wynik=7&9;
        System.out.println(wynik.getClass());

        double wynik2=((Math.sqrt(7)-1)/2)+Math.pow(3,3)%2;
        System.out.println(wynik2);
        System.out.println((int)wynik2);
        wynik2=(2002/30)*1;
        System.out.println(wynik2);
        System.out.println((int)wynik2);
        wynik2=(3+Math.sqrt(3))/((Math.sqrt(5)/2)/3)+1;
        System.out.println(wynik2);
        System.out.println((int)wynik2);
        int a=8;
        int b=3;
        int c=4;
        wynik2 = a%b%c;
        System.out.println(wynik2);
        System.out.println((int)wynik2);

        Scanner sc = new Scanner(System.in);
        System.out.printf("Podaj pierwsze słowo: ");
        String slowo1= sc.nextLine();
        System.out.printf("Podaj drugie słowo: ");
        String slowo2= sc.nextLine();
        System.out.println(slowo1+" "+slowo2);

        System.out.printf("Podaj pierwsza liczbe: ");
        Double liczba1= sc.nextDouble();
        System.out.printf("Podaj druga liczbe: ");
        Double liczba2= sc.nextDouble();
        System.out.println("Suma: "+(liczba1+liczba2));
        System.out.println("Różnica: "+(liczba1-liczba2));
        System.out.println("iloczyn: "+(liczba1*liczba2));
        System.out.println("Iloraz: "+(liczba1/liczba2));

        System.out.printf("Podaj liczbe: ");
        Double liczbax= sc.nextDouble();
        System.out.println(liczbax+140);
        System.out.println(liczbax-31);
        System.out.println(liczbax*7);
        System.out.println(liczbax/13);
        System.out.println(liczbax%7);
        


    }
}
