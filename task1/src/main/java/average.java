import java.util.Scanner;


public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        if (sum >= 3 && sum % 3 == 0) {
            int avr = (a + b + c) / 3;
            System.out.println("average=" + avr);
            int half_avr = avr / 2;
            if (half_avr > 3 && avr % 2 == 0) {
                System.out.println("Программа выполнена корректно");
            }
        }
    }
}
