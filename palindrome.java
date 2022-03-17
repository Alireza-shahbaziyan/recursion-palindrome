import java.util.Scanner;
public class Main{

    static void palindrome(){
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter a number : ");
        int a = input.nextInt();
        int r,sum=0,c; 
        c=a;    
        while(a>0){    
            r=a%10;  //getting remainder  
            sum=(sum*10)+r;    
            a=a/10;   
        }    
        System.out.println( sum == c);
    }
    public static void main(String[] args) {
        palindrome();
    }
    
}
// Developer => Ali R