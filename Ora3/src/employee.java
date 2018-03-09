
public class employee {

	private String employeename;
	private long salary;
	
	public long incrasesalary(long incrase,long employeesalary) {
		return employeesalary+=incrase;
	}
	
	public String displayinfo() {
		return this.salary+this.employeename;
	}
	public String displayinfo2() {
		return this.salary+this.employeename;
		}


	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public boolean isInSalaryRange(long salarystart,long salaryend) {
		if (this.salary<salaryend&&this.salary>=salaryend) {
			return true;
		}
		else return false;
	}
	
	public long getTax() {
		return (long)(this .salary*0.16);
	}
	
	public boolean hasHigherSalary(employee employee1) {
		if(this.salary>employee1.salary) {
			return true;
		}else return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


