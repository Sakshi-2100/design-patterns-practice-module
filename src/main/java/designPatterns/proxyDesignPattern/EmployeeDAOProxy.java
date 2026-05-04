package designPatterns.proxyDesignPattern;

public class EmployeeDAOProxy implements EmployeeDAO{
    String client;
    EmployeeDAO employeeDAO;

    public EmployeeDAOProxy(String client){
        this.client = client;
        employeeDAO = new EmployeeDAOImpl();
    }
    @Override
    public void createEmployee(Employee employee) throws Exception {
        if(client.equals("ADMIN")){
            employeeDAO.createEmployee(employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void deleteEmployee(int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            employeeDAO.deleteEmployee(employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void getEmployeeInfo(int employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("MANAGER")){
            employeeDAO.getEmployeeInfo(employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }
}
