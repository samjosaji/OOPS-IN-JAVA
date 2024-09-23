
import java.util.Scanner;

class Employeee {
    double salary, DA, HRA, salary1;

    Employeee(double salary, double DA, double HRA) {
        this.salary = salary;
        this.DA = DA;
        this.HRA = HRA;
    }

    void display() {
        System.out.println("........Employee.........");
    }

    void calcSalary() {
        salary1 = salary + salary * (DA / 100) + salary * (HRA / 100);
        System.out.println("Gross saalary of the Employee = " + salary1);
    }
}

class Engineer extends Employeee {
    Engineer(double salary, double DA, double HRA) {
        super(salary, DA, HRA);
    }

    void display() {
        super.display();
        super.calcSalary();
        System.out.println(".........Engineer.........");
    }

    void calcSalary() {
        System.out.println("Gross salary of the Engineer = " + salary1 * 2);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        double salary, DA, HRA;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the basic salary of the Employee: ");
        salary = sc.nextDouble();
        System.out.print("Enter DA% of Employee: ");
        DA = sc.nextDouble();
        System.out.print("Enter HRA% of Employee: ");
        HRA = sc.nextDouble();

        Engineer Eng = new Engineer(salary, DA, HRA);
        Eng.display();
        Eng.calcSalary();

        sc.close();
    }
}