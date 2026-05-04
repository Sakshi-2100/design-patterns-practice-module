package designPatterns.proxyDesignPattern;

public class Client {
    public static void main(String[] args) {
        try{
            EmployeeDAO employeeDAOProxy = new EmployeeDAOProxy("ADMIN");
            employeeDAOProxy.getEmployeeInfo(1);
            employeeDAOProxy.createEmployee(new Employee());
            System.out.println("Operation Successful");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
