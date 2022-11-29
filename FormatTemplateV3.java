import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Naga Assefa
 *  Class:          CS30S
 * 
 *  Assignment:     Ax Qy
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class FormatTemplateV3 {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Naga Assefa" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Ax Qy" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
        int n = 2220;
        StringBuilder s = new StringBuilder(); //

        
        System.out.println(n);
        while( n != 2580){
            n+= 10;
            s.append( n + nl);
        }// end while
        System.out.println(s);
    // **** close io buffers *****)
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
