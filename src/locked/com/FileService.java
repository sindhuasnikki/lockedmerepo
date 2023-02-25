package locked.com;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileService {
            Scanner sc = new Scanner(System.in);
            // list of files names in an ascending order
            
            public void listofFiles() {
         		System.out.println("\n List of files and Folder\n");
         		File folder=new File("I:\\");
         		File[]listofFiles=folder.listFiles();
         		
         		for(File file:listofFiles) {
         			
         			if(file.isDirectory()) {
         				System.out.println(file.getName());
         			}
         			
         			else if(file.isFile()) {
         				System.out.println(file.getName());
         			}
         		}
         	}
            public void CreatenewFiles() {
        		System.out.println("Enter file name for creating new file");
        		String filename1= sc.next();
        		     try {
        			File f1 = new File("I:\\"+ filename1+ ".txt");
        			if(f1.createNewFile()) {
        				System.out.println("File created Successfully\n");
        			} 
        			else {
        				if(f1.exists()) {
        					System.out.println("File Already Exists");
        				}
        				else {
        					System.out.println("File doesnot exists");
        				}
        				
        				 }
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
        		}
            public void DeleteFile() {
              	 System.out.println("Enter the file name for delete");
              	       // Scanner scanner=new Scanner(System.in);
           			String filename2=sc.nextLine();

           			File f2 = new File("I:\\" + filename2 + ".txt");
           			if(f2.delete()) {
           				System.out.println("File deleted Successfully\n");
           			}else {
           				System.out.println("Failed to delete the File");
           			}
           		
           	}
            public void SearchFile() {
        		System.out.println("Enter the file name for search");
        		String filename3=sc.nextLine();

        		File f3 = new File("I://" + filename3 + ".txt");
        		if(f3.exists()) {
        			System.out.println("File found");
        		}else {
        			System.out.println("File not found");
        		}
        		
        	}
            public  void SortingofFiles() {
        		File fileDir=new File("I://");
        		if(fileDir.isDirectory()) {
        			         List<String> listFile=Arrays.asList(fileDir.list());
        			        System.out.println("Listing file unsorted");
        			        for(String f:listFile) {
        			        	System.out.println(f);
        			        }
        			        Collections.sort(listFile);
        			        System.out.println("-------------------------------------------");
        			        System.out.println("sorting by filename in ascending order");
        			        for(String f:listFile) {
        			        	System.out.println(f);
        			        }
        			        System.out.println("-------------------------------------------");
        			        System.out.println("Sorting by filename in descending order");
        			        Collections.sort(listFile,Collections.reverseOrder());
        			        for(String f:listFile) {
        			        	System.out.println(f);
        			        } 	
        				
        			}
        		else {
        			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
        		}
        		
        		}
}

