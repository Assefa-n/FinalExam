/********************************************************************
 * Programmer:    Naga Assefa
 * Class: CS30S
 *
 * Assignment: ProgramInfo
 *
 * Description: program information class to print
 *  banner and closing message
 ***********************************************************************/

// import libraries as needed here

public class ProgramInfo {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
     private String assignment;               // the name of the assignent for teh banner
     
    //*** Constructors ***
    
    public ProgramInfo(String a){
        assignment = a;
        
    }  // end constructor
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    //*** Getters ***
    // spetial  'getters'
    public String getBanner(){
       String St;
       String nl = System.lineSeparator();
       
        St = "*****************************" + nl;
        St += "Name:        Naga" + nl;
        St += "Class:       CS30S" + nl;
        St += "Assignment:  "+ assignment + nl;
        St += "*****************************" + nl + nl;
       return St;
    }// end getBanner()
    
    /*****************************************
    * Description: create and return a string for the closing message
    * 
    * Interface:
    * 
    * @return closingMessage  string containing the closing message
    * ****************************************/ 
    public String getClMes(){
        String s = "end of processing";
        return s;
    }// end getCLMes()
    
} // end of public class
