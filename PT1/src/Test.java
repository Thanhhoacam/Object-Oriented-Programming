import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        menuCreate();


    }
    public static void menuCreate(){
        final Scanner input = new Scanner(System.in);
        while (true){

            System.out.println("Employees Management");
            System.out.println("What type of employee you want ?");
            System.out.println("1. Official employees" );
            System.out.println("2. Sale staff");
            System.out.println("3. Exit");
            System.out.println("Enter your choice : ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    ArrayList<OfficialE> officialES = new ArrayList<>();
                    menuOfficialE(officialES);
                    break;
                case 2:
                    ArrayList<SaleStaff> saleStaffs = new ArrayList<>();
                    menuStaff(saleStaffs);
                    break;
                case 3:
                    System.out.println("Exit successfully");
                    System.exit(0);
            }
        }
    }
    public static void menuOfficialE(ArrayList<OfficialE> officialES){
        final Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("1. Add employee");
            System.out.println("2. Display employee");
            System.out.println("3. check trung lap nhan vien");
            System.out.println("4. Back");
            System.out.println("Enter your choice: ");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:

                    inputOfficialE(officialES);
                    break;
                case 2:

                    outputOfficialE(officialES);
                    break;
                case 3:
                    checkOficial(officialES);
                case 4:
                    flag = false;
                    menuCreate();
            }
        }
    }
    public static void checkOficial(ArrayList<OfficialE> officialES){
        int check = 0;
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter index of employee you want");
        int index = Integer.parseInt(input.nextLine());
        for (int i=0; i<officialES.size();i++){

                if (officialES.get(index).getAddress().compareTo(officialES.get(i).getAddress())==0){
                    check++;

            }
        }
        System.out.println("Co " + check + "nhan vien trung voi nhan vien can tim");
    }
    public static void menuStaff(ArrayList<SaleStaff> staffs){
        final Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("1. Add staff");
            System.out.println("2. Display staff");
            System.out.println("3. check trung lap nhan vien");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:
                    inputStaff(staffs);
                    break;
                case 2:
                    outputStaff(staffs);
                    break;
                case 3:
                    checkStaff(staffs);
                    break;
                case 4:
                    flag = false;
                    menuCreate();
            }
        }
    }

    public static void checkStaff(ArrayList<SaleStaff> staffs){
        int check = 0;
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter index of staff you want");
        int index = Integer.parseInt(input.nextLine());
        for (int i=0; i<staffs.size();i++){

            if (staffs.get(index).getAddress().compareTo(staffs.get(i).getAddress())==0){
                check++;

            }
        }
        System.out.println("Co " + check + "nhan vien trung voi nhan vien can tim");
    }

    public static void inputOfficialE(ArrayList<OfficialE> officialES){
         final Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your address: ");
        String address = input.nextLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Enter your base salary: ");
        double basicSalary = Double.parseDouble(input.nextLine());
        System.out.println("Enter your salary coefficient: ");
        double salaryCoefficient = Double.parseDouble(input.nextLine());
        OfficialE officialE = new OfficialE(name, address, age, basicSalary, salaryCoefficient);
        officialES.add(officialE);
    }
    public static void outputOfficialE(ArrayList<OfficialE> officialES){
        for (int i=0;i < officialES.size();i++){
            System.out.println(officialES.get(i));
        }
    }
    public static void inputStaff(ArrayList<SaleStaff> saleStaffs){
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your address: ");
        String address = input.nextLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Enter your allowance: ");
        double allowance = Double.parseDouble(input.nextLine());
        System.out.println("Enter your salary commission: ");
        double commission = Double.parseDouble(input.nextLine());
        System.out.println("Enter your sales");
        double sales = Double.parseDouble(input.nextLine());
        SaleStaff saleStaff = new SaleStaff(name, address, age, allowance, sales, commission);
        saleStaffs.add(saleStaff);
    }
    public static void outputStaff(ArrayList<SaleStaff> saleStaff){
        for (int i=0;i < saleStaff.size();i++){
            System.out.println(saleStaff.get(i));
        }

}}
