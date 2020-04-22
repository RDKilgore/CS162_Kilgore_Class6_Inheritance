/**
 * Employee.java - Employee Benefits Management
 * @author Rian Kilgore
 * @version 2
 */
public class Employee {
    private String name = null;
    private String motto ;
    protected double baseSalary;
    protected double empVacation, baseVacation = 1.0;
    private int yearsOfExperience;
    private int yearsAtCompany;

    /**
     * Parameterless constructor
     */
    public Employee(){
        this("default", 34000, 0, 0);
        //TODO use default values
    }

    /**
     * Parameterless constructor
     *@param TODO A variable of type TODO
     *@param TODO A variable of type TODO
     *@param TODO A variable of type TODO
     *@param TODO A variable of type TODO
     */
    public Employee(String employeeName, double initBaseSalary, int initYearsOfExperience, int initYearsAtCompany){
        this.name = employeeName;
        this.baseSalary = initBaseSalary;
        this.yearsOfExperience = initYearsOfExperience;
        yearsAtCompany = initYearsAtCompany;
        this.empVacation = baseVacation;
        //TODO
    }

    //TODO Add needed getters and setters

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public void setEmployeeName(){ this.name = name;}
    public String getEmployeeName (){ return this.name;}
    public void setBaseSalary(){ baseSalary = baseSalary;}
    public double getBaseSalary(){ return baseSalary;}
    public void setAllottedVacation(){ empVacation = baseVacation;}
    public double getAllottedVacation(){ return empVacation;}
    public void setEmployeeYearsAtCompany(){ yearsAtCompany = yearsAtCompany;}
    public double getEmployeeYearsAtCompany(){ return yearsAtCompany;}
    public void setEmployeeExperience(){ yearsOfExperience = yearsOfExperience;}
    public double getEmployeeYearsExperience(){ return yearsOfExperience;}


    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto() {
        return "'We value our employees'";
    }
    public String toString(){ return "Employee Name: " + name + "\n" + "Employee Salary: " + baseSalary + ". Allotted Vacation in weeks: " + empVacation + "in weeks." +
            "\n" + "Motto: " + motto() ;}
}