import java.util.Scanner;


public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input 3 numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float avr = (a + b + c) / 3;
        System.out.println("average=" + avr);
        float half_avr = avr / 2;
        int z;
        z = (int)half_avr;

        if (z > 3){
            System.out.println("Программа выполнена корректно");
            }
        }
    }

