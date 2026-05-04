package designPatterns.proxyDesignPattern;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public void createEmployee(Employee employee) throws Exception {
        System.out.println("Employee created");
    }

    @Override
    public void deleteEmployee(int employeeId) throws Exception {
        System.out.println("Employee deleted");
    }

    @Override
    public void getEmployeeInfo(int employeeId) throws Exception {
        System.out.println("Employee info fetched");
    }
}
