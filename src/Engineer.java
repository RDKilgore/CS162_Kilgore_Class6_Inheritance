public class Engineer extends Employee {
        private double engineerSalary;
        private double engineerSalaryAdjustment = 1.5 ;

        public Engineer(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
            super(name,baseSalary, yearsOfExperience, yearsAtCompany);
            salaryAdjustment();
        }

        private void salaryAdjustment() {
            baseSalary *= engineerSalaryAdjustment;
        }

        public String motto(){
            return "To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, " +
                    "the glass is twice as big as it needs to be.";
        }
        //String employeeName, double initBaseSalary, int initYearsOfExperience, int initYearsAtCompany
    }

