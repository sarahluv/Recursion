/*******************************************************************************
Name: Sarah Redmon
Date: 4/30/19
Instructor: Ms. Tucker
Class: FileNameException
Purpose: To use recursive methods to show directory of files
*******************************************************************************
*/

/*------------------------------------------------------------------------------
       FEEDBACK FROM INSTRUCTOR:
       Contains compile errors.
------------------------------------------------------------------------------*/

import java.io.File;

public class FileNameEncryption implements Encryptable
{		

	/* ---------------------------------------------------------------------------
	 *	Class Data:
	 *
	 *  fullDirectory:   Formattted output which represents the directory structure
	 *	directorList[ ]: Array of File objects for the directory structure
	 * --------------------------------------------------------------------------*/

	 private String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H",
        "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
        "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i",
        "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
        "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        private String[] keyword = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O",
        "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", 
        "B", "N", "M", "q", "w", "e", "r", "t", "y", "u", "i", "o",
        "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", 
        "b", "n", "m", "7", "8", "9", "4", "5", "6", "1", "2", "3", "0"};
	 
        private String fullDirectory = "";
	private File directoryList[ ];
	private boolean isEncrypted;
	private String mainDirectory;

	/* ---------------------------------------------------------------------------
	 *	THIS IS A RECURSIVE METHOD - DO NOT CHANGE THE PARAMETERS 
	 *	OR RETURNED DATA TYPE.
	 *
	 *  RECUSION IS NOT USED FOR FILES IN THE STRUCURE - ONLY FOLDER PROCESSING
	 *  IS RECURSIVE.
	 *
	 *  Parameters:
	 *		directory: A File object which is an array of File objects (files and folders)
	 *	    level:     Used to tab at the appropriate level in the display.
	 * --------------------------------------------------------------------------*/
		
	private void createFullDirectory(File[] directory, int index)  
     { 		
 		 createFullDirectory(directory, index);
 		 String num = "";
 		 File nextItem;
 		 nextItem = directory[index];
 		 
 		 if (index != directory.length) {
 		     createFullDirectory(directory, index + 1);
 		 }
	 }  


			
	 /* ---------------------------------------------------------------------------
	 *	Class constructor 
	 *
	 *	The directory is validated and then a File array is created if valid.
	 *  The createFullDirectory method is called to create the formatted display of
	 *  of the directory.
	 *
	 *  Students are not permitted to change this constructor.
	 *
	 * --------------------------------------------------------------------------*/		

    public FileNameEncryption(String path)
    {
                  
		if(path != null && path != "")
		{	
			File maindir = new File(path);
			
			if	(  maindir.exists() && maindir.isDirectory()  ) 
			{	directoryList = maindir.listFiles(); 
				fullDirectory = "";
				createFullDirectory(directoryList, 0);
				isEncrypted = false;
			}
		}
	}
	
	 /* ---------------------------------------------------------------------------
	 *	Accessors for fullDirectory and isEncrypted
	 *
	 * --------------------------------------------------------------------------*/		
	
	public String getFullDirectory()
	{
		return fullDirectory;
	}
	public boolean directoryIsEncrypted()
	{
		return isEncrypted;
	}
	 /* ---------------------------------------------------------------------------
	 *	encrypt method for fullDirectory
	 *
	 * --------------------------------------------------------------------------*/		
		
	public void encrypt()
	{
	    String encrypText = "";
            for (int i = 0; i < mainDirectory.length(); i++) {
                if (mainDirectory.charAt(i) == (char)32){
                    encrypText += " ";
                } else {
                    int counter = 0;
                    char a = 0;
                    for (int j = 0; j < alpha.length; j++) {
                        if (alpha[i].equals(String.valueOf(encrypText.charAt(a)))) {
                            encrypText += keyword[a];
                            break;
                        } else {
                            counter++;
                        }
                    }
                }
            }
	}
   

	 /* ---------------------------------------------------------------------------
	 *	decrypt method for fullDirectory
	 *
	 * --------------------------------------------------------------------------*/		
   
        public String decrypt()
	{
	    String decrypText = "";
            for (int i = 0; i < mainDirectory.length(); i++) {
                if (mainDirectory.charAt(i) == (char)32){
                    decrypText += " ";
                } else {
                    int counter = 0;
                    char a = 0;
                    for (int j = 0; j < alpha.length; j++) {
                        if (keyword[i].equals(String.valueOf(decrypText.charAt(a)))) {
                            decrypText += alpha[a];
                            break;
                        } else {
                            counter++;
                        }
                    }
                }
            }
	    return "";
	}

}


    
