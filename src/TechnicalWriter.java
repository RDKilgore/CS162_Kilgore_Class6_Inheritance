public class TechnicalWriter extends Employee {
    private double technicalWriterSalary;
    private double technicalWriterSalaryAdjustment = 1.0 ;

    public TechnicalWriter(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name,baseSalary, yearsOfExperience, yearsAtCompany);
        salaryAdjustment();
    }

    private void salaryAdjustment() {
        baseSalary *= technicalWriterSalaryAdjustment;
    }

    public String motto(){
        return "You can always edit a bad page. You can’t edit a blank page.";
    }
    //String employeeName, double initBaseSalary, int initYearsOfExperience, int initYearsAtCompany
}
