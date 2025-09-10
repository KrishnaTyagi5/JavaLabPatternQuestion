public class DifferentSquare {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            if(i==2 ||i==4 || i==3)
            {
                System.out.print("*");
                if(i==2 || i==4){
                for(int j=1;j<=3;j++)
                {
                    if(j==2)
                    {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                }
                else{
                    for(int j=1;j<=3;j++)
                {
                    if(j==1 || j==3)
                    {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                }
                System.out.print("*");
            }
            else{
                for(int k=1;k<=5;k++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
