package textfiles;
import java.io.IOException;

public class FileData {

   
    public static void main(String[] args) throws IOException  {
       
        String file_name = "C:/Users/Kishor/Documents/NetBeansProjects/ textfiles/test.txt";
        
        try {
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();
            
        int i;
            for ( i=0; i < aryLines.length; i++ ) {
            System.out.println(aryLines[i]);
        }
            
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
        
        //========================================
        //     Write to File
        //========================================
        
        try {
            WriteFile data = new WriteFile( file_name , true );
            data.writeToFile( "This is another line of text" );
            System.out.println( "Text File Written To" );
        }
        
        catch (IOException e) {
            System.out.println( e.getMessage() );
        }
       
    }
    
}
