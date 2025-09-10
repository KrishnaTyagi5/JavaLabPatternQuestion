public class LeftHollowUpperTriangle {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for (int l = i; l >= 1; l--) {
                if (i == 3 || i == 4) {
                    System.out.print("*");
                    for (int k = 2; k < i; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    break;
                } 
                else {
                        System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
