import java.util.*;

public class look_L {

    public static void main (String[] args)
    { int n;
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
              for(int j=1;j<= n;j++)
            {
                if (j==1 || i==n)
                 {
                System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
            }
            System.out.print("\n");
        }
    }
    
}
 /* L LOOK PRINT
*
*
*
*
******
*/