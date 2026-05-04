package designPatterns.proxyDesignPattern;

public interface EmployeeDAO {
    void createEmployee(Employee employee) throws Exception;
    void deleteEmployee(int employeeId) throws Exception;
    void getEmployeeInfo(int employeeId) throws Exception;
}
