import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 5;
        while(i <= 15) {
            System.out.println(i);
            i++;
        }

        int x = 0;
        do {
            System.out.println(x + " ");
            x +=2;
        } while (x <= 100);

        int y = 100;
        do {
            System.out.println(y);
            y -= 5;
        } while (y >= -10);

        long z = 2L;
        do {
            System.out.println(z);
            z *= z;
        } while (z < 1000000);

        for (int j = 5; j <= 15; j++) {
            System.out.println(j + " ");
        }

        for (int k = 100; k >= -10; k -=5) {
            System.out.println(k);
        }

        for (int l = 1; l <= 100; l++) {
            System.out.println(l);
        }

        for (long m = 2L; m < 1000000; m *= m) {
            System.out.println(m);
        }

    }

}
