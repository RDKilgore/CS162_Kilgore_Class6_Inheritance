public class TechnicalWriter extends Employee {
    private double technicalWriterSalary;
    private double TECHNICAL_WRITER_SALARY_ADJUSTMENT= 1.0 ;

    public TechnicalWriter(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name,baseSalary, yearsOfExperience, yearsAtCompany);
        salaryAdjustment();
        vacationAdjustment();
    }

    private void salaryAdjustment() {
        baseSalary *= TECHNICAL_WRITER_SALARY_ADJUSTMENT;

    }
    private void vacationAdjustment() {
        if(super.getEmployeeYearsAtCompany() >= 2.0){
            empVacation += 1;
            return;
        }
        else if(super.getEmployeeYearsAtCompany() >=1 && super.getEmployeeYearsAtCompany() < 2){
            empVacation =empVacation;
            return;
        }
        else {empVacation = 0;}
    }
    public String motto(){
        return "You can always edit a bad page. You can’t edit a blank page.";
    }
    //String employeeName, double initBaseSalary, int initYearsOfExperience, int initYearsAtCompany
}
