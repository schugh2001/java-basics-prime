import java.util.*;
public class isprimeandrange{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isprime(n));
        primeinrange(n);
    }
    public static boolean isprime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if((n%i)==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void primeinrange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isprime(i)){
                System.out.print(i +"\t");
            }
            
        }
        System.out.print("BOBYEEEEEEEE              BALLLLABHGARHHHHHHHHHHHHHHHHHHHHHHHHH");
    }
}
