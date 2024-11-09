import java.util.Random;
import java.util.Arrays;
public class Main {

    public static int[] generujTablice(int n, int minWartosc, int Maxwartosc){
        int[] arr= new int[n];
        Random rand = new Random();
        for(int i=0; i<n; i++){
            arr[i]= (rand.nextInt(Maxwartosc-minWartosc+1))+minWartosc;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void wypiszTablice(int[] tab,int n, int m){
        int[][] matrix= new int[n][m];
        int count=0;
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                if(count>=tab.length){
                    matrix[i][j]= 0;
                }
                else{
                matrix[i][j]= tab[count];
                count++;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print("[");
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("]\n");
        }
    }
    public static void ileNieparzystych(int[] tab){
        int count=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]%2==1) count++;
        }
        System.out.println("Nieparzystych: "+count);
    }
    public static void ileParzystych(int[] tab){
        int count=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]%2==0) count++;
        }
        System.out.println("Parzystych: "+count);
    }
    public static void ileDodatnich(int[] tab){
        int count=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]>0) count++;
        }
        System.out.println("Dodatnich: "+count);
    }
    public static void ileUjemnych(int[] tab){
        int count=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]<0) count++;
        }
        System.out.println("Ujemnych: "+count);
    }
    public static void ileZerowych(int[] tab){
        int count=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]==0) count++;
        }
        System.out.println("Zerowych: "+count);
    }
    public static void ileMaxymalnych(int[] tab){
        int count=0;
        int max=tab[0];
        for(int i=0; i<tab.length;i++){
            if(max<tab[i]) max=tab[i];
        }
        for(int i=0; i<tab.length;i++){
            if(tab[i]==max) count++;
        }
        System.out.println("Maxymalnych: "+count);
    }
    public static void ileMinimalnych(int[] tab){
        int count=0;
        int min=tab[0];
        for(int i=0; i<tab.length;i++){
            if(min>tab[i]) min=tab[i];
        }
        for(int i=0; i<tab.length;i++){
            if(tab[i]==min) count++;
        }
        System.out.println("Maxymalnych: "+count);
    }
    public static void ileUnikalnych(int[] tab){
        int count=1;
        Arrays.sort(tab);
        for(int i=1; i<tab.length;i++){
            if(tab[i]!=tab[i-1]) count++;
        }

        System.out.println("Unikalnych: "+count);
    }
    public static void sumaDodatnich(int[] tab){
        int sum=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]>0) sum=sum+tab[i];
        }
        System.out.println("Suma Dodatnich: "+sum);
    }
    public static void sumaUjemnych(int[] tab){
        int sum=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]<0) sum=sum+tab[i];
        }
        System.out.println("Suma Ujemnych: "+sum);
    }


    public static void main(String[] args) {

        System.out.println("zad 1: ");
        generujTablice(10,5,16);
        System.out.println("\nzad 2: ");
        int[] tab2={1,2,3,4,5,6,7,8,9,10,11,12};
        wypiszTablice(tab2,4,5);
        System.out.println("\nzad 3: ");
        int[] tab3= generujTablice(20,-5,5);
        ileNieparzystych(tab3);
        ileParzystych(tab3);
        ileDodatnich(tab3);
        ileUjemnych(tab3);
        ileZerowych(tab3);
        ileMaxymalnych(tab3);
        ileMinimalnych(tab3);
        ileUnikalnych(tab3);
        System.out.println("\nzad 4: ");
        sumaDodatnich(tab3);
        sumaUjemnych(tab3);
    }
}