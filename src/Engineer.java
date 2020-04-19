public class Engineer extends Employee {
        private double engineerSignOn;
        final private double ENGINEER_SALARY_ADJUSTMENT = 1.5;
        final private double ENGINEER_SIGN_ON_UNDER_FIVE = 5000;
        final private double ENGINEER_SIGN_ON_OVER_FIVE = 10000;


        public Engineer(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
            super(name,baseSalary, yearsOfExperience, yearsAtCompany);
            salaryAdjustment();
            vacationAdjustment();
        }

        private void salaryAdjustment() {
            baseSalary *= ENGINEER_SALARY_ADJUSTMENT;
            if(super.getEmployeeYearsExperience() >= 5){
                engineerSignOn += ENGINEER_SIGN_ON_OVER_FIVE;
                return;
            }
            else if(super.getEmployeeYearsExperience() <5){
                engineerSignOn += ENGINEER_SIGN_ON_UNDER_FIVE;
            }
        }

        private void vacationAdjustment() {
            if(super.getEmployeeYearsAtCompany() >= 2.0){
                empVacation += 2.0;
                return;
            }
            else if(super.getEmployeeYearsAtCompany() >=1 && super.getEmployeeYearsAtCompany()<2.0){
                empVacation += 1.0;
                return;
            }
            else {empVacation = 0;}
        }
        public String toString(){
            return super.toString() + "\nSign on Bonus: " + engineerSignOn;
        }
        public String motto(){
            return "To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, " +
                    "the glass is twice as big as it needs to be.";
        }

}

