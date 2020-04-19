public class ProductManager extends Employee {
    private double productManagerSalary;
    private double productManagerSalaryAdjustment = 2.0 ;

    public ProductManager(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name,baseSalary, yearsOfExperience, yearsAtCompany);
        salaryAdjustment();
        vacationAdjustment();
    }

    private void salaryAdjustment() {
        baseSalary *= productManagerSalaryAdjustment;
    }
    private void vacationAdjustment() {
        if(super.getEmployeeYearsOfExperience() < 1){
            empVacation = 0;}
        if(super.getEmployeeYearsOfExperience() > 1){
            empVacation += 2;
        }
    }
//    public double getYearsOfExperience(){
//        return super.
//    }

    public String motto(){
        return "There is nothing so useless as doing efficiently that which should not be done at all";
    }
    //String employeeName, double initBaseSalary, int initYearsOfExperience, int initYearsAtCompany
}
