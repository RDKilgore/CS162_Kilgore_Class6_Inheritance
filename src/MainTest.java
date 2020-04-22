/**
 * This program stores and returns employee data for company X.
 * @author RDKilgore
 * @version 1.0
 */
import java.awt.*;
import java.util.ArrayList;
public class MainTest {
    public static void main(String[] args){
        double baseSalary = 34000;
        ArrayList<Employee> companyX = new ArrayList<Employee>();
        companyX.add(new Employee());
        companyX.add(new ProductManager("Rian",baseSalary, 13, 4));
        companyX.add(new Engineer("Chris",baseSalary, 5, 2));
        companyX.add(new TechnicalWriter("Victoria",baseSalary, 5, 5));
        System.out.println(companyX);
//        Employee p = new Employee();
//        ProductManager p1 = new ProductManager("Rian", baseSalary, 12, 5);
//        Engineer e1 = new Engineer("Daniel", baseSalary, 1, 2);
//        TechnicalWriter t1 = new TechnicalWriter("Jon", baseSalary, 1, 2);
//        System.out.println(p);
//        System.out.println(p1);
//        System.out.println(e1);
//        System.out.println(t1);
    }
}
