public class OfficialE extends Employee{
    private double basicSalary;
    private double salaryCoefficient;

    public OfficialE(String fullName, String address, int age, double basicSalary, double salaryCoefficient) {
        super(fullName, address, age);
        this.basicSalary = basicSalary;
        this.salaryCoefficient = salaryCoefficient;
        calcSalary();
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    @Override
    public String toString() {
        return "OfficialE{" +
                "fullName=" + this.getFullName() +
                ", salary=" + this.getSalary() +
                '}';
    }

    @Override
    public void calcSalary() {
        this.setSalary(this.getBasicSalary()*this.getSalaryCoefficient());

    }
}
