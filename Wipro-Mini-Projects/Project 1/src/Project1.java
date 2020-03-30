import java.util.Scanner;
public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Empno[]= {1001,1002,1003,1004,1005,1006,1007};
char DesignationCode[]= {'e','c','k','r','m',};
String[] Empname= new String[7];
String[] Joindate=new String[7];
String[] Department=new String[7];
int Basic[]= new int[7];
int HRA[]=new int[7];
int IT[]= new int[8];
String[] Designation= new String[5];
int DA[]= new int[5];
System.out.println("Enter Empid"+args[0]);
//Scanner in=new Scanner(System.in);
//int n=in.nextInt();
int n=Integer.parseInt(args[0]);
for(int i=0;i<DesignationCode.length;i++)
{
	if(DesignationCode[i]=='e')
	{
		Designation[i]="Employee";
		DA[i]=20000;
	}
	else if(DesignationCode[i]=='c')
	{
		Designation[i]="Consultant";
		DA[i]=32000;
	}
	else if(DesignationCode[i]=='k')
	{
		Designation[i]="Clerk";
		DA[i]=12000;
	}
	else if(DesignationCode[i]=='r')
	{
		Designation[i]="Receptionist";
		DA[i]=15000;
	}
	else if(DesignationCode[i]=='m')
	{
		Designation[i]="Manager";
		DA[i]=40000;
	}
	
}
	
for(int i=0;i<Empno.length;i++)
{
	if(Empno[i]==1001)
	{
		Empname[i]="Ashish";
		Joindate[i]="01/04/2009";
		//DesignationCode[i]='e';
		Department[i]="R&D";
		Basic[i]=20000;
		HRA[i]=8000;
		IT[i]=3000;
	}
	if(Empno[i]==1002)
	{
		Empname[i]="Shushma";
		Joindate[i]="23/08/2012";
		//DesignationCode[i]='c';
		Department[i]="PM";
		Basic[i]=30000;
		HRA[i]=12000;
		IT[i]=9000;
	}
	if(Empno[i]==1003)
	{
		Empname[i]="Rahul";
		Joindate[i]="12/11/2008";
		//DesignationCode[i]='k';
		Department[i]="Acct";
		Basic[i]=10000;
		HRA[i]=8000;
		IT[i]=1000;
	}
	if(Empno[i]==1004)
	{
		Empname[i]="Chahat";
		Joindate[i]="29/09/2013";
		DesignationCode[i]='r';
		Department[i]="Front Desk";
		Basic[i]=12000;
		HRA[i]=6000;
		IT[i]=2000;
	}
	if(Empno[i]==1005)
	{
		Empname[i]="Ranjan";
		Joindate[i]="16/07/2005";
		//DesignationCode[i]='m';
		Department[i]="Engg";
		Basic[i]=50000;
		HRA[i]=20000;
		IT[i]=20000;
	}
	if(Empno[i]==1006)
	{
		Empname[i]="Suman";
		Joindate[i]="1/4/2000";
		//DesignationCode[i]='e';
		Department[i]="Manufacturing";
		Basic[i]=23000;
		HRA[i]=9000;
		IT[i]=4400;
	}
	if(Empno[i]==1007)
	{
		Empname[i]="Tanmay";
		Joindate[i]="12/06/2006";
		//DesignationCode[i]='c';
		Department[i]="PM";
		Basic[i]=29000;
		HRA[i]=12000;
		IT[i]=10000;
	}
}


	if(n==1001)
	{
		System.out.println("Empno\tEmpname\tDepartment\tDesignation\tSalary");
		System.out.print(Empno[0]+"\t"+Empname[0]+"\t"+Department[0]+"\t");
		
		int salary=0;
		
			System.out.print(Designation[0]+"\t");
				salary=Basic[0]+HRA[0]+DA[0]-IT[0];
				System.out.print(salary+"\n");
	}
	else if(n==1002)
	{
		System.out.println("Empno\tEmpname\tDepartment\tDesignation\tSalary");
		System.out.print(Empno[1]+"\t"+Empname[1]+"\t"+Department[1]+"\t");
		
		int salary=0;
			System.out.print(Designation[1]+"\t");
				salary=Basic[1]+HRA[1]+DA[1]-IT[1];
				System.out.print(salary+"\n");
	}
	else if(n==1003)
	{
		System.out.println("Empno\tEmpname\tDepartment\tDesignation\tSalary");
		System.out.print(Empno[2]+"\t"+Empname[2]+"\t"+Department[2]+"\t");
		
		int salary=0;
			System.out.print(Designation[2]+"\t");
				salary=Basic[2]+HRA[2]+DA[2]-IT[2];
				System.out.print(salary+"\n");
	}
	else if(n==1004)
	{
		System.out.println("Empno\tEmpname\tDepartment\tDesignation\tSalary");
		System.out.print(Empno[3]+"\t"+Empname[3]+"\t"+Department[3]+"\t");
		
		int salary=0;
			System.out.print(Designation[3]+"\t");
				salary=Basic[3]+HRA[3]+DA[3]-IT[3];
				System.out.print(salary+"\n");
	}
	else if(n==1005)
	{
		System.out.println("Empno\tEmpname\tDepartment\tDesignation\tSalary");
		System.out.print(Empno[4]+"\t"+Empname[4]+"\t"+Department[4]+"\t");
		
		int salary=0;
			System.out.print(Designation[4]+"\t");
				salary=Basic[4]+HRA[4]+DA[4]-IT[4];
				System.out.print(salary+"\n");
	}
	else if(n==1006)
	{
		System.out.println("Empno\tEmpname\tDepartment\tDesignation\tSalary");
		System.out.print(Empno[5]+"\t"+Empname[5]+"\t"+Department[5]+"\t");
		
		int salary=0;
			System.out.print(Designation[0]+"\t");
				salary=Basic[5]+HRA[5]+DA[0]-IT[5];
				System.out.print(salary+"\n");
	}
	else if(n==1007)
	{
		System.out.println("Empno\tEmpname\tDepartment\tDesignation\tSalary");
		System.out.print(Empno[6]+"\t"+Empname[6]+"\t"+Department[6]+"\t");
		
		int salary=0;
			System.out.print(Designation[1]+"\t");
				salary=Basic[6]+HRA[6]+DA[1]-IT[6];
				System.out.print(salary+"\n");
	}
	else
		System.out.println("There is no employee with empid:"+n);
//in.close();
}

}
