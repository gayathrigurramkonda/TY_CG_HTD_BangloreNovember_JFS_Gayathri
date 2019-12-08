class Employee {
String empName;
int empAge;
double empSalary;
Employee(String name,int age,double Salary ){
	empName=name;
	empAge=age;
	empSalary=Salary;
}
void details() {
	System.out.println("Name: "+empName+ "Age:"+empAge+"Salary:"+empSalary);
}



}
