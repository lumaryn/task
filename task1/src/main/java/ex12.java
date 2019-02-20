import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "";
        System.out.println("input your text");
        st = sc.nextLine();
        System.out.println(st);

        int i=0;
        int j=0;
        char[] ar = st.toCharArray();
        char ar1[]=new char[ar.length];

        for(i=0; i<ar.length; i++){

        if (ar[i] != ' ') {
            ar1[j] = ar[i]; j++;}
        }
        String f = new String(ar1);
        System.out.println("result: "+f);
    }
}