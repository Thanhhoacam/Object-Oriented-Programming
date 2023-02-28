public class SaleStaff extends Employee{
    private double allowance;
    private double sales;
    private double commission;

    public SaleStaff(String fullName, String address, int age, double allowance, double sales, double commission) {
        super(fullName, address, age);
        this.allowance = allowance;
        this.sales = sales;
        this.commission = commission;
        calcSalary();
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "SaleStaff{" +
                "fullName=" + this.getFullName() +
                ", salary=" + this.getSalary() +
                '}';
    }

    @Override
    public void calcSalary() {
        this.setSalary(this.getAllowance()*this.getSales()*this.getCommission());
        
    }
}
