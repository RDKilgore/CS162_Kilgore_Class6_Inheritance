public class MainTest {
    public static void main(String[] args){
        double baseSalary = 34000;
        Employee p = new Employee();
        ProductManager p1 = new ProductManager("Rian", baseSalary, 2, 1);
        Engineer e1 = new Engineer("Daniel", baseSalary, 1, 1);
        TechnicalWriter t1 = new TechnicalWriter("Jon", baseSalary, 1, 1);
        System.out.println(p);
        System.out.println(p1);
        System.out.println(e1);
        System.out.println(t1);
    }
}
