import java.util.Scanner;
public class palindrome
{
       public static boolean isPalRec(String str, int s, int e)
    {
        if (s == e)
            return true;
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);
        return true;
    }
    
    public static boolean isPalindrome(String str)
    {
        int n = str.length();
        if (n == 0)
            return true; 
        return isPalRec(str, 0, n - 1);
    }
    
    public static void main(String args[])
    {
        System.out.println("Enter the String:");
        try(Scanner scan = new Scanner(System.in)){
        String str = scan.nextLine();    
        
        if(isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
        }
    }
}