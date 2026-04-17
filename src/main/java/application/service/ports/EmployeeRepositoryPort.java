package application.service.ports;

import application.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepositoryPort {


    Employee saveEmployee(Employee employee);
    Employee updateEmployee(int id, Employee employee);
    Optional<Employee> findEmployeeById(int id);
    List<Employee> findAllEmployees();
    void deleteEmployeeById(int id);
}
