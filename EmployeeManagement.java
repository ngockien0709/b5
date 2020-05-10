package b5.b5;

import java.util.Scanner;

public class EmployeeManagement {
    private int n;
    private Employee[] employees;

    public EmployeeManagement(int n) {
        this.n = n;
        this.employees = new Employee[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao thong tin cho" + n + "nhan vien");

        for (int i = 0; i < n; i++) {
            System.out.println("nhan vien thu " + (i + 1) + ": ");

            System.out.println("nhap vao so 0 neu ban muon nhap thong tin cho nv parttime,hoac nhap 1 vao cho nhan vien fulltime");

            int employeeType = scanner.nextInt();

            if (employeeType == 1) {
                System.out.println("nhap thong tin cho nhan vien fulltime");

            } else {
                System.out.println("nhap thong tin cho nhan vien parttime");
            }


            System.out.println("\t-ten: ");
            String name = scanner.nextLine();
            scanner.nextLine();

            System.out.println("\t- tuoi: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\t CMNN_Number: ");
            String ID = scanner.nextLine();
//           scanner.nextLine();


            if (employeeType == 1) {
                System.out.println("\t - so ngay lam viec");
                int workingday = scanner.nextInt();

                scanner.nextLine();


                System.out.println("\t luong theo ngay: ");
                long salary = scanner.nextLong();

                scanner.nextLine();


                employees[i] = new EmployeeFulltime(name, age, ID, workingday, salary);
            } else {
                System.out.println("\t - so ngay lam viec");
                int workingshift = scanner.nextInt();

                scanner.nextLine();

                System.out.println("\t luong theo ngay: ");
                long salary = scanner.nextLong();

                scanner.nextLine();

                employees[i] = new EmployeeParttime(name, age, ID, workingshift, salary);

            }

        }
        scanner.close();
    }


    public void print() {
        System.out.println("co : " + n + " nhan vien ");
        for (int i = 0; i < n; i++) {
            System.out.println("nhan vien thu: " + (i + 1) + employees[i].toString());
        }
    }

    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement(1);
        employeeManagement.print();
    }


}
