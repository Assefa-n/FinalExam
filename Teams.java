import java.util.ArrayList;

/********************************************************************
 * Programmer: Naga Assefa
 * Class:  CS30S
 *
 * Assignment: April Exam question 3 
 *
 * Description: This the class for the Teams in a sports legue
 ***********************************************************************/

// import libraries as needed here

public class Teams {
    //*** Class Variables ***
    private ArrayList<Players> players; // declaration of the 
                                        //list of players on a team
    //*** Instance Variables ***
    private String name; // Name of the team
    
    //*** Constructors ***
    public Teams(){
        players = new ArrayList<>(); // instansiating the list
        name = "unknown";
    }// end no-arg constructor

    public Teams(String n){
        players = new ArrayList<>(); // instansiating the list
        name = n;
    }// end full-arg constructor
    
    //*** Getters ***
    /*****************************************
     * Description: This method gets the name of the Team
     * 
     * Interface:
     * 
     * @return String: name of team
     * ****************************************/
    public String getName(){
        return this.name;
    }// end getName()

    /*****************************************
     * Description: This method gets the name of the players
     * 
     * Interface:
     * 
     * @return  Araylist<Players>: get the players on the team
     * ****************************************/
    public ArrayList<Players> getPlayers(){
        return this.players;
    } // end getPlayers()
    
    //*** Setters ***
    /*****************************************
     * Description: set the name of the team
     * 
     * Interface:
     * 
     * @param        String new name for the team
     * ****************************************/
    public void setName(String n){
        this.name = n;
    }// end setName

    /*****************************************
     * Description: add players to the team
     * 
     * Interface:
     * 
     * @param        Players add players to the team
     * ****************************************/

    public void addPlayers(Players p){
        players.add(p);
    }// end addPlayers

    /*****************************************
     * Description: remove a player from the team
     * 
     * Interface:
     * 
     * @param        Players remove players from a team
     * ****************************************/
    public void removePlayer(Players p){
        players.remove(p);
    }// end remove players

    // **********other metodes*********
    /*****************************************
     * Description: return state details about the Team
     *              uses StringBuilder to construct the 
     *              record then return the toString of the 
     *              StringBuilder object
     * 
     * @param       toString() of Team
     * ****************************************/
    @Override
    public String toString(){
        String nl = System.lineSeparator(); // new line charector 

        StringBuilder s = new StringBuilder(); //

        s.append( getName() + nl);
        for(Players p: this.players){
            s.append( p+nl);
        }// end enhanced for loop
        s.append( "*-----------------------*");
        return s.toString();
    }// end toStrin()
} // end of public class
