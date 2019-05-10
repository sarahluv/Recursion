/* ---------------------------------------------------------------------------
 *	This is a sample program to use the FileNameEncryption class
 *	
 *  This program simply:
 *		--Instantiates a FileNameEncryption object
 *      --Encrypts the file names as a security test
 *		--Decrypts the file names as a security test
 * --------------------------------------------------------------------------*/
 
 
  
import java.io.File; 
  
public class DirectoryDriver  
{ 

    
    public static void main(String[] args) 
    { 
		/* ---------------------------------------------------------------------------
		 *	 A sample folder hierarchy was provided (with files and embedded folders)
		 *   The name of the top level hierarchy is: Recursion Test Folder
		 *
		 *   This assignment used the Java File class.  Students should make sure
		 *   they are familiar with that class.
		 * --------------------------------------------------------------------------*/
 
  
		/* ---------------------------------------------------------------------------
		 *	 A FileNameEncryption object is instantiated
		 * --------------------------------------------------------------------------*/	
        
		String mainDirectory = "Recursion Test Folder"; 
		FileNameEncryption directoryToList = new FileNameEncryption(mainDirectory);
		
      
        System.out.println("------------------------------------------------------------------------\n"); 
        System.out.println("Files and Folders from: " + mainDirectory); 
        System.out.println("------------------------------------------------------------------------\n"); 
   
		/* ---------------------------------------------------------------------------
		 *	 The full directory of displayed.
		 * --------------------------------------------------------------------------*/
    

            System.out.println(directoryToList.getFullDirectory()); 

		/* ---------------------------------------------------------------------------
		 *	 Encrypt the directory
		 * --------------------------------------------------------------------------*/
    
           directoryToList.encrypt(); 
           System.out.println(directoryToList.getFullDirectory()); 


		/* ---------------------------------------------------------------------------
		 *	 Decrypt the directory
		 * --------------------------------------------------------------------------*/
    
           directoryToList.decrypt(); 
           System.out.println(directoryToList.getFullDirectory()); 
			
       }  
    } 



