import java.util.Scanner;
public class ExceptionHandling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char conformation;
        do {
            System.out.println("1.Arithmetic operation");
            System.out.println("2.Array access");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.println("Enter the number to be divided:");
                        int num1 = sc.nextInt();
                        System.out.println("Enter the divisor:");
                        int num2 = sc.nextInt();
                        int result = num1 / num2;
                        System.out.println("The Answer is " + result);
                    } 
                    catch (ArithmeticException e) {
                        System.out.println("Caught an exception " + e.getMessage());
                    }
                    break;
                	case 2:
                    try {
                        int array[] = {2,5,8,9};
                        System.out.println("Enter The Index You Want To Acess:");
                        int index=sc.nextInt();
                        System.out.println("The Number In The Index " + index + " Is " + array[index]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Caught an exception " + e.getMessage());
                    }
                    break;
                	default:
                    System.out.println("Invalid ch");
                    break;
            }
            System.out.println("Do you want to continue: type Y or N ");
            conformation = sc.next().charAt(0);
        } while (conformation =='y'|| conformation =='Y');
        sc.close();
    }
}