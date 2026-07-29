import java.util.Scanner;
class Employee {
    String empName, address, mailId, mobileNo;
    int empId;
    double basicPay;

    Employee(String name, int id, String address, String mail, String mobile, double bp) {
        this.empName = name;
        this.empId = id;
        this.address = address;
        this.mailId = mail;
        this.mobileNo = mobile;
        this.basicPay = bp;
    } }

class Programmer extends Employee {

    Programmer(String name, int id, String address, String mail, String mobile, double bp) {
        super(name, id, address, mail, mobile, bp);
    }

    void calculateSalary() {
        double da = basicPay * 97 / 100;
        double hra = basicPay * 10 / 100;
        double pf = basicPay * 12 / 100;
        double staff = basicPay * 1 / 100;
        double gross = basicPay + da + hra;
        double net = gross - pf - staff;        
        System.out.println("DA            : " + da);
        System.out.println("HRA           : " + hra);
        System.out.println("PF            : " + pf);
        System.out.println("Staff Club    : " + staff);
        System.out.println("Gross Salary  : " + gross);
        System.out.println("Net Salary    : " + net);
    }
}

class AssistantProfessor extends Employee {

    AssistantProfessor(String name, int id, String address, String mail, String mobile, double bp) {
        super(name, id, address, mail, mobile, bp);
    }

    void calculateSalary() {
        double da = basicPay * 110 / 100;
        double hra = basicPay * 20 / 100;
        double pf = basicPay * 12 / 100;
        double staff = basicPay * 5 / 100;
        double gross = basicPay + da + hra;
        double net = gross - pf - staff;  
        System.out.println("DA            : " + da);
        System.out.println("HRA           : " + hra);
        System.out.println("PF            : " + pf);
        System.out.println("Staff Club    : " + staff);
        System.out.println("Gross Salary  : " + gross);
        System.out.println("Net Salary    : " + net);
    }
}

class AssociateProfessor extends Employee {

    AssociateProfessor(String name, int id, String address, String mail, String mobile, double bp) {
        super(name, id, address, mail, mobile, bp);
    }

    void calculateSalary() {
        double da = basicPay * 130 / 100;
        double hra = basicPay * 30 / 100;
        double pf = basicPay * 12 / 100;
        double staff = basicPay * 10 / 100;
        double gross = basicPay + da + hra;
        double net = gross - pf - staff;
        System.out.println("DA            : " + da);
        System.out.println("HRA           : " + hra);
        System.out.println("PF            : " + pf);
        System.out.println("Staff Club    : " + staff);
        System.out.println("Gross Salary  : " + gross);
        System.out.println("Net Salary    : " + net);
    }
}

class Professor extends Employee {

    Professor(String name, int id, String address, String mail, String mobile, double bp) {
        super(name, id, address, mail, mobile, bp);
    }

    void calculateSalary() {
        double da = basicPay * 140 / 100;
        double hra = basicPay * 40 / 100;
        double pf = basicPay * 12 / 100;
        double staff = basicPay * 15 / 100;
        double gross = basicPay + da + hra;
        double net = gross - pf - staff;      
        System.out.println("DA            : " + da);
        System.out.println("HRA           : " + hra);
        System.out.println("PF            : " + pf);
        System.out.println("Staff Club    : " + staff);
        System.out.println("Gross Salary  : " + gross);
        System.out.println("Net Salary    : " + net);
    }}
public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Mail ID: ");
        String mail = sc.nextLine();
        System.out.print("Enter Mobile No: ");
        String mobile = sc.nextLine();
        System.out.print("Enter Designation: ");
        String des = sc.nextLine();
        System.out.print("Enter Basic Pay: ");
        double bp = sc.nextDouble();
        if (des.equalsIgnoreCase("Programmer")) {
            Programmer p = new Programmer(name, id, address, mail, mobile, bp);
            p.calculateSalary();
        } else if (des.equalsIgnoreCase("AssistantProfessor")) {
            AssistantProfessor ap = new AssistantProfessor(name, id, address, mail, mobile, bp);
            ap.calculateSalary();
        } else if (des.equalsIgnoreCase("AssociateProfessor")) {
            AssociateProfessor asp = new AssociateProfessor(name, id, address, mail, mobile, bp);
            asp.calculateSalary();
        } else if (des.equalsIgnoreCase("Professor")) {
            Professor pr = new Professor(name, id, address, mail, mobile, bp);
            pr.calculateSalary();
        } else {
            System.out.println("Invalid Designation!");
        }

        sc.close();
    }
}

