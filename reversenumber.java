import java.util.Scanner;
public class reversenumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        int reverseNo = 0;
        
        while(n > 0){
            int remainder = n % 10;
            reverseNo = reverseNo * 10 + remainder;
            n = n / 10;
        }
        System.out.println("reverse digit:" + reverseNo);
    }
}
