
public class Ora3 {
public static void main(String[] args) {
	
//	employee employee1=new employee();
//	employe.employeename="Béla";
//	employe.salary=100;
//	
//	employee1.setEmployeename("Béla");
//	employee1.setSalary(500);
//	
//	employe.salary=employe.incrasesalary(500, employe.salary);
//	System.out.println(employe.displayinfo(employe.salary, employe.employeename));
//	
//	employee employee2=new employee();
//	
//	employee2.setEmployeename("Pista");
//	employee2.setSalary(1000);
//	
//	System.out.println(employee1.displayinfo()+employee2.displayinfo());
//	
//	System.out.println(employee1.isInSalaryRange(400,1000)+" "+employee1.getTax()+" "+employee1.hasHigherSalary(employee2));
//	
	
	
	employee[] employeearray=new employee[10];
	long max=0;
	String rich=" ";
	long range=0;
	double avg=0;
	double tax=0;
	
	for (int i = 0; i < employeearray.length; i++) {
		employeearray[i]=new employee();
		employeearray[i].setSalary(i*1000+i*200);
		employeearray[i].setEmployeename("MindlessWorker"+i);
		
		if(employeearray[i].getSalary()>max) {
			max=employeearray[i].getSalary();
			rich=employeearray[i].getEmployeename();
		}
		if(employeearray[i].getSalary()>1000&&employeearray[i].getSalary()<5000) {
			range++;
		}
		avg=avg+employeearray[i].getSalary();
		tax=tax+employeearray[i].getSalary()*0.16;
		
	}
	avg=avg/employeearray.length;
	System.out.println(max+rich);
	System.out.println(range);
	System.out.println(avg);
	System.out.println(tax);
	
	
	
}
	
}

