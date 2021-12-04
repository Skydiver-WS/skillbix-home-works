public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Company company1 = new Company();
        generateEmployee(company);
        generateEmployee(company1);
        company.hireAll(company1);
        System.out.println("До увольнения " + company.getListEmployee().size());
        listLowSalary(company, 15);
        listTopSalary(company,10);
        company.fire(154);
        System.out.println("После увольнения " + company.getListEmployee().size());
        listLowSalary(company, 15);
        listTopSalary(company,10);
        company.hireAll(company1);
        System.out.println("Объединение " + company.getListEmployee().size());
        listLowSalary(company, 15);
        listTopSalary(company,10);
    }

    public static void generateEmployee(Company company){
        for (int operator = 0; operator < 180; operator++) {
            double randomSalaryOperator = 10000 + (Math.random() * (30000 - 10000));
            company.hire(new Operator(randomSalaryOperator));
        }
        for (int manager = 0; manager < 80; manager++) {
            double randomSalaryManager = 10000 + (Math.random() * (50000 - 10000));
            company.hire(new Manager(company, randomSalaryManager));
        }
        for (int topManager = 0; topManager < 10; topManager++) {
            double randomSalaryTopManager = 100000 + (Math.random() * (500000 - 100000));
            company.hire(new TopManager(company, randomSalaryTopManager));
        }
    }

    public static void listTopSalary(Company company, int listSalary){
        for (int i = 0; i < company.getTopSalaryStaff(listSalary).size(); i++) {
            System.out.println(company.getTopSalaryStaff(listSalary).get(i) + " " + company.getTopSalaryStaff(listSalary).get(i).getMonthSalary());
        }
        System.out.println("\n");
    }
    public static void listLowSalary(Company company, int listSalary){
        for (int i = 0; i < company.getLowestSalaryStaff(listSalary).size(); i++) {
            System.out.println(company.getLowestSalaryStaff(listSalary).get(i) + " " + company.getLowestSalaryStaff(listSalary).get(i).getMonthSalary());
        }
        System.out.println("\n");
    }
}