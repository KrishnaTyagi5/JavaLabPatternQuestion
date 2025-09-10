public class RigthHollowRhombus {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int l = 1; l < i; l++) {
                System.out.print(" ");
            }
            for (int j = i; j <= i; j++) {
                System.out.print("*");
            }
            if (i == 2 || i == 3 || i == 4) {
                for (int m = 1; m <= 3; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
