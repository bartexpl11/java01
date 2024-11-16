public class Main {

    public static void trojkipitagorejskie(int n) {
        for(int a=1;a<=n;a++) {
            for(int b=a;b<=n;b++) {
                for(int c=b;c<=n;c++) {
                    if(a*a+b*b==c*c) {
                        System.out.println("a="+a+", b="+b+", c="+c);
                    }
                }
            }
        }
    }

    public static void funKwaRozwiazania(int n){
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                for (int c = 1; c < n; c++) {
                    if ((b*b-4*(a*c))>=0) {
                        System.out.println(a + "x^2+" + b + "x+" + c + " maja przynajmniej jedno rozwwiązanie");
                        System.out.println("Delta wynosi = "+(b*b-4*(a*c)));
                    }
                }
            }
        }
    }

    public static void funKwaDelta(int n){
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                for (int c = 1; c < n; c++) {
                    if ((b * b - 4 * (a * c)) >= 0) {
                        for (int d = 0; d < n / 2; d++) {
                            if (Math.sqrt((b * b - 4 * (a * c))) == d * d) {
                                System.out.println(a + "x^2+" + b + "x+" + c + "=" + (b * b - 4 * (a * c)));
                                System.out.println("sqrt(" + ((b * b - 4 * (a * c)) + ")=" + d*d));
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean liczbyPierwsze(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void liczbyPodzielne(int m, int n) {
        for(int i=1;i<=Math.pow(10, m);i++) {
            if(i%n==0) {
                System.out.print(i+" ");
            }
        }
    }
    static void piramida(int n,String wariant) {
        if (wariant == "jeden") {
            for (int i = 1; i < n; i++) {
                System.out.println("*");
                for (int j = 0; j < i; j++) {
                    if (i > j) {
                        System.out.print("*");
                    }
                }
            }
            System.out.print("*");
        }
        if (wariant == "dwa") {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n - i - 1; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    static int silnia(int n){
        int wynik=0;
        if(n<=1) {
            wynik = 1;
            return wynik;
        }

        return wynik=n*silnia(n-1);
    }
    static int silniaPodwojna(int n){
        int wynik=1;
        while(n>1){
            wynik = wynik*n;
            n=n-2;
        }
        return wynik;
    }
    static int silniamta(int n,int m){
        int wynik=1;
        while(n>1) {
            wynik = wynik * n;
            n=n-m;
        }
        return wynik;
    }
    static int dwumianNewtona(int n, int k) {
        return(silnia(n)/(silnia(k)*silnia(n-k)));
    }
    public static int ciagFibonacciego(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return ciagFibonacciego(n-1)+ciagFibonacciego(n-2);
        }
    }
    public static int sumaNaturalnych(int n){
        int suma = 0;
        for(int i = 1; i <= n; i++){
            suma += i;
        }
        return suma;
    }
    public static int sumaParzystych(int n){
        int suma = 0;
        for(int i = 2; i <= n; i += 2){
            suma += i;
        }
        return suma;
    }
    public static int sumaNieparzystych(int n){
        int suma = 0;
        for(int i = 1; i <= n; i += 2){
            suma += i;
        }
        return suma;
    }
    public static int sumaKwaNaturalnych(int n){
        int suma = 0;
        int kwadrat;
        for(int i = 1; i <= n; i++){
            kwadrat = i*i;
            suma += kwadrat;
        }
        return suma;
    }
    public static int sumaSzeNaturalnych(int n) {
        int suma = 0;
        int szescian;
        for (int i = 1; i <= n; i++) {
            szescian = i * i * i;
            suma += szescian;
        }
        return suma;
    }
    public static double sumaOdwNaturalnych(int n){
        double suma = 0.0;
        for(int i = 1; i <= n; i++){
            suma += 1.0/i;
        }
        return suma;
    }
    public static boolean czyPalindrom(String wyraz){
        for(int i = 0; i < wyraz.length()/2; i++){
            if(wyraz.charAt(i) != wyraz.charAt(wyraz.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void trojkatPascala(int n){
        String rzad = " ".repeat(n)+1;
        System.out.println(rzad);
        int wartosc;
        for(int i = 2; i < n+1; i++){
            rzad = " ".repeat(n-i)+1+" ";
            for(int j = 1; j < i+1; j++){
                wartosc = dwumianNewtona(i, j);
                rzad += wartosc+" ";
            }
            System.out.println(rzad);
        }
    }
    public static boolean czyPalindrom(int n){
        int x = n;
        int y = n;
        int zm = 0;
        int j = 0;
        while(y != 0){
            y /= 10;
            j++;
        }
        for(int i = j; i > 0; i--) {
            zm += x % 10 * (Math.pow(10, i-1));
            x /= 10;
        }
        return n == zm;
    }
    public static boolean czyDoskonala(int n) {
        int liczba = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) liczba += i;
        }
        return n == liczba;
    }
    public static boolean czyPierwsza(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int NWD(int a, int b){
        while(a != b){
            if(a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        return a;
    }
    public static int[] wczytajTablice(int n) {
        int[] res = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d: ", i + 1);
            res[i] = scanner.nextInt();
        }

        return res;
    }

    public static void podzbiory(int[] arr) {
//        [1, 2, 3] => [1] [1 2] [1 3] [2] [2 1] [2 3] [3]
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d],", arr[i]);
        }
    }

    public static void main(String[] args) {
    System.out.println("\nzad 1:");
    trojkipitagorejskie(10);
    System.out.println("\nad 2:");
    funKwaRozwiazania(4);
    System.out.println("\nzad 3:");
    funKwaDelta(8);
    System.out.println("\nzad 4:");
    int n=98;
        System.out.println("Liczby pierwsze=");
        for(int i=2;i<=n;i++){
            if(liczbyPierwsze(i)){
                System.out.print(i+" ");
            }
    }
        System.out.println("\nzad5:");
        System.out.println("podzielne=");
        liczbyPodzielne(2,14);
        System.out.println(" ");
        System.out.println("\nzad6:");
        piramida(5,"jeden");
        System.out.println(" ");
        System.out.println(" ");
        piramida(5,"dwa");
        System.out.println("\nzad7:");
        System.out.println("wynik silni "+n+"="+silnia(n));
        System.out.println("\nzad8:");
        System.out.println("wynik silni podwojnej"+n+"="+silniaPodwojna(n));
        System.out.println("\nzad9:");
        int m=3;
        n=5;
        System.out.println("wynik silni m-tej "+n+"="+silniamta(n,m));
        System.out.println("\nzad10:");
        System.out.println("wynik dwumianu newtona "+n+ m+"="+dwumianNewtona(n,m));
        System.out.println("\nzad11:");
        for(int i=0; i<=n; i++){
            System.out.println(ciagFibonacciego(i));
        }
        System.out.println("\nzad12a:");
        System.out.println(sumaNaturalnych(5));
        System.out.println("\nzad12b:");
        System.out.println(sumaParzystych(5));
        System.out.println("\nzad12c:");
        System.out.println(sumaNieparzystych(5));
        System.out.println("\nzad12d:");
        System.out.println(sumaKwaNaturalnych(5));
        System.out.println("\nzad12e:");
        System.out.println(sumaSzeNaturalnych(5));
        System.out.println("\nzad12f:");
        System.out.println(sumaOdwNaturalnych(5));
        System.out.println("\nzad13:");
        System.out.println(czyPalindrom("kajak"));
        System.out.println("\nzad14:");
        trojkatPascala(4);
        System.out.println("\nzad15:");
        System.out.println(czyPalindrom(5335));
        System.out.println("\nzad16:");
        System.out.println(czyDoskonala(28));
        System.out.println("\nzad17:");
        System.out.println(czyPierwsza(29));
        System.out.println("\nzad18:");
        System.out.println(NWD(12, 15));

    }

}
