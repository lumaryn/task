import java.math.BigInteger;
import java.util.Scanner;
import java.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные в бинарном формате");
        String b1 = sc.next();
        System.out.println("Вы ввели:"+b1);
        int b2 = Integer.parseInt(b1,2);
        System.out.println("Число в десятичном формате:"+b2);

        }


}