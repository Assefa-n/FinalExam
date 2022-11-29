import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

/************************************************************
 *  Name:           Naga Assefa
 *  Class:          CS30S
 * 
 *  Assignment:     A3
 * 
 *  Description:    This is the driver for the sports 
 *                  accociation between the players and
 *                  the teams
 * 
 *************************************************************/

class PlayerTeamDriver  {

    public static void main(String[] args) throws IOException{
        // ***** constants *******
        // ***** variables *****
            String strin = "";              // string fro keyboard input
            String delim = "[ ]+";          // delimiter for splitting input records
            String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system
            String nl = System.lineSeparator();

        // Player class variables
            String nam;        // the name of the player from the file
            int num;           // the number of the player from the file
            
        // Team class variables
            String TeaNam;    // the name of the team
            
        // ***** objects *****
        
        // OOP Classes
            ProgramInfo pi = new ProgramInfo("April Exams Q3"); // program information  
          // Players and teams from file
            ArrayList<Players> Pl = new ArrayList<>(); 
            Teams Tm; 

        // file io buffers for reading and writing to text files
            BufferedReader fin = new BufferedReader(new FileReader("April2022Q3.txt"));
        
        // ***** print banners *****
          System.out.println(pi.getBanner());
          
        // ***** Get Input *****
        
          //get team name from file
            strin = fin.readLine();
            TeaNam = strin;
            Tm = new Teams(TeaNam);

        // get player name and number from file
          // control variable
            strin = fin.readLine();
        
        while(strin != null){
            // Turn strin into tokens
                tokens = strin.split(delim);
            
            // parse string input into string and double
                nam= tokens[0];
                num = Integer.parseInt(tokens[1]);

            // add new product to the array list
                Pl.add(new Players(nam, num));
            
            // update control variable           
                strin = fin.readLine();
        }// end eof loop

        // ***** Main Processing *****
        
        // one to many accociation
          for(Players p: Pl){
            associations(Tm, p);
         }// end enhanced for loop

        // ***** Print Formatted Output *****
        
            System.out.println(Tm + nl);
            System.out.println("Player List:");
            System.out.println(Tm.getPlayers()+nl);
            System.out.println("Team name: " + Tm.getName());
    
        // ***** Closing Message *****

            System.out.println();
            System.out.println(pi.getClMes());
        //fout.println("End of Processing");

        // **** close io buffers *****
            fin.close();
        //fout.close();
    } // end main 

    public static void associations( Teams t,Players p){
        p.setTeam(t);
        t.addPlayers(p);
    }// end associations

} // end FormatTemplate
