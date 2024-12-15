package JAVA101;
import java.util.Scanner;
public class ucuncu_ornek {
    public static void main(String[] args) {
        double kenar1, kenar2, kenar3, u , alan;
        Scanner input = new Scanner(System.in);
        System.out.println("birinci kenar olcusunu girin");
        kenar1 = input.nextInt();
        System.out.println("ikinci kenar uzunluğunu girin");
        kenar2 = input.nextInt();
        System.out.println("ucuncu kenarin olcusunu girin");
        kenar3 = input.nextInt();
        u = (kenar1 + kenar2 + kenar3)/2;
        alan = Math.sqrt( u*(u - kenar1)*(u - kenar2)*(u - kenar3));
        System.out.println("ucgenin alani: "+ alan);
    }
}