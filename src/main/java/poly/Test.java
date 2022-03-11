package poly;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        DeveloperEmp dev1 = new DeveloperEmp("Devcho", "01.01.2022", 4324.0, "IT","Java");
        System.out.println(dev1.getDepartment());
        System.out.println(dev1.getName());
        System.out.println(dev1.getSalary(Roles.Accountant));
        System.out.println(dev1.getStartDate());
        System.out.println(dev1.getProgramingLanguage());

        QualityAssuranceEmp qa1 = new QualityAssuranceEmp("Krisko", "01.01.01", 2345.0, "QA", true);
        dev1.fillInPresentSheets();
        qa1.fillInPresentSheets();

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(dev1);
        employees.add(qa1);
      //  System.out.println(QualityAssuranceEmp.list);

        dev1.setBonus();
        dev1.setBonus(666.0);
        qa1.setBonus();

        //Employee employee = new Employee("ddfd", "fff", "dddd", "jssjsj");//we cannot create object from abstract class
    }
}
