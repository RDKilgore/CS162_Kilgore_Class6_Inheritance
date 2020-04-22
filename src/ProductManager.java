import java.util.ArrayList;

public class ProductManager extends Employee {
    private double productManagerSalary;
    private double stockOptionBonus = 100;
    private double productManagerSalaryAdjustment = 2.0 ;

    public ProductManager(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name,baseSalary, yearsOfExperience, yearsAtCompany);
        salaryAdjustment();
        vacationAdjustment();
        stockOptionAdjustment();
    }

    private void salaryAdjustment() {
        baseSalary *= productManagerSalaryAdjustment;
    }
    private void stockOptionAdjustment(){
        stockOptionBonus *= super.getEmployeeYearsAtCompany();
    }
    private void vacationAdjustment(){
        if(super.getEmployeeYearsAtCompany() >= 1.0 && super.getEmployeeYearsAtCompany() < 2){
            empVacation += 2.0;
            return;
        }
        else if(super.getEmployeeYearsAtCompany() >=2){
            empVacation += 3.0;
            return;}
        else {empVacation = 0;}
    }
    public String toString(){
        return super.toString() + "\nStock option Bonus: " + stockOptionBonus;
    }
    public String motto(){
        return "There is nothing so useless as doing efficiently that which should not be done at all";
    }
}
