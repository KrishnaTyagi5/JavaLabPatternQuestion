public class RigthHollowLowertriangle {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int l = 5; l >= i; l--) {
                if (i == 3 || i == 2) {
                    System.out.print("*");
                    for (int k = 4; k > i; k--) {
                        System.out.print(" ");
                    }
                    for (int m = i; m <= i; m++) {
                        System.out.print("*");
                    }
                    break;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
