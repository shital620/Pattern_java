import java.util.*;

public class helf_pyramid2{

    public static void main (String[] args)
    { int n;
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
              for(int j=1;j<=i;j++)
            {
                
                System.out.print("*");
                
            }
            System.out.print("\n");
        }
    }
    
}

/*
 10
*
**
***
****
*****
******
*******
********
*********
**********
 */