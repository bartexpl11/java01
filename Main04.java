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
    public static void sumaOdwrotnosci(int[] tab){
        double sum=0;
        double[] arr= new double[tab.length];
        for(int i=0; i<tab.length;i++){
            arr[i]=tab[i];
        }
        for(int i=0; i<tab.length;i++){
            if(tab[i]!=0) {
                sum = sum + 1/arr[i];
            }
        }
        System.out.println("Suma Odwrotnosci: "+sum);
    }
    public static void sredniaArytmetyczna(int[] tab){
        double avg=0;
        for(int i=0; i<tab.length;i++){
            avg=avg=tab[i];
        }
        avg=avg/tab.length;
        System.out.println("Srednia Arytmetyczna: "+avg);

    }
    public static void sredniaGeometryczna(int[] tab){
        double avg=1;
        double count=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]>0){
                avg=avg*tab[i];
                count++;
            }

        }
        avg=Math.pow(avg,1/count);
        System.out.println("Srednia Geometryczna: "+avg);
    }
    public static void sredniaHarmoniczna(int[] tab){
        double avg=0;
        double count=0;
        double[] arr= new double[tab.length];
        for(int i=0; i<tab.length;i++){
            arr[i]=tab[i];
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0){
                avg=avg+1/arr[i];
                count++;
            }
        }
        avg=arr.length/avg;
        System.out.println("Srednia Harmoniczna: "+avg);
    }
    public static void najdluzszyCiagDodatnich(int[] tab){
        int count=0;
        int temp=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]>0) {
                temp++;
            }
            else{
                if(temp>count){
                    count=temp;
                }
                temp=0;
            }
            if(temp>count){
                count=temp;
            }
        }
        System.out.println("NajdluzszyCiagDodatnich: "+count);
    }
    public static void najdluzszyUjemnych(int[] tab){
        int count=0;
        int temp=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]<0) {
                temp++;
            }
            else{
                if(temp>count){
                    count=temp;
                }
                temp=0;
            }
            if(temp>count){
                count=temp;
            }
        }
        System.out.println("NajdluzszyCiagUjemnych: "+count);
    }
    public static void odwrocTablice(int[] tab){
        int[] arr= new int[tab.length];
        int count=0;
        for(int i=tab.length-1; i>=0;i--){
            arr[count]=tab[i];
            count++;
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(arr));
    }
    public static void odwrocTablice2(int[] tab, int indeksStart, int indeksStop){
        int[] arr= new int[tab.length];
        int count=0;
        for(int i=0; i<indeksStart;i++){
            arr[count]=tab[i];
            count++;
        }
        for(int i=indeksStop; i>=indeksStart;i--){
            arr[count]=tab[i];
            count++;
        }
        for(int i=indeksStop+1; i<tab.length;i++){
            arr[count]=tab[i];
            count++;
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(arr));
    }
    public static void wygenerujZakres(int n, int minWartosc, int maxWartosc){
        double[] tab= new double[n];
        double podzial = maxWartosc-minWartosc;
        podzial=podzial/(n-1);
        tab[0]=minWartosc;
        for(int i=1; i<n-1; i++){
          tab[i]=tab[i-1]+podzial;
        }
        tab[n-1]=maxWartosc;
        for(int i=0; i<n; i++){
            System.out.print(tab[i]+" ");
        }
    }

    public static void main(String[] args) {

        System.out.println("zad 1: ");
        generujTablice(20,-5,5);
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
        sumaOdwrotnosci(tab3);
        sredniaArytmetyczna(tab3);
        sredniaGeometryczna(tab3);
        sredniaHarmoniczna(tab3);
        System.out.println("\nzad 5: ");
        System.out.println("\nzad 6: ");
        int[] tab6 = generujTablice(20,-5,5);
        najdluzszyCiagDodatnich(tab6);
        najdluzszyUjemnych(tab6);
        System.out.println("c): ");
        odwrocTablice(tab6);
        System.out.println("d): ");
        odwrocTablice2(tab6,5,15);
        System.out.println("\nzad 7: ");
        wygenerujZakres(10,1,10);
    }
}
