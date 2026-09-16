import java.util.Scanner;
public class smallestdigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number:");
            int n = sc.nextInt();
            int smallest = 10;
        while(n > 0){
            int remainder = n % 10;
            if( remainder < smallest){
                smallest = remainder;
            }
            n = n / 10;
        }
        System.out.println("Smallest digit:" + smallest);
    }
}
