package Java.ExceptioHandling;

public class SalaryCalculation {
    int monthlySalary;
    int averageIncomeSalary;
    //constructor
    public SalaryCalculation(int monthlySalary,int averageIncomeSalary){
        this.monthlySalary=monthlySalary;
        this.averageIncomeSalary=averageIncomeSalary;
    }
    public void calculateAnnualSalary(){
        int result;
        try{
             result = (monthlySalary * 12)/averageIncomeSalary;

        }
        catch (ArithmeticException e){
            System.out.println("Dividing by zero detected:");
            result = 10000;
        }
        System.out.println("Annual salary ratio: "+ result);
    }

    public static void main(String[] args) {
        SalaryCalculation s = new SalaryCalculation(10000,10);
        s.calculateAnnualSalary();
        SalaryCalculation s1 = new SalaryCalculation(10000,0);
        s1.calculateAnnualSalary();
    }
}
