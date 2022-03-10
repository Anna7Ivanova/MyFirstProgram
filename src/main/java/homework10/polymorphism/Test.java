package homework10.polymorphism;

public class Test {
    public static void main(String[] args) {
        CompanyET et1= new CompanyET("Kokiche","20.03.2015","KPI2Y65432","Kiril", 1255.0,3550.0);
        System.out.println(et1.getOwnerName());
        System.out.println(et1.getName());
        System.out.println(et1.getDateOfCreation());
        System.out.println(et1.getBulstat());
        System.out.println(et1.getInitialCapital());
        System.out.println(et1.getCurrentCapital());

        et1.calculateProfit();



    }
}
