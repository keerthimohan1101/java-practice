import java.util.Scanner;
public class lastdigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        
        int remainder = n % 10;
        
        System.out.println("last digit:" + remainder);
    }
}
