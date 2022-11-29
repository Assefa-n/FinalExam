/********************************************************************
 * Programmer: Naga Assefa
 * Class:  CS30S
 *
 * Assignment: April Exam question 3 
 *
 * Description: This the class for the players in a sports legue
 ***********************************************************************/

// import libraries as needed here

public class Players {
    //*** Class Variables ***
    private Teams team;   // the players team
    
    //*** Instance Variables ***
    private String name;  // name of player
    private int number;   // number of player
    
    
    //*** Constructors ***

    public Players(){
        name = "unknown";
        number = -1;

    }// end no arg constructor

    public Players(String n, int num){

        name = n;
        number = num;

    }// end full arg constructor
    //*** Getters ***
    /*****************************************
     * Description: This method gets the name of the Players
     * 
     * Interface:
     * 
     * @return String: name of Players
     * ****************************************/
    public String getName(){

        return this.name;

    }// end getName()

    /*****************************************
     * Description: This method gets the number of the Player
     * 
     * Interface:
     * 
     * @return Int: number of player
     * ****************************************/
    public int getNumber(){

        return this.number;

    }// end getNumber()

    /*****************************************
     * Description: gets the team the player is on
     * 
     * Interface:
     * 
     * @return Teams: team the player is on
     * ****************************************/
    public String getTeam(){

        return this.team.getName();

    }// end set team

    //*** Setters ***

    /*****************************************
     * Description: set the name of the Player
     * 
     * Interface:
     * 
     * @param        String new name for the Player
     * ****************************************/
    public void setName(String n){

        this.name = n;

    } //end setName()

    /*****************************************
     * Description: set the number of the Player
     * 
     * Interface:
     * 
     * @param        String new number for the Player
     * ****************************************/
    public void setNumber(int num){

        this.number = num;

    }// end setNumber()

    /*****************************************
     * Description: sets the team the player is on
     * 
     * Interface:
     * 
     * @param        Players add players to the team
     * ****************************************/
    public void setTeam(Teams t){

        this.team = t;

    }// end setTeam();

    //*****other methodes*****
    /*****************************************
     * Description: return state details about the Team
     *              uses StringBuilder to construct the 
     *              record then return the toString of the 
     *              StringBuilder object
     * 
     * @param       toString() of Player
     * ****************************************/
    @Override
    public String toString(){
        String s = getName() +"  "+ getNumber();
        return s;

    }// end To String

} // end of public class
