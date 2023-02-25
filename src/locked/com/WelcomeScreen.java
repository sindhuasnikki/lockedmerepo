package locked.com;

import java.io.File;
import java.util.Scanner;

public class WelcomeScreen {

	   public static void main(String[] args) {
		   System.out.println("WELCOME TO LOCKEDME.COM PROJECT");
		   System.out.println("Simplilearn Assignment : LOCKEDME.COM ");
	       System.out.println("Developer Name : SINDHUSHREE A S");
		   String filename;
           char ch;
         File directory=new File("I:\\");
         String[]flist=directory.list();
         Scanner input=new Scanner(System.in);
         FileService f1= new FileService();
         
         
         do {
			  System.out.println("Select File Option to perform any operation:\n");
			  System.out.println("1.Display the list of files");
			  System.out.println("2.Create new File");
			  System.out.println("3.Delete File");
			  System.out.println("4.Search File");
			  System.out.println("5.Sorting of File");
			  System.out.println("6.Exit");
			  
			  int choice=input.nextInt();
			  switch(choice){
			  case 1:
				  f1.listofFiles();
				  break;
			  case 2:
				  f1.CreatenewFiles();
				  break;
			  
			  case 3:
				  f1.DeleteFile();
					break;
					
			  case 4:
					f1.SearchFile();
					break;
			  case 5:
				  f1.SortingofFiles();
				  break;
			  case 6:
				  System.out.println("Thank you user");
				  break;
			 default:
				  System.out.println("your input number is incorrect .Choose correct number");
				  break;
			  }
			  System.out.println("Do you want to continue Type(y or n)\n");
			  ch=input.next().charAt(0);
		} while ( ch=='y'||ch=='n');
	}		

	}


