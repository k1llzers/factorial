import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        while (num<0){
            System.out.println("Enter number: ");
            num = sc.nextInt();
        }
        for (int i = 1; i <= factorial(num); i++) {
            System.out.print(i + " ");
        }
    }

    public static int factorial(int num){
        if(num == 1 || num == 0) return 1;
        else return num*(factorial(num-1));
    }
}