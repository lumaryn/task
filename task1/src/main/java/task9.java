import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][4];
        int i;
        int j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("Введите число");
                a[i][j] = sc.nextInt();
            }
        }
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 4; j++)
                    System.out.print(a[i][j] * 3+", ");
            }
        }
    }
