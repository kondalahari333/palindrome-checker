//given nuber is palindrome or not
import java.util.*;
public class palindrome {
    public static void main(String args[]){
        int original=0,reversed=0,remainder;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a number:");
            int n=sc.nextInt();
            original=n;
            while(n!=0){
                remainder=n%10;
                reversed=reversed*10+remainder;
                n=n/10;
            }
        }
        if(original==reversed){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
