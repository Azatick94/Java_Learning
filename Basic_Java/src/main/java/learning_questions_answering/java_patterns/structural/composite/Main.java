package learning_questions_answering.java_patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        // we want to build a hierarchical structure of departments in a company

        Department salesDepartment = new SalesDepartment(1, "Sales");
        Department financialDepartment = new FinancialDepartment(2, "Finance");

        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        System.out.println("HeadDepartment consists of:");
        headDepartment.printDepartmentName();
    }
}
