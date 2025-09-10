public class HollowSquare {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==2 || i==3 || i==4)
            {
                System.out.print("*");
                for(int k=1;k<=3;k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else{
                for(int j=1;j<=5;j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
