import java.util.*;
public class functionToAddTwoNumbers {
    public static void add(int a, int b){
        int sum = a+b;
        System.out.println("The sum of the two numbers is: "+sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        add(a,b);
    }
}