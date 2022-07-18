import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();

        if (a > 0 && a < 31) {
            System.out.println("Januare");
        }

        System.out.println("februare");
        if (a > 31 && a < 59) {

            if (a > 59 && a < 90) {
                System.out.println("March");


            }
        }
        if (a > 90 && a < 120) {
            System.out.println("April");

            if (a > 120 && a < 151) {
                System.out.println("May");

                if (a > 151 && a < 181) {
                    System.out.println("Jule");

                    if (a > 181 && a < 212) {
                        System.out.println("June");

                        if (a > 212 && a < 243) {
                            System.out.println("August");

                            if (a > 243 && a < 274) {
                                System.out.println("September");

                                if (a > 274 && a < 305) {
                                    System.out.println("Octember");

                                    if (a > 305 && a < 335) {
                                        System.out.println("November");

                                        if (a > 335 && a < 366) {
                                            System.out.println("Decemer");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}