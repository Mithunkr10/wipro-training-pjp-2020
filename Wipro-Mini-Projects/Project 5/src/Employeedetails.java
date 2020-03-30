import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empid,age,salary;
		String name;
		int n=0;
		Scanner in=new Scanner(System.in);
		while(n!=3) {
		System.out.println("Main Menu\n1.Add new Employee\n2.Display All\n3.Exit");
		
		n=in.nextInt();
		
		switch(n) {
		case 1:System.out.println("Enter Employee ID:");
				empid=in.next();
				System.out.println("Enter Employee name:");
				name=in.next();
				System.out.println("Enter employee age:");
				age=in.next();
				System.out.println("Enter Employee Salary:");
				salary=in.next();
				try { File f=new File("C:\\Users\\Mithun\\Desktop\\prgms\\IO operations\\src\\Employee.txt");
					FileWriter fw=new FileWriter(f,true);
					fw.write("\n");
				fw.write(empid+"\t");
				fw.write(name+"\t");
				fw.write(age+"\t");
				fw.write(salary+"\t");
				fw.write("\n");
				fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch(StringIndexOutOfBoundsException e)
				{
					e.printStackTrace();
				}
				finally{System.out.print("\n");}
				break;
		case 2: System.out.println(" -----Report----- ");
				try {
					BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mithun\\Desktop\\prgms\\IO operations\\src\\Employee.txt"));
					String line = null;
					while ((line = br.readLine()) != null) {
					    System.out.println(line);
					}br.close();
				
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				catch(NoSuchElementException e) {
					
				}
				System.out.println("\n----End Of Report----");
				break;
		case 3: System.exit(0);
				break;
		default:System.out.println("Invalid Input");
		break;
		}
		}
	
	in.close();
	}

	 static boolean isNumeric(String data) {
		// TODO Auto-generated method stub
		boolean numeric = true;

        try {
            Double.parseDouble(data);
        } catch (NumberFormatException e) {
            numeric = false;
        }
		return numeric;
	}

}
