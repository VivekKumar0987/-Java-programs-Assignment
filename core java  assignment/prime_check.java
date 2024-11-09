import java.util.Scanner;

public class prime_check
{
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;


        return true;
    }

    public static void main(String args[])
    {
        int a[]=new int[10], i,j,c=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 10 numbers");
        for(i=0; i<10; i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\nPrime Numbers");
        for(i=0; i<10; i++)
        {
            c=0;
            for(j=1; j<=a[i]; j++)
            {
                if(a[i]%j==0)
                {
                    c++;
                }
            }

            if(c==2)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        
        System.out.println("Ente the no you wannna check: ");
        int t=sc.nextInt(); 
        System.out.println(t+" Is a prime no?? :: "+isPrime(t));

    }
}