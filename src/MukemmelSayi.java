import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int value, total = 0;
        Scanner data = new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz: ");
            value = data.nextInt();
            for (int i = 1; i < value; i++) {
                if (value % i == 0) {
                    total += i;
                }
            }
            if (value == total) {
                System.out.println(value + " Mükemmel sayıdır.");
            } else {
                System.out.println(value + " Mükemmle sayı değildir.");
            }
            break;
        } while (value > 0);
    }
}
