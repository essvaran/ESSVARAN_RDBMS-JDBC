package com.solution;

import java.util.Scanner;

public class DbDriver {

	public static void main(String[] args) {

		//Creating an object for the service class
		DBOperationsService dbo = new DBOperationsService("jdbc:mysql://localhost:3306/GL", "root", "Sea@0071");

		int choice = 0;
		Scanner sc = new Scanner(System.in);

		while(choice != 6)
		{
			System.out.println("Enter 1 to add Employee");
			System.out.println("Enter 2 to view all employee ");
			System.out.println("Enter 3 to update name and mobile of employee");
			System.out.println("Enter 4 to delete specific employee");
			System.out.println("Enter 5 to delete all employee");
			System.out.println("Enter 6 to exit");
			System.out.print("Enter your choice from above : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: 
			{
				dbo.addEmployee();
				break;
			}
			case 2 :
			{
				dbo.displayAll();
				break;
			}
			case 3 :
			{
				dbo.updateNameMobile();
				break;
			}
			case 4 :
			{
				dbo.deleteSpecific();
				break;
			}
			case 5 :
			{
				dbo.deleteAll();
				break;
			}
			case 6 :
			{
				break;
			}
			default :
			{
				System.err.println("Invalid choice please try again!!!!!");
			}
			}
		}
		sc.close();

	}

}
/*
 * This is the output that was executed by me....
 Thu Jan 18 19:39:41 IST 2024 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
Connected successfully...
-----------------------------------
Enter 1 to add Employee
Enter 2 to view all employee 
Enter 3 to update name and mobile of employee
Enter 4 to delete specific employee
Enter 5 to delete all employee
Enter 6 to exit
Enter your choice from above : 2
The employee records are...
1    Prasanth            pk@gmail.com             1234512345
2    LogaPriya           logo@gmail.com           6363747465
3    Akash               akash@gmail.com          9090909090
4    Sanjai              sanju@gmail.com          1231231
5    Sabari              Sabarai@gmail.com        6374480909
-----------------------------------
Enter 1 to add Employee
Enter 2 to view all employee 
Enter 3 to update name and mobile of employee
Enter 4 to delete specific employee
Enter 5 to delete all employee
Enter 6 to exit
Enter your choice from above : 3
Enter id where update : 3
Enter name to update : Karthik
Enter mobile number to update : 1234567890
update employee set name = 'Karthik' , phone_number = '1234567890' where id = 3 
Column altered successfully...
-----------------------------------
Enter 1 to add Employee
Enter 2 to view all employee 
Enter 3 to update name and mobile of employee
Enter 4 to delete specific employee
Enter 5 to delete all employee
Enter 6 to exit
Enter your choice from above : 2
The employee records are...
1    Prasanth            pk@gmail.com             1234512345
2    LogaPriya           logo@gmail.com           6363747465
3    Karthik             akash@gmail.com          1234567890
4    Sanjai              sanju@gmail.com          1231231
5    Sabari              Sabarai@gmail.com        6374480909
-----------------------------------
Enter 1 to add Employee
Enter 2 to view all employee 
Enter 3 to update name and mobile of employee
Enter 4 to delete specific employee
Enter 5 to delete all employee
Enter 6 to exit
Enter your choice from above : 1
Enter number of records you want to insert  : 2
Enter id,name,email,mobile number of employee (1) seprated by space : 
6 Santhosh sanid@gmail.com 9879879870
Enter id,name,email,mobile number of employee (2) seprated by space : 
7 Mani mani@gmail.com 1231789090
-----------------------------------
Enter 1 to add Employee
Enter 2 to view all employee 
Enter 3 to update name and mobile of employee
Enter 4 to delete specific employee
Enter 5 to delete all employee
Enter 6 to exit
Enter your choice from above : 2
The employee records are...
1    Prasanth            pk@gmail.com             1234512345
2    LogaPriya           logo@gmail.com           6363747465
3    Karthik             akash@gmail.com          1234567890
4    Sanjai              sanju@gmail.com          1231231
5    Sabari              Sabarai@gmail.com        6374480909
6    Santhosh            sanid@gmail.com          9879879870
7    Mani                mani@gmail.com           1231789090
-----------------------------------
Enter 1 to add Employee
Enter 2 to view all employee 
Enter 3 to update name and mobile of employee
Enter 4 to delete specific employee
Enter 5 to delete all employee
Enter 6 to exit
Enter your choice from above : 4
Enter the number of id you have to delete : 2
Enter 2 id's to delete : 
3 4
Column altered successfully...
Column altered successfully...
-----------------------------------
Enter 1 to add Employee
Enter 2 to view all employee 
Enter 3 to update name and mobile of employee
Enter 4 to delete specific employee
Enter 5 to delete all employee
Enter 6 to exit
Enter your choice from above : 2
The employee records are...
1    Prasanth            pk@gmail.com             1234512345
2    LogaPriya           logo@gmail.com           6363747465
5    Sabari              Sabarai@gmail.com        6374480909
6    Santhosh            sanid@gmail.com          9879879870
7    Mani                mani@gmail.com           1231789090
-----------------------------------
Enter 1 to add Employee
Enter 2 to view all employee 
Enter 3 to update name and mobile of employee
Enter 4 to delete specific employee
Enter 5 to delete all employee
Enter 6 to exit
Enter your choice from above : 5
Column altered successfully...
-----------------------------------
Enter 1 to add Employee
Enter 2 to view all employee 
Enter 3 to update name and mobile of employee
Enter 4 to delete specific employee
Enter 5 to delete all employee
Enter 6 to exit
Enter your choice from above : 2
No records found in the employee table...
-----------------------------------
Enter 1 to add Employee
Enter 2 to view all employee 
Enter 3 to update name and mobile of employee
Enter 4 to delete specific employee
Enter 5 to delete all employee
Enter 6 to exit
Enter your choice from above : 6

 */
 