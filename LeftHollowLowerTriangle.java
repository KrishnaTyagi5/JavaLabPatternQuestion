public class LeftHollowLowerTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 3 || i == 4) {
                    System.out.print("*");
                    for (int k = 2; k < i; k++) {
                        System.out.print(" ");
                    }
                    for (int l = i; l <= i; l++) {
                        System.out.print("*");
                    }
                    break;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
