package application.repository;

import application.domain.Employee;
import application.domain.enums.EmployeeType;
import application.domain.enums.PersonState;
import application.service.ports.EmployeeRepositoryPort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository implements EmployeeRepositoryPort {

    private List<Employee> employees = new ArrayList<>(
            Arrays.asList(
                    new Employee(1, "Carlos", "Lopez", "carlos@mail.com", "123", PersonState.ACTIVE, 2000000, EmployeeType.RECEPTIONIST),
                    new Employee(2, "Laura", "Gomez", "laura@mail.com", "123", PersonState.ACTIVE, 1800000, EmployeeType. CLEANER),
                    new Employee(3, "Pedro", "Martinez", "pedro@mail.com", "123", PersonState.INACTIVE, 2200000, EmployeeType.SECURITY)
            )
    );

    @Override
    public Employee saveEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getId() == id) {

                employee.setId(id); // mantener el mismo ID
                employees.set(i, employee);

                return employee;
            }
        }

        throw new RuntimeException("Employee with id " + id + " not found");
    }

    @Override
    public Optional<Employee> findEmployeeById(int id) {

        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst();
    }

    @Override
    public List<Employee> findAllEmployees() {
        return new ArrayList<>(employees);
    }

    @Override
    public void deleteEmployeeById(int id) {

        boolean removed = employees.removeIf(e -> e.getId() == id);

        if (!removed) {
            throw new RuntimeException("Employee with id " + id + " not found");
        }
    }




}
