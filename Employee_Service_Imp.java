package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Employee_DAO;
import Model.Employee;

@Service
@Transactional
public class Employee_Service_Imp implements Employee_Service {
 
	@Autowired
	private Employee_DAO employeedao;
	
	@Override
	public boolean saveEmployee(Employee employee) {
		return employeedao.saveEmployee(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		return Employeedao.getEmployees();
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		return employeedao.deleteEmployee(employee);
	}

	@Override
	public List<Employee> getEmployeeByID(Employee employee) {
		return Employeedao.getEmployeeByID(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return Employeedao.updateEmployee(employee);
	}

}
