
//The Move class is where I control everything related to attacks
import java.util.*;
public class Move {
	
	private String attackName;
	private int energyCost;
	private int damage;
	private String special; 
	private String[]attack = new String[4];
	
    public Move(String[] tempArray,int i) { //each attack is 4 pieces of data
    	int numAttacks = Integer.parseInt(tempArray[5]);
    	attackName = tempArray[6+i];
    	energyCost = Integer.parseInt(tempArray[7+i]);
    	damage = Integer.parseInt(tempArray[8+i]);
    	special = tempArray[9+i];
    	attack[0] = attackName;
    	attack[1] = ""+energyCost;
    	attack[2] = ""+damage;
    	attack[3] = special;
    	
    }//end Move constructor	
    //getters and setters are all below here
    public String[]getAttack(){
    	return attack;
    }//end getAttack
    
    public String getAttackName(){
    	return attackName;
    }//end getAttackName
    
    public int getAttackCost(){
    	return energyCost;
    }//end getAttackCost
  
}//end Move file