package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employee_id;
	private String employee_fname;
        private String employee_lname;
	private String employee_address;
        private String employee_dob;
	private String employee_city;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_fname() {
		return employee_fname;
	}
	public void setEmployee_fname(String employee_fname) {
		this.employee_fname = employee_fname;
	}

        public String getEmployee_lname() {
		return employee_lname;
	}
	public void setEmployee_lname(String employee_lname) {
		this.employee_lname = employee_lname;
	}
	public String getEmployee_address() {
		return employee_address;
	}
	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}
	public String getEmployee_city() {
		return employee_city;
	}
	public void setEmployee_city(String employee_city) {
		this.employee_city = employee_city;
	}

	
}
