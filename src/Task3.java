import java.util.Scanner;

public class Task3 {
public static void main(String[]args) {
    //2
    Scanner scan1 = new Scanner(System.in);
    int kolvoster = scan1.nextInt();
    for (int i = 1; i <= kolvoster; ) {
        for (int j = 1; j <= i; j++) {
            System.out.println("*");
        }
        System.out.println();
    }
}}



import java.util.Scanner;

public class Task3 {
    public Task3() {
    }

    public static void main(String[] args) {
        Scanner scanfor1 = new Scanner(System.in);
        int b = scanfor1.nextInt();

        int a;
        for(int str = 1; str <= b; ++str) {
            System.out.println();

            for(a = 1; a <= str; ++a) {
                System.out.print("*");
            }
        }

        Scanner scannfor4 = new Scanner(System.in);
        a = scannfor4.nextInt();

        int c;
        for(int str = 1; str <= a; ++str) {
            System.out.println();

            for(c = 1; c < str; ++c) {
                System.out.print(" ");
            }

            for(c = str; c <= a; ++c) {
                System.out.print("* ");
            }
        }

        Scanner scanfor2 = new Scanner(System.in);
        c = scanfor2.nextInt();

        int d;
        for(int str = 1; str <= c; ++str) {
            System.out.println();

            for(d = str + 1; d <= c; ++d) {
                System.out.print(" ");
            }

            for(d = 1; d <= str; ++d) {
                System.out.print("*");
            }
        }

        Scanner scanfor3 = new Scanner(System.in);
        d = scanfor3.nextInt();

        for(int str = 1; str <= d; ++str) {
            System.out.println();

            int j;
            for(j = str + 1; j <= d; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= str; ++j) {
                System.out.print("* ");
            }
        }
//hgbjlk
    }
}
