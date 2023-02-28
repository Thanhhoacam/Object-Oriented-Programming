package view;

import java.util.List;
import model.Company;
import model.Customer;

public class CompanyManagement extends MenuOOP<String>{
    static String[] menu = {"List all customer",
                            "Search customer",
                            "Add new customer",
                            "Customer statistical",
                            "Exit"};
    private Company com = new Company();
    
    public CompanyManagement() {
        super("Company Management System", menu);
    }
    
    @Override
    public void excute(int n) {
        switch (n) {
            case 1: com.display(com.getCusList()); break;
            case 2: searchCustomer(); break;
            case 3: addCustomer(); break;
            case 4: statisticalCustomer(); break;
            default: System.exit(0);
        }
    }
    
    private void searchCustomer() {
        String[] mSearch = {"Find by ID",
                            "Find by Name",
                            "Back"};
        Menu m = new Menu("Customer Searching", mSearch) {
            public void excute(int n) {
                List<Customer> result = null;
                switch (n) {
                    case 1:
                        String val = StdInput.inputNonBlankStr("Enter ID: ");
                        result = com.search(cus -> cus.getId().equals(val));
                        break;
                    case 2:
                        val = StdInput.inputName("Enter name: ");
                        result = com.search(cus -> cus.getName().contains(val));
                        break;
                    default: return;
                }
                Company.display(result);
            }
        };
        m.run();
    }

    private void addCustomer() {
        String id = StdInput.inputNonBlankStr("Enter ID: ");
        String name = StdInput.inputName("Enter name: ");
        String phone = StdInput.inputPattern("Enter phone: ", "\\d{10}");
        com.add(new Customer(id, name, phone));
        System.out.println("-> Added customer " + id + "<-");

    }

    
    
    public static void main(String[] args) {
        CompanyManagement cm = new CompanyManagement();
        cm.run();
    }
}
