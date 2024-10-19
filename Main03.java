import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj liczbe n: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int liczba=1;
        for(int i=0; i<n;i++)
        {

            for(int j=0; j<n-1;j++)
            {
                System.out.print("  ");
            }
            liczba=1;
            for(int k=0; k<=i;k++)
            {
                System.out.print(liczba+" ");
                liczba=liczba *(i-k)/(k+1);
            }
            System.out.println();
        }
    System.out.print("Podaj liczbe do sprawdzenia czy jest palindromem: ");
    int num= sc.nextInt();
    int temp=num;
    int reszta;
    int odrocony=0;
    do
    {
        reszta= temp % 10;
        temp=temp/10;
        odrocony=odrocony*10 + reszta;
    }while(temp>0);
    if(num==odrocony)
    {
        System.out.println("To jest palindrom!!!!!!!!!!");
    }
    else {
        System.out.println("NIE JEST palindromem");
    }
        System.out.println("Sprawdzenie: ");
        System.out.println(num);
        System.out.println(odrocony);
    }
}