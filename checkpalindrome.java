import java.util.Scanner;
public class checkpalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        int originalNo = n;
        int reverseNo = 0;

        while(n > 0){
            int remainder = n % 10;
            reverseNo = reverseNo * 10 + remainder;
            n = n / 10;
        }
        if(originalNo == reverseNo){
            System.out.println("The number is palindrome.");
        }else{
            System.out.println("The number is not palindrome.");
        }
    }
}
