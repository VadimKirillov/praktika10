import java.util.Scanner;

public class Ex1 {
    public static String triangle(int n) {
        int sum = 0;
        int k = 0;
        if (n == 1) {
            System.out.print(1);
        }
        else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                k = i;
            }
            System.out.print(triangle(--n) + " " + k);
        }
        return "";
    }
    public static String toab(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + toab(a - 1, b);
        }
        else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + toab(a + 1, b);
        }
    }
    public static int sumks(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int n = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = n; i < 10; i++) {
            res += sumks(len + 1, sum + i, k, s);
        }
        return res;
    }
    public static int sumchisel(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + sumchisel(n / 10);
        }
    }
    public static boolean prostota(int n,int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return prostota(n, i + 1);
        } else {
            return true;
        }
    }
    public static void mnoshiteli(int n){
        int i=2;
        while(i<=n){
            if(n%i == 0) {
                System.out.print(i + " ");
                if (i == n) {
                    return;
                }
                break;
            }
            i++;
        }
        mnoshiteli(n/i);
    }
    public static boolean palindrome(String s){
        int n = s.length();

        for (int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static int nulab(int a,int b){
        if (a==0 || b ==0){
            return 1;
        }

        if (a>b+1){
            return 0;
        }

        return nulab(a, b - 1) + nulab(a - 1, b - 1);
    }
    public static int razvorot(int n, int i){
        if (n==0){
            return i;
        }
        else{
            return razvorot(n/10,i*10+n%10);
        }
    }
    public static int koled() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return koled() + n + m;
            }
            else {
                int k = in.nextInt();
                if (k == 1) {
                    return koled() + n + m + k;
                }
                else {
                    return n + m + k;
                }
            }
        }
        else {
            int m = in.nextInt();
            if (m == 1) {
                return koled() + n + m;
            } else {
                return n + m;
            }
        }
    }
    public static void nechet() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                nechet();
            }
            else {
                nechet();
            }
        }
    }
    public static void nechetnum() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m != 0)
                nechetnum();
        }
    }
    public static String cifripoodnoy(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return cifripoodnoy(n / 10) + " " + n % 10;
        }
    }
    public static int obratnopoodnoy(int n) {

        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return obratnopoodnoy(n / 10);
        }
    }

    public static void kolvomax(int max, int k) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n > 0) {

            if (n > max) {
                kolvomax(n, 1);
            }
            else if (n == max) {
                kolvomax(max, ++k);
            }
            else {
                kolvomax(max, k);
            }
        }
        else {
            System.out.println(k);
        }
    }
    public static int poslmax() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, poslmax());
        }
    }

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        //int b = input.nextInt();
        //String s = "okko";


        //System.out.println(toab(a,b));
        //System.out.println(sumks(0, 0, 3, 15));
        //System.out.println(sumchisel(a));
        //System.out.println(prostota(a,2));
        //mnoshiteli(a);
        //System.out.println(palindrome(s));
        //System.out.println(nulab(a,b));
        //System.out.println(razvorot(a ,0));
        //System.out.println(koled());
        //nechet();
        //nechetnum();
        //System.out.println(cifripoodnoy(a));
        //System.out.println(obratnopoodnoy(a));
        //kolvomax(0,0);
        System.out.println(poslmax());







    }
}
