package games;

import java.util.Random;

import javax.swing.JOptionPane;

public class BlackJack {
	
public static void main(String [] args){
    Random rand = new Random();
	
	int cardOne = rand.nextInt(10)+1; 
	int cardTwo = rand.nextInt(10)+1;
	int cardTotal = cardOne + cardTwo;
	
	int result = JOptionPane.showConfirmDialog(null, "Card one: "+ cardOne + "\n Card two: "+ cardTwo
		 + "\n Overall Card Total: "+ cardTotal + "\n Would you like to Hit?",null, JOptionPane.YES_NO_OPTION);
	
	if (result == JOptionPane.YES_OPTION){
		boolean keepGoing = true;
		while(keepGoing = true){
		cardTotal += rand.nextInt(10)+1;
		JOptionPane.showMessageDialog(null, cardTotal);
		}
	}
	else{
		JOptionPane.showMessageDialog(null, "Goodbye");
	}
  }
}
