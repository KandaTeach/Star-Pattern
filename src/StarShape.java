package src;

public class StarShape {
    public static void main(String[] args) {
        // upper corner
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= 13 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // middle corner
        for (int i = 11; i > 0; i -= 2) {
            if (i != 5) {
                for (int j = 0; j <= 13 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i * 2 - 2; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int j = 0; j <= 6; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= 12; k++) {
                    System.out.print("*");
                }
                System.out.println("");

                break;
            }
        }
        // bottom corner
        int a, b, c, d;
        for (int i = 8; i < 11; i++) {
            for (int j = 0; j <= 13 - i; j++) {
                System.out.print(" ");
            }
            a = i == 8 ? 2 : i == 9 ? 0 : i == 10 ? 1 : null;
            b = i == 8 ? 5 : i == 9 ? 3 : i == 10 ? 1 : null;
            c = i == 8 ? 0 : i == 9 ? 8 : i == 10 ? 16 : null;
            d = i == 8 ? 4 : i == 9 ? 12 : i == 10 ? 17 : null;
            for (int k = 0; k <= i * 2 - a; k++) {
                if (k == b) {
                    for (int l = 0; l < k + c; l++) {
                        System.out.print(" ");
                    }
                    k += d;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
