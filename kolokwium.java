

public class Main {

    public static void ciagArytmetycznyRodzajuM(int n, int m, int a1, int[] r){
        int[] tab=new int[n];
        tab[0]=a1;
        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
                tab[j]=tab[j-1]+r[i];
            }


        }
        for(int k=0; k<n; k++){
            System.out.print(tab[k]+" ");
        }
    }

    public static boolean czyCiagArytmetyczny(int[] tab){
        int r= tab[1]-tab[0];
        for(int i=2;i<tab.length;i++){
            if(tab[i]-tab[i-1]!=r){
                System.out.println("Fałsz");
                return false;
            }
        }
        return true;
    }
    public static boolean czyCiagArytmetycznyRodzajuM(int[] tab, int m){
        if(m==1){
            int r= tab[1]-tab[0];
            for(int i=2;i<tab.length;i++){
                if(tab[i]-tab[i-1]!=r){
                    System.out.println("Fałsz");
                    return false;
                }
            }
            return true;
        }


        int[] arr=new int[tab.length-1];
        int[] wynik=new int[arr.length-1];




            arr[0]=tab[1]-tab[0];
            for(int i=1;i<tab.length-1;i++){
                arr[i]=tab[i+1]-tab[i];
            }
            if(m==2)
            {
                if(czyCiagArytmetyczny(arr)==true){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                wynik[0]=arr[1]-arr[0];
                for(int i=1;i<arr.length-1;i++){
                    wynik[i]=arr[i+1]-arr[i];
                }
                if(czyCiagArytmetyczny(wynik)==true){
                    return true;
                }
                else{
                    return false;
                }
            }


    }
    public static int podciag(int[] tab){
        int count=1;
        int temp=1;
        for(int i=1;i<tab.length;i++){
            if(tab[i]>tab[i-1]){
                temp++;
            }
            else{
                if(temp>count) count=temp;
                temp=1;
            }
        }
        if(temp>count) count=temp;
        System.out.println(count);
        return count;
    }
    public static int podciag(int[] tab, int r){
        int count=1;
        int temp=1;
        for(int i=1;i<tab.length;i++){
            if(tab[i]>tab[i-1] && tab[i]-tab[i-1]==r){
                temp++;
            }
            else{
                if(temp>count) count=temp;
                temp=1;
            }
        }
        if(temp>count) count=temp;
        System.out.println(count);
        return count;
    }
    public static void sekwencjaCollatza(int n, int c){
        if(c>0) System.out.print(c+", ");
        for(int i=1;i<n;i++){
            if(c>0) {
                if (c % 2 == 0) {
                    c = c / 2;
                } else {
                    c=c*3+1;
                }
            }
            System.out.print(c+", ");
        }
    }
    public static void minMaxSekwencjaCollatza(int n, int c) {
        if (c > 0) {
            int[] tab = new int[n];
            tab[0] = c;
            for (int i = 1; i < n; i++) {

                if (tab[i-1] % 2 == 0) {
                    tab[i] = tab[i-1] / 2;
                } else {
                    tab[i] = tab[i-1] * 3 + 1;
                }
            }


            double max = tab[0];
            double min = tab[0];
            for (int i = 1; i < n; i++) {
                if (tab[i] > max) {
                    max = tab[i];
                }
                if (tab[i] < min) {
                    min = tab[i];
                }
            }

            System.out.println("min=" + min);
            System.out.println("max=" + max);
        }
    }

    public static void main(String[] args) {

        System.out.println("\nzad1:");
        ciagArytmetycznyRodzajuM(10,3,5,new int[]{2,3,4});
        System.out.println("\nzad2:");
        czyCiagArytmetyczny(new int[]{1,2,3,4,5});
        System.out.println("\nzad3:");
        czyCiagArytmetycznyRodzajuM(new int[]{1,8,27,64, 125},3);
        System.out.println("\nzad4:");
        podciag(new int[]{5,2,4,3,6,8,2,3,4,1,2});
        System.out.println("\nzad5:");
        podciag(new int[]{1,2,4,6,8,1,2,3,4,5,4,1,2}, 2);
        System.out.println("\nzad6:");
        sekwencjaCollatza(10, 11);
        System.out.println("\nzad7:");
        minMaxSekwencjaCollatza(10, 11);


    }
}

//
//
//
//
//
//