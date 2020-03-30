package list;

public class Employee {
int EmpId;
String EmpName,email,gender;
float salary;
Employee(){}
Employee(int id,String name,String email,String gender,float sal){
	this.EmpId=id;
	this.EmpName=name;
	this.email=email;
	this.gender=gender;
	this.salary=sal;
}
void GetEmployeeDetails() {
	System.out.println("Employee ID:"+EmpId+"\nEmployee Name:"+EmpName+"\nEmail ID:"+email+"\nGender:"+gender+"\nSalary:"+salary);
}
public int getEmpId() {
	return EmpId;
}

public void setEmpId(int empId) {
	EmpId = empId;
}

public String getEmpName() {
	return EmpName;
}

public void setEmpName(String empName) {
	EmpName = empName;
}

public String getEmpEmail() {
	return email;
}

public void setEmpEmail(String empEmail) {
	email = empEmail;
}

public String getEmpGender() {
	return gender;
}

public void setEmpGender(String empGender) {
	gender = empGender;
}

public float getEmpSalary() {
	return salary;
}

public void setEmpSalary(float empSalary) {
	salary = empSalary;
}


}