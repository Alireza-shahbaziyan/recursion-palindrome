
import java.util.Scanner;
public class Main
{
    static boolean checkPalindrome(String str, int s, int e) 
    { 
        if (s == e)    
            return true;  
        if ((str.charAt(s)) != (str.charAt(e))) 
            return false;
            
        if (s < e + 1) 
            return checkPalindrome(str, s + 1, e - 1);   
        
        return true; 
    }   
    static boolean isPalindrome(String str) 
    { 
        int n = str.length();   
    // If string is empty,then it is palindrome 
        if (n == 0) 
            return true;   
        return checkPalindrome(str, 0, n - 1); 
    }   
    
    public static void main(String args[]) 
    { 
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = sc.nextLine();   //Input the string
        //Check whether palindrome or not
        if (isPalindrome(str)) 
            System.out.println("true"); 
        else
            System.out.println("false"); 
    }   
}
// Developer => Ali R