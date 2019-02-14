import java.util.Scanner;

public class test_input1 {
    public static void main(String[] args) {
        System.out.println("Введите цифру 1 в консоль");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==1){
            System.out.println("Вы ввели число 1");
        }
    }
}
