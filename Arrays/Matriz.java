package Arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("ERROR");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) {
                    System.out.print("x");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
