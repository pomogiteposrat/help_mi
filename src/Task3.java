import java.util.Scanner;

public class Task2 {
public static void main(String[]args) {
    Scanner scan1 = new Scanner(System.in);
    int kolvoster = scan1.nextInt();
    for (int i = 1; i <= kolvoster; ) {

        for (int j = 1; j <= i; j++) ;
        System.out.println("*");
    }
}


