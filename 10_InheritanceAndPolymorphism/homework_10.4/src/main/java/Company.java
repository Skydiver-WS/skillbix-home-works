import java.util.ArrayList;
import java.util.HashMap;

public class Company {
    protected static double income;
    private double incomeCompany;
    private final HashMap<Employee, Double> listEmployee = new HashMap<>();

    public void hire(Employee employee) {
        if (employee instanceof TopManager) {
            income = incomeCompany;
        }
        if (employee instanceof Manager) {
            incomeCompany += income;
        }
        listEmployee.put(employee, employee.getMonthSalary());
        income = 0;
    }

    public void hireAll(Company company){
        listEmployee.putAll(company.getListEmployee());
        company.fire(company.listEmployee.size());
    }

    public void fire(Integer positionCompany){
        if (listEmployee.size() >= positionCompany) {
            ArrayList<Employee> arrayList = new ArrayList<>(listEmployee.keySet());
            for (int numberKey = 0; numberKey < positionCompany; numberKey++) {
                listEmployee.remove(arrayList.get(numberKey));
            }
        }
    }


    public HashMap<Employee, Double> getListEmployee() {
        return listEmployee;
    }

    public double getIncomeCompany() {
        return incomeCompany;
    }
}