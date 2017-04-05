package Challenges;
import javax.swing.*;
public class Challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dN = JOptionPane.showInputDialog(null, "How many delegates does this state have?");
		int delegateNumber = Integer.parseInt(dN);
		
		String cOP = JOptionPane.showInputDialog(null, "What percent of the votes did canidate 1 receive? (Decimal Number Please)");
		int canOnePercent = Integer.parseInt(cOP);
		
		String cTP = JOptionPane.showInputDialog(null, "What percent of the votes did canidate 1 receive?(Decimal Number Please)");
		int canTwoPercent = Integer.parseInt(cTP);
		
		int canThreePercent = 1 - canTwoPercent - canOnePercent;
		
		int canOneDelegates = 0;
		int canTwoDelegates = 0;
		int canThreeDelegates = 0;
		
		if(canOnePercent > .5){
			canOneDelegates = delegateNumber;
			 canTwoDelegates = 0;
			 canThreeDelegates = 0;
		}
		else if(canOnePercent<.15){
			canOneDelegates = 0;
		}
		if(canTwoPercent > .50){
			canTwoDelegates = delegateNumber;
			canThreeDelegates = 0; 
		}
		else if(canTwoPercent<.15){
			canTwoDelegates = 0;
		}
		if(canThreePercent > .50){
			canThreeDelegates = delegateNumber;
		}
		else if(canThreePercent<.15){
			canThreeDelegates = 0;
		}
		
	}

}
