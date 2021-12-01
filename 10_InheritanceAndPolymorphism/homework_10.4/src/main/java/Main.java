import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        for (int operator = 0; operator < 180; operator++) {
            double randomSalaryOperator = Double.parseDouble(String.format("%.2f", (10000 + (Math.random() * (30000 - 10000)))).replaceAll(",", "."));
            company.hire(new Operator(randomSalaryOperator));
        }
        for (int manager = 0; manager < 80; manager++) {
            double randomSalaryManager = Double.parseDouble(String.format("%.2f", (10000 + (Math.random() * (50000 - 10000)))).replaceAll(",", "."));
            company.hire(new Manager(randomSalaryManager));
        }
        for (int topManager = 0; topManager < 10; topManager++) {
            double randomSalaryTopManager = Double.parseDouble(String.format("%.2f", (100000 + (Math.random() * (500000 - 100000)))).replaceAll(",", "."));
            company.hire(new TopManager(randomSalaryTopManager));
        }
        System.out.println(company.getListEmployee() + "\n" + company.getListEmployee().size() + "\n" + company.getIncomeCompany());
        for (Employee e : company.getListEmployee().keySet()) {
            System.out.println(e + " " + company.getListEmployee().get(e));
        }

        Company company2 = new Company();
        for (int operator = 0; operator < 180; operator++) {
            double randomSalaryOperator = Double.parseDouble(String.format("%.2f", (10000 + (Math.random() * (30000 - 10000)))).replaceAll(",", "."));
            company2.hire(new Operator(randomSalaryOperator));
        }
        for (int manager = 0; manager < 80; manager++) {
            double randomSalaryManager = Double.parseDouble(String.format("%.2f", (10000 + (Math.random() * (50000 - 10000)))).replaceAll(",", "."));
            company2.hire(new Manager(randomSalaryManager));
        }
        for (int topManager = 0; topManager < 10; topManager++) {
            double randomSalaryTopManager = Double.parseDouble(String.format("%.2f", (100000 + (Math.random() * (500000 - 100000)))).replaceAll(",", "."));
            company2.hire(new TopManager(randomSalaryTopManager));
        }
        System.out.println(company2.getListEmployee() + "\n" + company2.getListEmployee().size() + "\n" + company2.getIncomeCompany());
        for (Employee e : company2.getListEmployee().keySet()) {
            System.out.println(e + " " + company2.getListEmployee().get(e));
        }
        company.hireAll(company2);
        System.out.println(company.getListEmployee().size());

    }
}