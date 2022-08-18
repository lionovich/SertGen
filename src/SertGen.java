import java.util.Scanner;
import java.util.Random;

public class SertGen {
    public static void main(String[] args) {
        name();
        arrayMaker();
    }

    static int amount() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nВведите количество сертификатов \n");
        int output = input.nextInt();
        return output;
    }

    static String prefix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите префикс \n");
        String output = input.nextLine();
        return output;
    }

    static int generator() {
        Random rand = new Random();
        int int1 = rand.nextInt(999999);
        return int1;
    }

    static String arrayMaker() {
        String p = prefix();
        int a = amount();
        for (int i = 0; i <= a-1; i++) {
            int g = generator();
            System.out.println(p+g);
        }
        return null;
    }

    static void name() {
        System.out.println("\nSertGen by Lionovich \n");
    }
}