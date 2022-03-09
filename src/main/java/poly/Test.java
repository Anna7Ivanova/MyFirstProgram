package poly;

public class Test {
    public static void main(String[] args) {
        DeveloperEmp dev1 = new DeveloperEmp("Devcho", "01.01.2022", 4324.0, "IT","Java");
        System.out.println(dev1.getDepartment());
        System.out.println(dev1.getName());
        System.out.println(dev1.getSalary(Roles.Accountant));
        System.out.println(dev1.getStartDate());
        System.out.println(dev1.getProgramingLanguage());

        //Employee employee = new Employee("ddfd", "fff", "dddd", "jssjsj");//we cannot create object from abstract class
    }
}
