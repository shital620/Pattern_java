import java.util.Scanner;
public class solid_square {
    public static void main (String[] args)
    { int n;
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        System.out.println("Enter number");
        m=sc.nextInt();
        for(int i=0; i<=n; i++)
        {
              for(int j=0;j<= m;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    
}
/* solid Square pattern
**********
**********
**********
**********
**********
**********
********** */