import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int i;
        for(i=0; i<3; i++){
            System.out.println("Введите число");
            a[i]= sc.nextInt();
        }
        for(i=0; i<3; i++)
            System.out.println(a[i]*2);
    }
}
